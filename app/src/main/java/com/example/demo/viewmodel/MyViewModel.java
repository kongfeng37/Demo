package com.example.demo.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {
    private MutableLiveData<Integer> data = new MutableLiveData<>();
    private MutableLiveData<String> dataDes = new MutableLiveData<>();

    public MutableLiveData<Integer> getData() {
        return data;
    }

    public MutableLiveData<String> getDataDes() {
        return dataDes;
    }

    public void modifyNumber(int oper) {
        data.postValue((data.getValue() != null ? data.getValue() : 0) + oper);
        dataDes.postValue("" + ((dataDes.getValue() != null ? Integer.parseInt(dataDes.getValue()) : 0) + oper));
    }
}
