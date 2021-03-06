package com.richeditor.wangweijun1.dagger3_test.module;

import com.richeditor.wangweijun1.dagger3_test.model.Dog;

import dagger.Module;
import dagger.Provides;

/**
 * Created by wangweijun1 on 2017/12/1.
 */
//1，module类中可以定义
@Module
public class MainModule {

    /*@Singleton*/
    @Provides
    public Dog getDog() {
        return new Dog();
    }
}
