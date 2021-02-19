package com.example.drawer.ui.option4;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Option4ViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public Option4ViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is slideshow fragment in slideshow view model");
    }

    public LiveData<String> getText() {
        return mText;
    }
}