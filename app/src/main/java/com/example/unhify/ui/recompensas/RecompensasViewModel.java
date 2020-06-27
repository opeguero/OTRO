package com.example.unhify.ui.recompensas;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class RecompensasViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public RecompensasViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Recompensas");
    }

    public LiveData<String> getText() {
        return mText;
    }
}