package com.font77.softkibord;

import android.app.Application;

/**
 * Created by DELL on 4/1/2017.
 */

public final class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        fontsovArride.setDefaultFont(this, "DEFAULT", "fonts/dejavu_sans_mono_inglis.ttf");
        fontsovArride.setDefaultFont(this, "MONOSPACE", "fonts/dejavu_sans_mono_inglis.ttf");
    }
}
