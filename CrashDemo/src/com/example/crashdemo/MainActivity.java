package com.example.crashdemo;


import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_main);

		// 测试：制造异常
		String a = null;
		int b = Integer.valueOf(a);
		
		// 写入日志文件
//		LogUtil.Log2Storage("111121212");

	}

}
