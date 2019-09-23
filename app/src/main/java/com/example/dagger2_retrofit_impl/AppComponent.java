package com.example.dagger2_retrofit_impl;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules={AppModule.class , NetModule.class})
public interface AppComponent {
    void inject(MainActivity activity);


}
