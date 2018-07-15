package cn.mh.myhierarchy.three;

import android.app.Application;
import android.support.compat.BuildConfig;

/**
 * Created by mwt on 2018/7/15.
 * 第三种方案，并且把当前的自定义applcation在清单文件中替换即可
 */

public class MyApp extends Application {
    public void onCreate() {
        super.onCreate();
        // 如果是Debug版本，那么才注册ActivityLifecycleCallbacks监听器
        if (BuildConfig.DEBUG) {
            registerActivityLifecycleCallbacks(new MyActivityLife());
        }
    }
}
