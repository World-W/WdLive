package com.wd.live.base;

/**
 *
 *
 * Presenter基类    BasePresenter
 *
 * */
public class BasePresenter<V extends IBaseView>{

    //创建View对象
    private V view;

    //初始化view
    public void attachView(V v){
        view = v;
    }

    //获取view
    public V getView() {
        return view;
    }

    //销毁view
    public void detachView(){
        view = null;
    }
}
