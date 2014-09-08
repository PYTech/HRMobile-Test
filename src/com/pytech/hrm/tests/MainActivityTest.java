package com.pytech.hrm.tests;

import com.pytech.hrm.activities.MainActivity;

import android.test.ActivityInstrumentationTestCase2;

public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

	private MainActivity mainActivity;
	
	public MainActivityTest() {
		super(MainActivity.class);
	}
	
	public MainActivityTest(Class<MainActivity> activityClass) {
		super(activityClass);
	}
	
	@Override
	public void setUp() {
		this.mainActivity = this.getActivity();
	}
	
	public void testGeneral() {
		this.mainActivity.general();
	}

}
