package com.example.edisonoffice.backgroun_uploading_service;

/**
 * Created by edison office on 5/24/2018.
 */
import android.app.Application;

public class MyApplication extends Application {

    // Gloabl declaration of variable to use in whole app

    public static boolean activityVisible; // Variable that will check the
    // current activity state

    public static boolean isActivityVisible() {
        return activityVisible; // return true or false
    }

    public static void activityResumed() {
        activityVisible = true;// this will set true when activity resumed

    }

    public static void activityPaused() {
        activityVisible = false;// this will set false when activity paused

    }

}
