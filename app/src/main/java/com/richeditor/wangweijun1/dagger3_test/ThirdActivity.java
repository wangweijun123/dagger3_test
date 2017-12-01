package com.richeditor.wangweijun1.dagger3_test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.richeditor.wangweijun1.dagger3_test.component.DaggerThirdComponent;
import com.richeditor.wangweijun1.dagger3_test.component.ThirdComponent;
import com.richeditor.wangweijun1.dagger3_test.model.Rabbit;
import com.richeditor.wangweijun1.dagger3_test.module.ThirdModule;

import javax.inject.Inject;

/**
 * 一个component能实例化什么样对象, 第一看module里面的provide方法，第二注入类的构造函数
 * 如果都没有的话，编译会报错
 *
 * 一个component定义的scope，一定和module中
 */
public class ThirdActivity extends AppCompatActivity {
    public static final String TAG = "MainActivity";

//    @Inject
//    Dog dog;
//
//    @Inject
//    Pig pig;

    @Inject
    Rabbit rabbit;

    @Inject
    Rabbit rabbit2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       ThirdComponent thirdComponent = DaggerThirdComponent.builder().thirdModule(new ThirdModule()).build();
        thirdComponent.inject(this);

        setContentView(R.layout.activity_third);

//        Log.i(TAG, "second dog:"+dog);
//
//        Log.i(TAG, "second pig:"+pig);

        Log.i(TAG, "second rabbit:"+rabbit);
        Log.i(TAG, "second rabbit2:"+rabbit2);
    }
}
