package com.richeditor.wangweijun1.dagger3_test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.richeditor.wangweijun1.dagger3_test.component.DaggerForthComponent;
import com.richeditor.wangweijun1.dagger3_test.component.ForthComponent;
import com.richeditor.wangweijun1.dagger3_test.model.Chicken;

import javax.inject.Inject;

/**
 * 一个component能实例化什么样对象, 第一看module里面的provide方法，第二注入类的构造函数
 * 如果都没有的话，编译会报错
 *
 * 一个component定义的scope，一定和module中
 */
public class ForthActivity extends AppCompatActivity {
    public static final String TAG = "MainActivity";


    //这个鸡吧来自BaseComponent(被ThirdComponent依赖的组件，
    // 在BaseComponent中必须要声明自己能提供什么实例，不然依赖需求方找不到哦)
    @Inject
    Chicken chicken;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_forth);

        ForthComponent forthComponent = DaggerForthComponent.builder()
                .baseComponet(((MyApplication)getApplication()).getBaseComponent()).build();

        forthComponent.inject(this);

        Log.i(TAG, "forth chicken:"+chicken);

    }

    public void clickMe(View v) {
        startActivity(new Intent(this, FiveActivity.class));
    }
}
