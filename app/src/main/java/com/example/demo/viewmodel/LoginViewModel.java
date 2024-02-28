package com.example.demo.viewmodel;

import android.util.Log;
import android.view.View;

import com.example.demo.data.UserBean;
import com.example.demo.databinding.ActivityDatabindingBinding;

public class LoginViewModel {
    public UserBean userBean;

    public LoginViewModel(ActivityDatabindingBinding viewDataBinding) {
        userBean = new UserBean();
        viewDataBinding.setLoginViewModel(this);
    }

    public View.OnClickListener getUserListener = v -> getUser();

    public View.OnClickListener updateUserListener = v -> updateUser();

    private void getUser() {
        Log.d("kfkf", "getUser:" + userBean);
    }

    private void updateUser() {
        userBean.name.set("asd");
        userBean.pwd.set("111");
    }
}
