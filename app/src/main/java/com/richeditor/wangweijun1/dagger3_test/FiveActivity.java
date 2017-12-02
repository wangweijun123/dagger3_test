package com.richeditor.wangweijun1.dagger3_test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.richeditor.wangweijun1.dagger3_test.model.Chicken;

import javax.inject.Inject;

/**
 * 一个component能实例化什么样对象, 第一看module里面的provide方法，第二注入类的构造函数
 * 如果都没有的话，编译会报错
 *
 * 一个component定义的scope，一定和module中
 */
public class FiveActivity extends AppCompatActivity {
    public static final String TAG = "MainActivity";

    @Inject
    Chicken chicken;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 通过父组件找子组件,
        ((MyApplication)getApplication()).getBaseComponent().getFiveSubComponent().inject(this);


        setContentView(R.layout.activity_five);


        Log.i(TAG, "five chicken:"+chicken);

    }


}
