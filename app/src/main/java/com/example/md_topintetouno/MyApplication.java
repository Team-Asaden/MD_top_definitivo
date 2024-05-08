package com.example.md_topintetouno;

import android.app.Application;

import com.raizlabs.android.dbflow.config.FlowManager;

/**
 * Created by Alain Nicolás Tello on 21/09/2017.
 * For: CursosAndroidANT
 * All rights reserved 2017
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        FlowManager.init(this);
    }
}
