package com.iwxyi.easymeeting.Globals;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.iwxyi.easymeeting.Utils.DateTimeUtil;
import com.iwxyi.easymeeting.Utils.SettingsUtil;

public class App extends Application {

    private static Context context;

    public void onCreate(){
        super.onCreate();
        App.context = getApplicationContext();
    }

    public static Context getContext() {
        return App.context;
    }

    /*------------------DateTimeUtil---------------------------*/

    public static int getTimestamp() {
        return DateTimeUtil.getTimestamp();
    }

    /*------------------Network---------------------------*/
    // 还是算了吧，就不放在这里了


    /*------------------Debug---------------------------*/
    public static void toast(String str) {
        Toast.makeText(context, str, Toast.LENGTH_SHORT).show();
    }

    public static void log(String str) {
        Log.i("====App", str);
    }

    public static void log(String tag, String msg) {
        Log.i(tag, msg);
    }

    /*------------------SettingsUtil---------------------------*/

    public static String getVal(String key) {
        return SettingsUtil.getVal(context, key);
    }

    public static void setVal(String key, String val) {
        SettingsUtil.setVal(context, key, val);
    }

    public static void setVal(String key, int val) {
        SettingsUtil.setVal(context, key, val);
    }

    public static void setVal(String key, long val) {
        SettingsUtil.setVal(context, key, val);
    }

    public static void setVal(String key, float val) {
        SettingsUtil.setVal(context, key, val);
    }

    public static void setVal(String key, boolean val) {
        SettingsUtil.setVal(context, key, val);
    }

    public static int getInt(String key) {
        return SettingsUtil.getInt(context, key);
    }

    public static long getLong(String key) {
        return SettingsUtil.getLong(context, key);
    }

    public static float getFloat(String key) {
        return SettingsUtil.getFloat(context, key);
    }

    public static boolean getBoolean(String key) {
        return SettingsUtil.getBoolean(context, key);
    }
}
