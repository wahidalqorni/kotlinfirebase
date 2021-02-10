package com.mwahidalqorni.kotlinnotiftest.fcm

import android.content.ContentValues.TAG
import android.util.Log
import com.google.firebase.iid.FirebaseInstanceId
import com.google.firebase.iid.FirebaseInstanceIdService

class NotifInstanceService: FirebaseInstanceIdService() {
    override fun onTokenRefresh() {
        super.onTokenRefresh()
        //get token
        val refreshedToken = FirebaseInstanceId.getInstance().token
        Log.d("Ooo", "Testing")
        Log.d(TAG, "RefreshedToken $refreshedToken")
    }
}