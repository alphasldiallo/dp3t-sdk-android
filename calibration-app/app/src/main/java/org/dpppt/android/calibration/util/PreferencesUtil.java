/*
 * Created by Ubique Innovation AG
 * https://www.ubique.ch
 * Copyright (c) 2020. All rights reserved.
 */
package org.dpppt.android.calibration.util;

import android.content.Context;
import android.content.SharedPreferences;

public class PreferencesUtil {

	private static final String PREFS_DP3T_SDK_SAMPLE = "preferences_dp3t_sdk_sample";
	private static final String PREF_KEY_EXPOSED_NOTIFICATION = "pref_key_exposed_notification";

	public static boolean isExposedNotificationShown(Context context) {
		SharedPreferences prefs = context.getSharedPreferences(PREFS_DP3T_SDK_SAMPLE, Context.MODE_PRIVATE);
		return prefs.getBoolean(PREF_KEY_EXPOSED_NOTIFICATION, false);
	}

	public static void setExposedNotificationShown(Context context) {
		SharedPreferences prefs = context.getSharedPreferences(PREFS_DP3T_SDK_SAMPLE, Context.MODE_PRIVATE);
		prefs.edit().putBoolean(PREF_KEY_EXPOSED_NOTIFICATION, true).apply();
	}

}
