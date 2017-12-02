package com.richeditor.wangweijun1.dagger3_test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.richeditor.wangweijun1.dagger3_test.component.DaggerThirdComponent;
import com.richeditor.wangweijun1.dagger3_test.component.ThirdComponent;
import com.richeditor.wangweijun1.dagger3_test.model.Chicken;
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
//
//    @Inject
//    Dog dog;
//
//    依赖需求方 (注入对象(n个引用scope必须一致(如果定义scope))， 组件 这两个)
//    @Inject
//    Pig pig;

    @Inject
    Rabbit rabbit;

    @Inject
    Rabbit rabbit2;

    //这个鸡吧来自BaseComponent(被ThirdComponent依赖的组件，
    // 在BaseComponent中必须要声明自己能提供什么实例，不然依赖需求方找不到哦)
    @Inject
    Chicken chicken;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


       ThirdComponent thirdComponent = DaggerThirdComponent.builder()
               .baseComponet(((MyApplication)getApplication()).getBaseComponent())
               .thirdModule(new ThirdModule()).build();
        thirdComponent.inject(this);

        setContentView(R.layout.activity_third);

//        Log.i(TAG, "third dog:"+dog);
//
//        Log.i(TAG, "third pig:"+pig);

        Log.i(TAG, "third rabbit:"+rabbit);
        Log.i(TAG, "third rabbit2:"+rabbit2);

        Log.i(TAG, "third chicken:"+chicken);

    }

    public void clickMe(View v) {
        startActivity(new Intent(this, ForthActivity.class));
    }
}
