package com.richeditor.wangweijun1.dagger3_test.component;

import com.richeditor.wangweijun1.dagger3_test.ThirdActivity;
import com.richeditor.wangweijun1.dagger3_test.model.PerActivity;
import com.richeditor.wangweijun1.dagger3_test.module.ThirdModule;

import dagger.Component;

/**
 * Created by wangweijun1 on 2017/12/1.
 */
@PerActivity
@Component(modules = ThirdModule.class)
public interface ThirdComponent {

    void inject(ThirdActivity thirdActivity);
}
