package com.wd.live.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 *
 *
 * Activity基类    BaseActivity
 *
 * */
public abstract class BaseActivity<P extends BasePresenter> extends AppCompatActivity implements IBaseView {

    //创建presenter对象
    private P presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //加载布局
        setContentView(layoutid());

        //按顺序执行方法
        initView();
        presenter = setPresenter();
        if(presenter != null){
            presenter.attachView(this);
        }
        initListener();
        initData();

    }

    //获取presenter对象
    public P getPresenter() {
        return presenter;
    }

    //创建抽象方法
    protected abstract void initView();        //初始化

    protected abstract void initListener();    //监听

    protected abstract void initData();        //请求数据

    protected abstract int layoutid();         //资源文件

    protected abstract P setPresenter();       //设置presenter


    //解除绑定
    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(presenter != null){
            presenter.detachView();
        }
    }
}
