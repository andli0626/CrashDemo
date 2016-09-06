package com.example.crashdemo;

import android.app.Application;
import android.content.Context;

import com.example.crashdemo.crash.CrashHandler;

/**
 * @author lilin
 * @date 2016年9月6日 上午9:28:28
 * @annotation
 */
public class MyApplication extends Application {

	private static Context mContext;
	
	@Override
	public void onCreate() {
		super.onCreate();
		mContext = getApplicationContext();
		// 异常处理，不需要处理时注释掉这两句即可！
		CrashHandler crashHandler = CrashHandler.getInstance();
		// 注册crashHandler
		crashHandler.init(this);
	}

	public static Context getContext(){
		return mContext;
	}
	
}
