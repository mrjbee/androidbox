package org.monroe.team.android.box.support;

import android.app.Application;
import android.view.View;


public abstract class ActivitySupport <AppType extends Application> extends android.app.Activity{


    public <ViewType extends View> ViewType view(int resourceId, Class<ViewType> viewType){
        return (ViewType) findViewById(resourceId);
    }

    public View view(int resourceId){
        return findViewById(resourceId);
    }

    public AppType application(){
        return (AppType) getApplication();
    }
}
