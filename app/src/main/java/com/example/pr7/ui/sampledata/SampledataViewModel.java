package com.example.pr7.ui.sampledata;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SampledataViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public SampledataViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Моё игнатьев алексей");
    }

    public LiveData<String> getText() {
        return mText;
    }
}