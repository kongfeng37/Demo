package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.guide.guidecore.GuideInterface;

import java.util.LinkedList;
import java.util.function.Function;

public class MainActivity extends AppCompatActivity {
    private Button testBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        testBtn = findViewById(R.id.btn);
        testBtn.setFocusable(true);
        testBtn.setFocusableInTouchMode(true);
        testBtn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Toast.makeText(MainActivity.this, "onTouch", Toast.LENGTH_SHORT).show();
                return false;
            }
        });
        testBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "onClick", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        testBtn.post(new Runnable() {
            @Override
            public void run() {
                int[] location1 = new int[2] ;
                testBtn.getLocationInWindow(location1); //获取在当前窗口内的绝对坐标
                int[] location2 = new int[2] ;
                testBtn.getLocationOnScreen(location2);//获取在整个屏幕内的绝对坐标
                Log.d("kfkf", "1---x:" + location1[0] + ",y:" + location1[1] + ",w:" + testBtn.getWidth() + ",h:" + testBtn.getHeight());
                Log.d("kfkf", "2---x:" + location2[0] + ",y:" + location2[1] + ",w:" + testBtn.getWidth() + ",h:" + testBtn.getHeight());
            }
        });
    }
}