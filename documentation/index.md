# admob Module

## Description

Allows for the display of AdMob in Titanium Android applications. 

Please note that if your androidManifest has screen support set to: android:anyDensity="false", 
any banner ads will display too small on high density devices. 
It is not clear at this point if this is a bug with adMob or Titanium. 
In any event, you will either need to NOT set your screen support -- or set android:anyDensity="true" and adjust your app layout accordingly

## Accessing the admob Module

To access this module from JavaScript, you would do the following:

	var admob = require("com.studioclassics.admob");

The admob variable is a reference to the Module object.	

# Reference

## setPublisherId(String id);

Set your publisher id

### Usage
admob.setPublisherId("123456");


## setTesting(Boolean testing);

set if the ads should be test ads or not -- 
default is false so you only need to call this if you want to set it to true

### Usage
admob.setTesting(false);


## createAdMobView()

returns a view with an ad initialized by default

### Usage
var adMobView = admob.createAdMobView();

## admob.AD_RECEIVED

returns the constant for AD_RECEIVED -- for use in an event listener

### Usage
adMobView.addEventListener(admob.AD_RECEIVED,function(){
    alert("ad was just received");
});

## admob.AD_NOT_RECEIVED

returns the constant for AD_NOT_RECEIVED -- for use in an event listener

### Usage
adMobView.addEventListener(admob.AD_NOT_RECEIVED,function(){
    alert("ad was not received");
});


## AdMobView.requestAd();

calls for a new ad if needed

### Usage

adMobView.requestAd();

## AdMobView.requestTestAd();

calls for a test ad if needed. This works independently from the testing flag above

### Usage

adMobView.requestTestAd();



# Author

Brian Kurzius | bkurzius@gmail.com

# License

Apache License
