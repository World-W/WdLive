package com.wd.live.net;


/**
 *
 * 用来存放项目中所有的接口地址
 *
 * ctrl+shift+u    小写变大写
 *
 * 接口中的成员变量都是使用   public static final修饰的
 * */
public interface UrlUtil {

    //常量要遵循规则大写
    String BASE_URL = "http://mobile.bwstudent.com/";   //网址前缀

    String XINBANBEN_URL = "movieApi/tool/v1/findNewVersion";   //查询新版本

}
