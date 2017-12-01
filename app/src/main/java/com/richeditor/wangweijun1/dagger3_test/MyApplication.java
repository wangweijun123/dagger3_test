package com.richeditor.wangweijun1.dagger3_test;

import android.app.Application;

import com.richeditor.wangweijun1.dagger3_test.component.DaggerMainComponent;
import com.richeditor.wangweijun1.dagger3_test.component.MainComponent;
import com.richeditor.wangweijun1.dagger3_test.module.MainModule;

/**
 * Created by wangweijun1 on 2017/12/1.
 */

public class MyApplication extends Application{
    MainComponent mainComponent;
    @Override
    public void onCreate() {
        super.onCreate();

        mainComponent = DaggerMainComponent.builder().mainModule(new MainModule()).build();
    }

    public MainComponent getMainComponent() {
        return mainComponent;
    }
}
