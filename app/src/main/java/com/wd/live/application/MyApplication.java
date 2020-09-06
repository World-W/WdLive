package com.wd.live.application;

import android.app.Application;
import android.content.Context;

/**
 *
 *  MyApplication
 *
 * */
public class MyApplication extends Application {

    //创建静态变量Context对象
    public static Context context;

    @Override
    public void onCreate() {
        super.onCreate();

        //Context对象赋值
        context = this;
    }
}
