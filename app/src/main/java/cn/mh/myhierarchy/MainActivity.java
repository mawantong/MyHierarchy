package cn.mh.myhierarchy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.android.debug.hv.ViewServer;

/**
 * 第一种方案，在单个的某个activity中viewserver
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewServer.get(this).addWindow(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        ViewServer.get(this).setFocusedWindow(this);
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        ViewServer.get(this).removeWindow(this);
    }
}
