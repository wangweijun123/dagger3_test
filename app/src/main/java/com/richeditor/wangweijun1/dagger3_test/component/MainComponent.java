package com.richeditor.wangweijun1.dagger3_test.component;

import com.richeditor.wangweijun1.dagger3_test.MainActivity;
import com.richeditor.wangweijun1.dagger3_test.SecondActivity;
import com.richeditor.wangweijun1.dagger3_test.module.MainModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by wangweijun1 on 2017/12/1.
 * 1
 */
@Singleton
@Component(modules = MainModule.class)
public interface MainComponent {

    void inject(MainActivity mainActivity);

    void inject(SecondActivity secondActivity);
}
