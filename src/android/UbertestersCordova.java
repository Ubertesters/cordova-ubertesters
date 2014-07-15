package com.ubertesters.sdk;

import android.app.AlertDialog;
import android.app.Application;
import android.widget.Toast;
import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;
import android.util.Log;

import java.io.InputStream;

public class UbertestersCordova extends CordovaPlugin {


    @Override
    public boolean execute(String action, final JSONArray args, final CallbackContext callbackContext) throws JSONException {
        PluginResult result = new PluginResult(PluginResult.Status.ERROR);
        if (action.equals("initialize")) {
            try {
                Application app = cordova.getActivity().getApplication();
                if (args != null && args.length() > 0) {
                    String lockingMode = args.getString(0);
                    if (args.length() > 1) {
                        String activationMode = args.getString(1);
                        Ubertesters.initialize(app, com.ubertesters.common.models.LockingMode.valueOf(lockingMode), com.ubertesters.common.models.ActivationMode.valueOf(activationMode));
                    } else {
                        Ubertesters.initialize(app, com.ubertesters.common.models.LockingMode.valueOf(lockingMode));
                    }
                } else {
                    Ubertesters.initialize(app);
                }
            } catch (Exception ex) {
                result = new PluginResult(PluginResult.Status.INSTANTIATION_EXCEPTION, ex.getMessage());
                callbackContext.sendPluginResult(result);
                return true;
            }

            callbackContext.success();
            return true;
        } else if (action.equals("showUtPage")) {
            Ubertesters.showUtPage();
            callbackContext.success();
            return true;
        } else if (action.equals("hideUtPage")) {
            Ubertesters.hideUtPage();
            callbackContext.success();
            return true;
        } else if (action.equals("takeScreenshot")) {
            Ubertesters.takeScreenshot();
            callbackContext.success();
            return true;
        } else if (action.equals("logInfo")) {
            String message = args.getString(0);
            Ubertesters.logger().info(message);
            callbackContext.success();
            return true;
        } else if (action.equals("logError")) {
            String message = args.getString(0);
            Ubertesters.logger().error(message);
            callbackContext.success();
        } else if (action.equals("logWarn")) {
            String message = args.getString(0);
            Ubertesters.logger().warn(message);
            callbackContext.success();
        } else if (action.equals("setOfflineModeEnabled")) {
            boolean value = args.getBoolean(0);
            Ubertesters.setOfflineModeEnabled(value);
            callbackContext.success();
        }

        callbackContext.sendPluginResult(result);
        return false;
    }

}
