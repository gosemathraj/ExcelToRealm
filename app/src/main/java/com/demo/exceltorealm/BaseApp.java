package com.demo.exceltorealm;

import android.app.Application;

import io.realm.Realm;

public class BaseApp extends Application {

    public static BaseApp baseApp;

    public static BaseApp getInstance(){
        return baseApp;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        // One Time Initialization of Realm
        Realm.init(this);

        // Context Initialization
        baseApp = this;
    }
}
