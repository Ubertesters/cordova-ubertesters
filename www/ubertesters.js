var ubertesters = {
	initialize: function(successCallback, failureCallback) {
        cordova.exec(null, null, "UbertestersCordova", "initialize", []);
	},
	initialize: function(successCallback, failureCallback, lockingMode) {
        cordova.exec(null, null, "UbertestersCordova", "initialize", [lockingMode]);
	},
	initialize: function(successCallback, failureCallback, lockingMode, activationMode) {
        cordova.exec(null, null, "UbertestersCordova", "initialize", [lockingMode, activationMode]);
	},
	setIsIgnored: function(successCallback, failureCallback, isIgnored) {
		cordova.exec(null, null, "UbertestersCordova", "setIsIgnored", [isIgnored]);
	},
	showUtPage: function(successCallback, failureCallback) {
		cordova.exec(null, null, "UbertestersCordova", "showUtPage", []);	
	},
	hideUtPage: function(successCallback, failureCallback) {
		cordova.exec(null, null, "UbertestersCordova", "hideUtPage", []);	
	},
	takeScreenshot: function(successCallback, failureCallback) {
		cordova.exec(null, null, "UbertestersCordova", "takeScreenshot", []);	
	},
	logInfo: function(successCallback, failureCallback, info) {
		cordova.exec(null, null, "UbertestersCordova", "logInfo", [info]);	
	},	
	logError: function(successCallback, failureCallback, error) {
		cordova.exec(null, null, "UbertestersCordova", "logError", [error]);	
	},	
	logWarn: function(successCallback, failureCallback, warn) {
		cordova.exec(null, null, "UbertestersCordova", "logWarn", [warn]);	
	},	
	setOfflineModeEnabled: function(successCallback, failureCallback, isEnabled) {
		cordova.exec(null, null, "UbertestersCordova", "setOfflineModeEnabled", [isEnabled]);	
	}	
};