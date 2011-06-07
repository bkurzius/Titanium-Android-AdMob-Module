/**
 * Appcelerator Titanium Mobile
 * Copyright (c) 2010 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 */
package com.studioclassics.admob;

import org.appcelerator.kroll.KrollArgument;
import org.appcelerator.kroll.KrollProxy;
import org.appcelerator.kroll.KrollConverter;
import org.appcelerator.kroll.KrollInvocation;
import org.appcelerator.kroll.KrollMethod;
import org.appcelerator.kroll.KrollModule;
import org.appcelerator.kroll.KrollProxyBinding;
import org.appcelerator.kroll.KrollModuleBinding;
import org.appcelerator.kroll.KrollDynamicProperty;
import org.appcelerator.kroll.KrollReflectionProperty;
import org.appcelerator.kroll.KrollInjector;
import org.appcelerator.kroll.KrollDict;
import org.appcelerator.kroll.KrollDefaultValueProvider;
import org.appcelerator.kroll.util.KrollReflectionUtils;
import org.appcelerator.kroll.util.KrollBindingUtils;
import org.appcelerator.titanium.kroll.KrollBridge;
import org.appcelerator.titanium.TiContext;
import org.appcelerator.titanium.util.Log;

import org.mozilla.javascript.Scriptable;

import java.util.HashMap;

import com.studioclassics.admob.AdmobModule;


/* WARNING: this code is generated for binding methods in Android */
public class AdmobModuleBindingGen
	extends org.appcelerator.kroll.KrollModuleBindingGen
{
	private static final String TAG = "AdmobModuleBindingGen";

	private static final String CREATE_AdMobView = "createAdMobView";
	private static final String METHOD_setPublisherId = "setPublisherId";
		
	public AdmobModuleBindingGen() {
		super();
		// Constants are pre-bound
		
		bindings.put(CREATE_AdMobView, null);
		bindings.put(METHOD_setPublisherId, null);
		
	}

	public void bindContextSpecific(KrollBridge bridge, KrollProxy proxy) {
	}

	@Override
	public Object getBinding(String name) {
		Object value = bindings.get(name);
		if (value != null) { 
			return value;
		}

		// Proxy create methods
		if (name.equals(CREATE_AdMobView)) {
			KrollBindingUtils.KrollProxyCreator creator = new KrollBindingUtils.KrollProxyCreator() {
				public KrollProxy create(TiContext context) {
					return new com.studioclassics.admob.AdMobViewProxy(context);
				}
			};
			KrollMethod createAdMobView_method = KrollBindingUtils.createCreateMethod(CREATE_AdMobView, creator);
			bindings.put(CREATE_AdMobView, createAdMobView_method);
			return createAdMobView_method;
		}





		// Methods
		if (name.equals(METHOD_setPublisherId)) {
			KrollMethod setPublisherId_method = new KrollMethod(METHOD_setPublisherId) {
				public Object invoke(KrollInvocation __invocation, Object[] __args) throws Exception
				{
	
	KrollBindingUtils.assertRequiredArgs(__args, 1, METHOD_setPublisherId);

	Object __setPublisherId_tmp;
		KrollArgument __pubId_argument = new KrollArgument("pubId");
		java.lang.String pubId;
			__pubId_argument.setOptional(false);
			
				__setPublisherId_tmp = org.appcelerator.kroll.KrollConverter.getInstance().convertJavascript(__invocation, __args[0], java.lang.String.class);
				try {
					pubId = (java.lang.String) __setPublisherId_tmp;
				} catch (ClassCastException e) {
					throw new IllegalArgumentException("Expected java.lang.String type for argument \"pubId\" in \"setPublisherId\", but got " + __setPublisherId_tmp);
				}
		__pubId_argument.setValue(pubId);
		__invocation.addArgument(__pubId_argument);
	
	
	
	
	((AdmobModule) __invocation.getProxy()).setPublisherId(
		pubId
		);
		return KrollProxy.UNDEFINED;
				}
			};
			bindings.put(METHOD_setPublisherId, setPublisherId_method);
			return setPublisherId_method;
		}


		return super.getBinding(name);
	}

	private static final String SHORT_API_NAME = "Admob";
	private static final String FULL_API_NAME = "Admob";
	private static final String ID = "com.studioclassics.admob";

	public String getAPIName() {
		return FULL_API_NAME;
	}

	public String getShortAPIName() {
		return SHORT_API_NAME;
	}

	public String getId() {
		return ID;
	}

	public KrollModule newInstance(TiContext context) {
		return new AdmobModule(context);
	}

	public Class<? extends KrollProxy> getProxyClass() {
		return AdmobModule.class;
	}

	public boolean isModule() {
		return true; 
	}
}