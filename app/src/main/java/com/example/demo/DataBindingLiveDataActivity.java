package com.example.demo;

import android.hardware.usb.UsbDeviceConnection;
import android.hardware.usb.UsbManager;
import android.os.Bundle;
import android.renderscript.ScriptIntrinsicYuvToRGB;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.demo.databinding.ActivityDatabindingLivedataBinding;
import com.example.demo.viewmodel.MyViewModel;
import com.example.upload_maven.LogUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class DataBindingLiveDataActivity extends AppCompatActivity {
    private MyViewModel mViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mViewModel = new ViewModelProvider(this, new ViewModelProvider.NewInstanceFactory()).get(MyViewModel.class);

        //dataBinding 将View上的控件绑定到binding
        ActivityDatabindingLivedataBinding livedataBinding = DataBindingUtil.setContentView(this, R.layout.activity_databinding_livedata);

        livedataBinding.setMyViewModel(mViewModel);//给xml文件中的myViewModel赋值
        livedataBinding.setLifecycleOwner(this);//绑定生命周期

        //还可以通过livedata观察数据变化
        mViewModel.getData().observe(this, value -> {
//            Log.d("kfkf", "value:" + value);
            new LogUtils().print("value:" + value);

        });
    }
}