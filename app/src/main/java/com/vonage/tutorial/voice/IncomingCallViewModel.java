package com.vonage.tutorial.voice;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.navigation.NavDirections;
import com.nexmo.client.NexmoCall;
import com.nexmo.client.request_listener.NexmoApiError;
import com.nexmo.client.request_listener.NexmoRequestListener;

public class IncomingCallViewModel extends ViewModel {

    private NavManager navManager = NavManager.getInstance();
    private CallManager callManager = CallManager.getInstance();

    private MutableLiveData<String> _toast = new MutableLiveData<>();
    public LiveData<String> toast = _toast;

    public void hangup() {
        hangupInternal(true);
    }

    @SuppressLint("MissingPermission")
    public void answer() {
        callManager.getOnGoingCall().answer(new NexmoRequestListener<NexmoCall>() {

            @Override
            public void onSuccess(@Nullable NexmoCall call) {
                NavDirections navDirections =
                        IncomingCallFragmentDirections.actionIncomingCallFragmentToOnCallFragment();
                navManager.navigate(navDirections);
            }

            @Override
            public void onError(@NonNull NexmoApiError apiError) {
                _toast.postValue(apiError.getMessage());
            }
        });
    }

    public void onBackPressed() {
        hangupInternal(false);
    }

    public void hangupInternal(Boolean popBackStack) {
        callManager.getOnGoingCall().hangup(new NexmoRequestListener<NexmoCall>() {
            @Override
            public void onSuccess(@Nullable NexmoCall nexmoCall) {
                callManager.setOnGoingCall(null);

                if (popBackStack) {
                    navManager.popBackStack(R.id.mainFragment, false);
                }
            }

            @Override
            public void onError(@NonNull NexmoApiError nexmoApiError) {
                _toast.postValue(nexmoApiError.getMessage());
            }
        });
    }
}

