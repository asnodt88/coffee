package com.example.pr7.ui.sampledata;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.pr7.databinding.FragmentSampledataBinding;

public class SampledataFragment extends Fragment {

    private FragmentSampledataBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        SampledataViewModel sampledataViewModel =
                new ViewModelProvider(this).get(SampledataViewModel.class);

        binding = FragmentSampledataBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}