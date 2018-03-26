package com.example.oliver.semanticversion

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        version_code.text = getString(R.string.version_code, BuildConfig.VERSION_CODE)
        version_name.text =  getString(R.string.version_name,BuildConfig.VERSION_NAME)
    }
}
