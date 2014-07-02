1.
To add this plugin just type:
	phonegap plugin add UPDATE_LINK
			
To remove this plugin type:
	phonegap plugin remove com.ubertesters.sdk
2.
	Add "Ubertesters Project ID" to your app's "Info.plist" with key "ubertesters_project_id"	

	Don't forget to build your application with:
		phonegap build ios

3.
Use Ubertesters initialize function in the "deviceready" function
onDeviceReady: function() {
	cordova.exec(null, null, "UbertestersCordova", "initialize", []);
    },

You can use Ubertesters with Cordova command: 
cordova.exec(null, null, "UbertestersCordova", "initialize", []);

Or you can add ubertesters.js to your sources  and call ubertesters in this way:
		ubertesters.initialize(null, null);

If you want to use specific locking mode or activation mode in initialization,
you can call initialize function with parameters:
ubertesters.initialize(null, null, /*LOCKING_MODE*/, /*ACTIVATION_MODE*/);
OR
cordova.exec(null, null, "UbertestersCordova", "initialize", [/*LOCKING_MODE*/, /*ACTIVATION_MODE*/]);

Examples:
1...
	ubertesters.initialize(null, null, 'LockingModeDisableUbertestersIfBuildNotExist');
2...
	ubertesters.initialize(null, null, 'LockingModeDisableUbertestersIfBuildNotExist', 'Shake');
3...
cordova.exec(null, null, "UbertestersCordova", "initialize",
['LockingModeDisableUbertestersIfBuildNotExist', 'Shake']);


Available LockingMode (Must be the third argument): 

LockingModeDisableUbertestersIfBuildNotExist
If build not exists Ubertesters will be disabled.
LockingModeLockAppIfBuildNotExist
If build not exists tested application will be locked.

Available ActivationMode (Must be the fourth argument):

Slider
Mode with displaying Ubertesters button.
Shake
Mode without Ubertesters button. User has to shake device to open Ubertesters page.
Manually
Mode without Ubertesters button. Developer has to use functions ShowUtPage() and HideUtPage().

All other Ubertesters functions you can see in com.ubertesters.sdk/www/ubertesters.js