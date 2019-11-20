package com.example.lifecycleeventsexample


import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * A simple [Fragment] subclass.
 */
class MainFragment : Fragment() {
    companion object {
        private const val TAG = "MainFragment"
    }

    override fun onAttach(context: Context?) {
        Log.i(TAG, "onAttach() called")
        super.onAttach(context)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i(TAG, "onCreate() called")
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i(TAG, "onCreateView() called")
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        Log.i(TAG, "onActivityCreated() called")
        super.onActivityCreated(savedInstanceState)
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

    override fun onDestroyView() {
        Log.i(TAG, "onDestroyView() called")
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.i(TAG, "onDestroy() called")
        super.onDestroy()
    }

    override fun onDetach() {
        Log.i(TAG, "onDetach() called")
        super.onDetach()
    }
}
