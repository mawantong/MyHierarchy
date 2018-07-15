package cn.mh.myhierarchy.three;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

import com.android.debug.hv.ViewServer;

/**
 * Created by mwt on 2018/7/15.
 * 第三种方案，
 */

public class MyActivityLife implements Application.ActivityLifecycleCallbacks {
    @Override
    public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
        ViewServer.get(activity).addWindow(activity);
    }

    @Override
    public void onActivityStarted(Activity activity) {

    }

    @Override
    public void onActivityResumed(Activity activity) {
        ViewServer.get(activity).setFocusedWindow(activity);
    }

    @Override
    public void onActivityPaused(Activity activity) {
    }

    @Override
    public void onActivityStopped(Activity activity) {
    }

    @Override
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
    }

    @Override
    public void onActivityDestroyed(Activity activity) {
        ViewServer.get(activity).removeWindow(activity);
    }
}
