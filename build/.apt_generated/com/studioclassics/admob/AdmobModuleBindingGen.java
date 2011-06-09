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

	private static final String CONST_AD_RECEIVED = "AD_RECEIVED";
	private static final String CONST_AD_NOT_RECEIVED = "AD_NOT_RECEIVED";
	private static final String CREATE_AdMobView = "createAdMobView";
	private static final String DYNPROP_adNotReceived = "adNotReceived";
	private static final String DYNPROP_adReceived = "adReceived";
	private static final String METHOD_setTesting = "setTesting";
	private static final String METHOD_setPublisherId = "setPublisherId";
		
	public AdmobModuleBindingGen() {
		super();
		// Constants are pre-bound
		bindings.put(CONST_AD_RECEIVED, AdmobModule.AD_RECEIVED);
		bindings.put(CONST_AD_NOT_RECEIVED, AdmobModule.AD_NOT_RECEIVED);
		
		bindings.put(CREATE_AdMobView, null);
		bindings.put(DYNPROP_adNotReceived, null);
		bindings.put(DYNPROP_adReceived, null);
		bindings.put(METHOD_setTesting, null);
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




		// Dynamic Properties
		if (name.equals(DYNPROP_adNotReceived)) {
			KrollDynamicProperty adNotReceived_property = new KrollDynamicProperty(DYNPROP_adNotReceived,
				true, false,
				false) {
				
				@Override
				public Object dynamicGet(KrollInvocation __invocation) {
	

	Object __getAdNotReceived_tmp;
	final org.appcelerator.kroll.KrollConverter __getAdNotReceived_converter = org.appcelerator.kroll.KrollConverter.getInstance();
	
	
	java.lang.String __retVal =
	
	
	((AdmobModule) __invocation.getProxy()).getAdNotReceived(
);
	return __getAdNotReceived_converter.convertNative(__invocation, __retVal);
				}

				@Override
				public void dynamicSet(KrollInvocation __invocation, Object __value) {
					Log.w(TAG, "Property Admob.adNotReceived isn't writable");
				}
			};
			adNotReceived_property.setJavascriptConverter(org.appcelerator.kroll.KrollConverter.getInstance());
			adNotReceived_property.setNativeConverter(org.appcelerator.kroll.KrollConverter.getInstance());
			bindings.put(DYNPROP_adNotReceived, adNotReceived_property);
			return adNotReceived_property;
		}
		
		if (name.equals(DYNPROP_adReceived)) {
			KrollDynamicProperty adReceived_property = new KrollDynamicProperty(DYNPROP_adReceived,
				true, false,
				false) {
				
				@Override
				public Object dynamicGet(KrollInvocation __invocation) {
	

	Object __getAdReceived_tmp;
	final org.appcelerator.kroll.KrollConverter __getAdReceived_converter = org.appcelerator.kroll.KrollConverter.getInstance();
	
	
	java.lang.String __retVal =
	
	
	((AdmobModule) __invocation.getProxy()).getAdReceived(
);
	return __getAdReceived_converter.convertNative(__invocation, __retVal);
				}

				@Override
				public void dynamicSet(KrollInvocation __invocation, Object __value) {
					Log.w(TAG, "Property Admob.adReceived isn't writable");
				}
			};
			adReceived_property.setJavascriptConverter(org.appcelerator.kroll.KrollConverter.getInstance());
			adReceived_property.setNativeConverter(org.appcelerator.kroll.KrollConverter.getInstance());
			bindings.put(DYNPROP_adReceived, adReceived_property);
			return adReceived_property;
		}

		// Methods
		if (name.equals(METHOD_setTesting)) {
			KrollMethod setTesting_method = new KrollMethod(METHOD_setTesting) {
				public Object invoke(KrollInvocation __invocation, Object[] __args) throws Exception
				{
	
	KrollBindingUtils.assertRequiredArgs(__args, 1, METHOD_setTesting);

	Object __setTesting_tmp;
		KrollArgument __testing_argument = new KrollArgument("testing");
		java.lang.Boolean testing;
			__testing_argument.setOptional(false);
			
				__setTesting_tmp = org.appcelerator.kroll.KrollConverter.getInstance().convertJavascript(__invocation, __args[0], java.lang.Boolean.class);
				try {
					testing = (java.lang.Boolean) __setTesting_tmp;
				} catch (ClassCastException e) {
					throw new IllegalArgumentException("Expected java.lang.Boolean type for argument \"testing\" in \"setTesting\", but got " + __setTesting_tmp);
				}
		__testing_argument.setValue(testing);
		__invocation.addArgument(__testing_argument);
	
	
	
	
	((AdmobModule) __invocation.getProxy()).setTesting(
		testing
		);
		return KrollProxy.UNDEFINED;
				}
			};
			bindings.put(METHOD_setTesting, setTesting_method);
			return setTesting_method;
		}
		
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