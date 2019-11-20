package com.example.lifecycleeventsexample

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    companion object {
        private const val TAG = "MainActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i(TAG, "onCreate() called")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //region
//        val fragment = MainFragment()
//
//        val fragmentTransaction = supportFragmentManager.beginTransaction()
//        fragmentTransaction.add(R.id.main_container, fragment, "MainFragment")
//        fragmentTransaction.commit()
        //endregion


        //region
        show_next_fragment.setOnClickListener {
            val fragment1 = NextFragment()
            with(supportFragmentManager.beginTransaction()){
                replace(R.id.main_container, fragment1)
                addToBackStack(null)
                commit()
            }
        }
        //endregion


        //region
        show_next_activity.setOnClickListener{
            val intent = Intent(this, NextActivity::class.java)
            startActivity(intent)
        }
        //endregion
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
