package com.vonage.tutorial.voice;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

public class IncomingCallFragment extends Fragment implements BackPressHandler {

    private IncomingCallViewModel viewModel;

    Button hangupButton;

    Button answerButton;

    public IncomingCallFragment() {
        super(R.layout.fragment_incoming_call);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        viewModel = new ViewModelProvider(requireActivity()).get(IncomingCallViewModel.class);

        hangupButton = view.findViewById(R.id.hangupButton);
        answerButton = view.findViewById(R.id.answerButton);

        viewModel.toast.observe(getViewLifecycleOwner(), it -> Toast.makeText(requireActivity(), it, Toast.LENGTH_SHORT));

        hangupButton.setOnClickListener(it -> viewModel.hangup());

        answerButton.setOnClickListener(it -> viewModel.answer());
    }


    @Override
    public void onBackPressed() {
        viewModel.onBackPressed();
    }
}
