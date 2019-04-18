package com.manojbhadane.holdysample;

import android.app.Application;

import com.manojbhadane.holdy.Holdy;

public class app extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Holdy.init(R.style.HoldyTheme);
    }
}
