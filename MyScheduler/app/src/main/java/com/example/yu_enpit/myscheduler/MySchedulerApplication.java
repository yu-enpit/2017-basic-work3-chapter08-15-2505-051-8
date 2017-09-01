package com.example.yu_enpit.myscheduler;

import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * Created by v051ff on 2017/08/04.
 */

public class MySchedulerApplication extends Application {
    @Override
    public void onCreate(){
        super.onCreate();
        Realm.init(this);
        RealmConfiguration realmConfig=new RealmConfiguration.Builder().build();
        Realm.setDefaultConfiguration(realmConfig);
    }

}

