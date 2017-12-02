package com.richeditor.wangweijun1.dagger3_test.module;

import com.richeditor.wangweijun1.dagger3_test.model.Chicken;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by wangweijun on 2017/12/2.
 */

@Module
public class BaseModule {

    @Singleton
    @Provides
    public Chicken getChicken() {
        return new Chicken();
    }
}
