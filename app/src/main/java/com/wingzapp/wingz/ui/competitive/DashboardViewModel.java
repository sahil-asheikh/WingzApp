package com.wingzapp.wingz.ui.competitive;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DashboardViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public DashboardViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Competitive Exam fragment. " +
                "It will be available Soon!!");
    }

    public LiveData<String> getText() {
        return mText;
    }
}