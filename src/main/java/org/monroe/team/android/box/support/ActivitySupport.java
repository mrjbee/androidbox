package org.monroe.team.android.box.support;

import android.app.Application;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ListView;


public abstract class ActivitySupport <AppType extends Application> extends android.app.Activity{


    public <ViewType extends View> ViewType view(int resourceId, Class<ViewType> viewType){
        return (ViewType) findViewById(resourceId);
    }

    public View view(int resourceId){
        return findViewById(resourceId);
    }

    public CheckBox view_check(int resourceId){
        return view(resourceId,CheckBox.class);
    }
    public ListView view_list(int resourceId){
        return view(resourceId,ListView.class);
    }


    public AppType application(){
        return (AppType) getApplication();
    }

    public void runLastOnUiThread(final Runnable runnable, final long... waitBeforeRun){
        new Thread(){
            @Override
            public void run() {
                if (waitBeforeRun.length > 0) {
                    try {
                        Thread.sleep(waitBeforeRun[0]);
                    } catch (InterruptedException e) {}
                }
                runOnUiThread(runnable);
            }
        }.start();
    }
}
