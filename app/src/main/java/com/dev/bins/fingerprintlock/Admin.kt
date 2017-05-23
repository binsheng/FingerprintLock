package com.dev.bins.fingerprintlock

import android.app.admin.DeviceAdminReceiver
import android.content.Context
import android.content.Intent

/**
 * Created by bin on 23/05/2017.
 */

class Admin : DeviceAdminReceiver(){

    override fun onEnabled(context: Context?, intent: Intent?) {
        super.onEnabled(context, intent)
    }

    override fun onDisabled(context: Context?, intent: Intent?) {
        super.onDisabled(context, intent)
    }

    override fun onDisableRequested(context: Context?, intent: Intent?): CharSequence {
        return "卸载会导致指纹锁无法正常操作"
    }



}