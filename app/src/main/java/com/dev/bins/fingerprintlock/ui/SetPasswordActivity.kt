package com.dev.bins.fingerprintlock.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import com.dev.bins.fingerprintlock.R

class SetPasswordActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_set_password)
        findViewById(R.id.et_pwd)
    }
}
