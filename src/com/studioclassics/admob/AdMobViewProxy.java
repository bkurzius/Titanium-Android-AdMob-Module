/**
 * Copyright (c) 2011 by Studio Classics. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 */
package com.studioclassics.admob;

import org.appcelerator.kroll.KrollDict;
import org.appcelerator.kroll.annotations.Kroll;
import org.appcelerator.titanium.TiContext;
import org.appcelerator.titanium.proxy.TiViewProxy;
import org.appcelerator.titanium.view.TiUIView;

import android.app.Activity;

@Kroll.proxy(creatableInModule=AdmobModule.class)
public class AdMobViewProxy extends TiViewProxy
{
	private AdMobView adMob;
	
	public AdMobViewProxy(TiContext tiContext)
	{
		super(tiContext);
	}

	@Override
	protected KrollDict getLangConversionTable() {
		KrollDict table = new KrollDict();
		table.put("title","titleid");
		return table;
	}

	@Override
	public TiUIView createView(Activity activity)
	{
		adMob = new AdMobView(this);
		return adMob;
	}
}
