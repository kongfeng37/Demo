package com.example.demo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

import com.example.demo.databinding.ActivityDatabindingBinding;
import com.example.demo.viewmodel.LoginViewModel;


public class DataBindingTestActivity extends AppCompatActivity {
    private LoginViewModel loginViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_databinding);
        ActivityDatabindingBinding viewDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_databinding);
        loginViewModel = new LoginViewModel(viewDataBinding);
    }
}