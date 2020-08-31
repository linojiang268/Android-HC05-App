package com.menthoven.arduinoandroid;

import android.util.Log;

public class P {
    public final static String TAG = "Bluetooth-HC";
    public final static boolean DEBUG_FORCE = false;

    public static boolean isDebug() {
        return DEBUG_FORCE || BuildConfig.DEBUG;
    }

    public static void log(String log) {
        if (P.isDebug()) Log.d(TAG, log);
    }
}
