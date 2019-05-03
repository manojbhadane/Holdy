package com.manojbhadane.holdysample;

import android.app.Application;
import android.graphics.Typeface;

import com.manojbhadane.holdy.Holdy;

public class app extends Application {

    private static Typeface RegularTypeFace;

    public static Typeface getRegularTypeFace() {
        return RegularTypeFace;
    }

    @Override
    public void onCreate() {
        super.onCreate();


        RegularTypeFace = Typeface.createFromAsset(getAssets(), "Montserrat-Regular.ttf");

        Holdy.init(R.style.HoldyTheme, getRegularTypeFace());

    }
}
