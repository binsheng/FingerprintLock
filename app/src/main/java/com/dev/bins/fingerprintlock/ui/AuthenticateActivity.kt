package com.dev.bins.fingerprintlock.ui

import android.os.Bundle
import android.support.v4.hardware.fingerprint.FingerprintManagerCompat
import android.support.v4.os.CancellationSignal
import android.support.v7.app.AppCompatActivity
import com.dev.bins.fingerprintlock.R

class AuthenticateActivity : AppCompatActivity() {


    var fingerprinterManager: FingerprintManagerCompat? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_authentiate)
        fingerprinterManager = FingerprintManagerCompat.from(this)
        fingerprinterManager?.authenticate(null,0, CancellationSignal(), Callback(),null)
    }

    class Callback : FingerprintManagerCompat.AuthenticationCallback(){
        override fun onAuthenticationError(errorCode: Int, errString: CharSequence?) {
            super.onAuthenticationError(errorCode, errString)
        }

        override fun onAuthenticationFailed() {
            super.onAuthenticationFailed()
        }

        override fun onAuthenticationSucceeded(result: FingerprintManagerCompat.AuthenticationResult?) {
            super.onAuthenticationSucceeded(result)

        }
    }

    override fun onBackPressed() {
//        super.onBackPressed()
        //TODO: GO HOME
        finish()
    }



}
