package com.example.dolgan.ui.folklore;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FolkloreViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public FolkloreViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is folklore fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
