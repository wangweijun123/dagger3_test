package com.richeditor.wangweijun1.dagger3_test.component;

import com.richeditor.wangweijun1.dagger3_test.ForthActivity;
import com.richeditor.wangweijun1.dagger3_test.model.MyScope;

import dagger.Component;

/**
 * Created by wangweijun1 on 2017/12/1.
 * 依赖basecomponent组件自己必须定义scope,
 * 组件定义的scope, module provide方法不一定定义,但是module中定义的任何scope，组件必须定义
 */
@MyScope
@Component(dependencies = BaseComponet.class)
public interface ForthComponent {

    void inject(ForthActivity forthActivity);
}
