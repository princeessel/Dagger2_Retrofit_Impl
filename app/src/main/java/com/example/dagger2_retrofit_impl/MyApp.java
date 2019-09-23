package com.example.dagger2_retrofit_impl;

import android.app.Application;

public class MyApp extends Application {
    private AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mAppComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .netModule(new NetModule("https://jsonplaceholder.typicode.com/"))
                .build();
    }

    public AppComponent getNetComponent(){
        return mAppComponent;
    }
}
