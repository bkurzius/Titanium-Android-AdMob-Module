// Example for using AdMob
// require the module
var admob = require('com.studioclassics.admob');

// set your publisher id
admob.setPublisherId("<your-publisher-id>");

// This uses a tab group so that there are two chances to get a valid ad

var tabGroup = Ti.UI.createTabGroup();
var myWin = Titanium.UI.createWindow({
	backgroundColor:"#FFFFFF"
});
// then create an adMob view
var adMobView = admob.createAdMobView();
adMobView.top = 200;
myWin.add(adMobView);

var myWin2 = Titanium.UI.createWindow({
	backgroundColor:"#226600"
});
// then create an adMob view
var adMobView2 = admob.createAdMobView();
adMobView2.top = 100;
myWin2.add(adMobView2);

 
tabGroup.addTab(Ti.UI.createTab({
    title: 'AdMob Tab 1',
    window: myWin
}));
tabGroup.addTab(Ti.UI.createTab({
    title: 'AdMob Tab 2',
    window: myWin2
}));
tabGroup.open();

// set listeners

//listener for ad_received
adMobView.addEventListener("ad_received",function(){
    alert("ad 1 was received");
});
//listener for ad_not_received
adMobView.addEventListener("ad_not_received",function(){
    alert("ad 1 was not received");
});


//listener for ad_received
adMobView2.addEventListener("ad_received",function(){
    alert("ad 2 was received");
});

//listener for ad_not_received
adMobView2.addEventListener("ad_not_received",function(){
    alert("ad 2 was not received");
});