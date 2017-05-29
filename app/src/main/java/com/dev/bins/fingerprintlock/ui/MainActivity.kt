package com.dev.bins.fingerprintlock.ui

import android.app.Activity
import android.app.admin.DevicePolicyManager
import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import com.dev.bins.fingerprintlock.R
import android.content.Intent
import android.content.ComponentName
import android.view.View
import android.widget.Toast
import com.dev.bins.fingerprintlock.Admin


class MainActivity : AppCompatActivity() {

    var mDPM:DevicePolicyManager? = null
    var mComponent:ComponentName?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mDPM = getSystemService(Context.DEVICE_POLICY_SERVICE) as DevicePolicyManager
        mComponent = ComponentName(this, Admin::class.java)


    }

    private val REQUEST_DPM: Int = 0

    fun activeDevicePoliceManager(view:View){
        val intent = Intent(DevicePolicyManager.ACTION_ADD_DEVICE_ADMIN)

        //权限列表
        intent.putExtra(DevicePolicyManager.EXTRA_DEVICE_ADMIN, mComponent)

        //描述(additional explanation)
        intent.putExtra(DevicePolicyManager.EXTRA_ADD_EXPLANATION, "激活指纹锁")

        startActivityForResult(intent, REQUEST_DPM)
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REQUEST_DPM && resultCode == Activity.RESULT_OK){
            Toast.makeText(this,"激活成功",Toast.LENGTH_SHORT)
            startActivity(Intent(this,SetPasswordActivity::class.java))
            finish()
        }
    }

}
