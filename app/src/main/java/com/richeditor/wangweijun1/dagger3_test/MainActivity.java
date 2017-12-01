package com.richeditor.wangweijun1.dagger3_test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.richeditor.wangweijun1.dagger3_test.model.Dog;
import com.richeditor.wangweijun1.dagger3_test.model.Pig;

import javax.inject.Inject;


/**
 * 1,
 */
public class MainActivity extends AppCompatActivity {
    public static final String TAG = "MainActivity";

    @Inject
    Dog dog; // 不能private修饰

    @Inject
    Dog dog2;

    @Inject
    Pig pig;

    // 如果定义了inject引用的scope(要么就别定义scope,要么就别在同一个组件使用)，
    // 那必须一致，否则不能在依赖需求方同时使用这些对象,而且component定义一致
//    @Inject
//    Rabbit rabbit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        ((MyApplication)getApplication()).getMainComponent().inject(this);

        setContentView(R.layout.activity_main);

        Log.i(TAG, "main dog:"+dog);
        Log.i(TAG, "main dog2:"+dog2);

        Log.i(TAG, "main pig:"+pig);

//        Log.i(TAG, "main rabbit:"+rabbit);

    }

    public void clickMe(View v) {
        startActivity(new Intent(this, SecondActivity.class));
    }
}
