package com.wd.demojiguang;

import android.app.Application;
import cn.jpush.android.api.JPushInterface;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        JPushInterface.setDebugMode(true);//如果时正式版就改成false
        JPushInterface.init(this);
    }
}
