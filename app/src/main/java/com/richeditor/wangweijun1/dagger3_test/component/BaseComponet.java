package com.richeditor.wangweijun1.dagger3_test.component;

import com.richeditor.wangweijun1.dagger3_test.model.Chicken;
import com.richeditor.wangweijun1.dagger3_test.module.BaseModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by wangweijun on 2017/12/2.
 */
@Singleton
@Component(modules = BaseModule.class)
public interface BaseComponet {

    // 作为被依赖组件必须定义自己的能力，因为依赖你的组建不会查找你对应的module和构造函数
    Chicken getChickenXxxx();


    FiveSubComponent getFiveSubComponent();

}
