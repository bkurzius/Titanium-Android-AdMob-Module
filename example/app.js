var win = Titanium.UI.createWindow({
	backgroundColor: "#FFFFFF",
    layout: "vertical"
});

// require AdMob
var admob = require("com.studioclassics.admob");

// set your publisher id
admob.setPublisherId("a14de00df64415f");

// set if the ads should be test ads or not -- 
// default is false so you only need to call this if you want to set it to true
admob.setTesting(false);

// then create an adMob view
var adMobView = admob.createAdMobView();

//listener for adReceived
adMobView.addEventListener(admob.AD_RECEIVED,function(){
    alert("ad was just received");
});

//listener for adNotReceived
adMobView.addEventListener(admob.AD_NOT_RECEIVED,function(){
    alert("ad was not received");
});


var adRequestBtn = Ti.UI.createButton({
    title:"Request ad",
    top:10,
    height: 30,
    width: 200
});

adRequestBtn.addEventListener("click",function(){
    adMobView.requestAd();
});

var adRequestBtn2 = Ti.UI.createButton({
    title: "Request test ad",
    top: 10,
    height: 30,
    width: 200
});

adRequestBtn2.addEventListener("click",function(){
    adMobView.requestTestAd();
});

win.add(adMobView);
win.add(adRequestBtn);
win.add(adRequestBtn2);
win.open();