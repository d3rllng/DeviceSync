package com.example.devicesync

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.View

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.statusBarColor = Color.BLACK
        window.navigationBarColor = Color.BLACK
        setContentView(View(this).apply { setBackgroundColor(Color.BLACK) })
    }
}
