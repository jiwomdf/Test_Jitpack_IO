package com.programmergabut.testjitpackio

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.net.Uri
import android.provider.Browser





class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        /* val url = "http://www.google.com?test=mantapdjiwa"
        val i = Intent(Intent.ACTION_VIEW)
        i.data = Uri.parse(url)
        startActivity(i) */

        /* val url = "http://www.google.com?test=aa"
        val i = Intent(Intent.ACTION_VIEW)
        i.data = Uri.parse(url)
        i.putExtra(Browser.EXTRA_APPLICATION_ID, this.packageName)
        startActivity(i) */

    }
}