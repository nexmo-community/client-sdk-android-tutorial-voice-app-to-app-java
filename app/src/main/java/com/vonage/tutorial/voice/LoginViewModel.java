package com.vonage.tutorial.voice;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.navigation.NavDirections;
import com.nexmo.client.NexmoClient;
import com.nexmo.client.request_listener.NexmoConnectionListener.ConnectionStatus;

public class LoginViewModel extends ViewModel {

    private NexmoClient client = NexmoClient.get();

    NavManager navManager = NavManager.getInstance();

    User user = null;

    private MutableLiveData<ConnectionStatus> _connectionStatusMutableLiveData = new MutableLiveData<>();
    public LiveData<ConnectionStatus> connectionStatusLiveData = _connectionStatusMutableLiveData;

    public LoginViewModel() {
        client.setConnectionListener((connectionStatus, connectionStatusReason) -> {
            if (connectionStatus == ConnectionStatus.CONNECTED) {
                NavDirections navDirections = LoginFragmentDirections.actionLoginFragmentToMainFragment(user.getName());
                navManager.navigate(navDirections);
                return;
            }

            _connectionStatusMutableLiveData.postValue(connectionStatus);
        });
    }

    void onLoginUser(User user) {
        this.user = user;

        if (!user.jwt.trim().isEmpty()) {
            client.login(user.jwt);
        }
    }
}
