Ubertesters Plugin for Cordova

Project includes;

- iOS SDK

- Android SDK

To add this plugin just type:
	phonegap plugin add UPDATE_LINK
			
To remove this plugin type:
	phonegap plugin remove com.ubertesters.sdk

--ANDROID INTEGRATION:

	After adding android platform, please add next line into AndroidManifest.xml file:

		<application>
		...
		<meta-data android:name="ubertesters_project_id" android:value="your project id"/>
		...
		</application> 

	Read http://ubertesters.com/download-sdk-android/ for more details.
	Also make sure your specify correct android:versionCode and android:versionName for your build.
	
	Don't forget to build your application with:
		phonegap build android
	
--IOS INTEGRATION:
	Add "Ubertesters Project ID" to your app's "Info.plist" with key "ubertesters_project_id"
	Read http://ubertesters.com/download-sdk-android/ for more details.
	

	Don't forget to build your application with:
		phonegap build ios

-- CALL FROM JAVASCRIPT		
	The plugin's JavaScript functions are called after creating the plugin object thus:
 
		cordova.exec(null, null, "UbertestersCordova", "initialize", []);
        
	Make sure you create the object after the "deviceready" event has fired.