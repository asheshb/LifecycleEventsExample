package com.example.lifecycleeventsexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class NextActivity : AppCompatActivity() {
    companion object {
        private const val TAG = "NextActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i(TAG, "onCreate() called")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)
    }

    override fun onStart() {
        Log.i(TAG, "onStart() called")
        super.onStart()
    }

    override fun onResume() {
        Log.i(TAG, "onResume() called")
        super.onResume()
    }

    override fun onPause() {
        Log.i(TAG, "onPause() called")
        super.onPause()
    }

    override fun onStop() {
        Log.i(TAG, "onStop() called")
        super.onStop()
    }

    override fun onDestroy() {
        Log.i(TAG, "onDestroy() called")
        super.onDestroy()
    }
}
