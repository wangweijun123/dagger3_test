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
 * 一个component能实例化什么样对象, 第一看module里面的provide方法，第二注入类的构造函数
 * 如果都没有的话，编译会报错
 *
 * 一个component定义的scope，一定和module中
 */
public class SecondActivity extends AppCompatActivity {
    public static final String TAG = "MainActivity";

    @Inject
    Dog dog; // 不能private修饰

    @Inject
    Pig pig;

//    @Inject
//    Rabbit rabbit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ((MyApplication)getApplication()).getMainComponent().inject(this);

        setContentView(R.layout.activity_second);

        Log.i(TAG, "second dog:"+dog);

        Log.i(TAG, "second pig:"+pig);

//        Log.i(TAG, "second rabbit:"+rabbit);
    }

    public void clickMe(View v) {
        startActivity(new Intent(this, ThirdActivity.class));
    }
}
