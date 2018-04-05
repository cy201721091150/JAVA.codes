package com.example.a24270.activitytest;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 24270 on 2018/4/4.
 */

public class ActivityCollector {
    public static List<Activity> activities=new ArrayList<>();
    public static void addActivity(Activity activity){
        activities.add(activity);
    }

public static void removeActivity(Activity activity){
    activities.remove(activity);
}
public static void finishAll(){
    for (Activity activity:activities){
        if (!activity.isFinishing()){
            activity.finish();
        }
    }
    activities.clear();
    }
}