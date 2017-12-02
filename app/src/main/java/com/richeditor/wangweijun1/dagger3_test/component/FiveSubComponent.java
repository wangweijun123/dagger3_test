package com.richeditor.wangweijun1.dagger3_test.component;

import com.richeditor.wangweijun1.dagger3_test.FiveActivity;

import dagger.Subcomponent;

/**
 * Created by wangweijun1 on 2017/12/1.
 * 只是定义subcomponent组件是没法生成对应实现类，必须找到父类
 */

@Subcomponent
public interface FiveSubComponent {

    void inject(FiveActivity forthActivity);
}
