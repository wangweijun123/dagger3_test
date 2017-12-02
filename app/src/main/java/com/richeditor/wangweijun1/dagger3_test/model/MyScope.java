package com.richeditor.wangweijun1.dagger3_test.model;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by wangweijun1 on 2017/12/1.
 */

@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface MyScope {
}
