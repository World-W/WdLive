package com.wd.live.net;

import android.widget.Toast;

import com.wd.live.application.MyApplication;

/**
 *
 * 吐司的工具类
 *
 * */
public class ToastUtil {

    //单例模式三部曲

    private static ToastUtil toastUtil;

    private ToastUtil(){

    }

    public static ToastUtil getInstance(){

        if(toastUtil == null){
            toastUtil = new ToastUtil();
        }
        return toastUtil;
    }

    //吐司的方法
    public void toast(String msg){
        Toast.makeText(MyApplication.context, msg, Toast.LENGTH_SHORT).show();
    }
}
