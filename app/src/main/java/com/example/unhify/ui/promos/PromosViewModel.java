package com.example.unhify.ui.promos;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PromosViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public PromosViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Promociones");
    }

    public LiveData<String> getText() {
        return mText;
    }
}