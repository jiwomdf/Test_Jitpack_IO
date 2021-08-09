package com.programmergabut.logger

import android.util.Log

class LogDebug {

    companion object {
        const val TAG = "LogDebug"

        fun d(string: String){
            Log.d(TAG, string)
            Log.d(TAG, string)
        }
    }


}