package com.megvii.jnidemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.megvii.jnidemo.handler.NativeWorker;

public class MainActivity extends AppCompatActivity {
    private NativeWorker nativeWorker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
    }

    private void initData() {
        nativeWorker = new NativeWorker();
        nativeWorker.sayHello();
    }
}