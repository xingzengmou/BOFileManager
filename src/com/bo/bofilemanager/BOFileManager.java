package com.bo.bofilemanager;

import android.os.Bundle;
import android.os.StrictMode;
import android.os.Build;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Notification;
import android.app.TabActivity;
import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TabHost;

public class BOFileManager extends TabActivity {
	private static final String TAG = "BOFileManager";
	private static final boolean DEBUG_STRICT_MODE = true;
	private TabHost mTabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	if (DEBUG_STRICT_MODE) {
	    	StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder()
	    			.detectAll()
	    			.penaltyDialog()
	    			.penaltyLog().build());
	    	StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder()
	    			.detectAll()
	    			.penaltyLog().build());
    	}
        super.onCreate(savedInstanceState);
        
        mTabHost = this.getTabHost();
        
        LayoutInflater.from(this).inflate(R.layout.activity_main, mTabHost.getTabContentView(), true);
        
        mTabHost.addTab(mTabHost.newTabSpec(getString(R.string.tv_sdcard))
        		.setIndicator(getString(R.string.tv_sdcard))
        		.setContent(R.id.tab1));
        
        mTabHost.addTab(mTabHost.newTabSpec(getString(R.string.tv_apk))
        		.setIndicator(getString(R.string.tv_apk))
        		.setContent(R.id.tab2));
        
        mTabHost.addTab(mTabHost.newTabSpec(getString(R.string.tv_video))
        		.setIndicator(getString(R.string.tv_video))
        		.setContent(R.id.tab3));
        
        mTabHost.addTab(mTabHost.newTabSpec(getString(R.string.tv_music))
        		.setIndicator(getString(R.string.tv_music))
        		.setContent(R.id.tab4));
        
        mTabHost.addTab(mTabHost.newTabSpec(getString(R.string.tv_picture))
        		.setIndicator(getString(R.string.tv_picture))
        		.setContent(R.id.tab5));
        
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to 	the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}	
