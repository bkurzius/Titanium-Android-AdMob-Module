/**
 * Copyright (c) 2011 by Studio Classics. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 */

package com.studioclassics.admob;

import org.appcelerator.kroll.KrollModule;
import org.appcelerator.kroll.annotations.Kroll;
import org.appcelerator.titanium.TiContext;
import org.appcelerator.titanium.util.Log;


@Kroll.module(name="Admob", id="com.studioclassics.admob")
public class AdmobModule extends KrollModule
{
	// Standard Debugging variables
	private static final String LCAT = "AdmobModule";
	public static String MODULE_NAME = "AndroidAdMobModule";
	@Kroll.constant public static final String AD_RECEIVED = "ad_received";
	@Kroll.constant public static final String AD_NOT_RECEIVED = "ad_not_received";
	public static Boolean TESTING = false;
	public static String PUBLISHER_ID;
	
	
	public AdmobModule(TiContext tiContext) {
		super(tiContext);
		Log.d(LCAT, ">>>adMob module instantiated");
	}
	
	// use this to set the publisher id
	// must be done before the call to instantiate the view
	@Kroll.method
	public void setPublisherId(String pubId) {
		Log.d(LCAT, "setPublisherId(): " + pubId);
		PUBLISHER_ID = pubId;
	}
	
	@Kroll.method
	public void setTesting(Boolean testing) {
		Log.d(LCAT, "setTesting(): " + testing);
		TESTING = testing;
	}
	

	// ******* Deprecated************
	
	// Properties
	@Kroll.getProperty
	public String getAdReceived() {
		Log.d(LCAT, "getAdReceived()");
		return AD_RECEIVED;
	}

	@Kroll.getProperty
	public String getAdNotReceived() {
		Log.d(LCAT, "getAdNotReceived()");
		return AD_NOT_RECEIVED;
	}
	
	// ******* Deprecated************



}