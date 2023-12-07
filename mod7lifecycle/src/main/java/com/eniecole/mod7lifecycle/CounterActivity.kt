package com.eniecole.mod7lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.viewModels
import com.eniecole.mod7lifecycle.databinding.ActivityCounterBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton

private const val TAG = "MainActivity"
class CounterActivity : AppCompatActivity() {
    //private var counter = 0
    private val counterVM by viewModels<CounterViewModel>()
    private lateinit var binding : ActivityCounterBinding

    //private lateinit var textViewCounter: TextView
    //private lateinit var fabCounterAdd: FloatingActionButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCounterBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.d(TAG, "onCreate: ")
        //textViewCounter = findViewById(R.id.textViewCounter)
        //fabCounterAdd = findViewById(R.id.fabCounterAdd)
        binding.vm = counterVM
        //binding.textViewCounter.text = "${counterVM.counter}"
        binding.fabCounterAdd.setOnClickListener { binding.textViewCounter.text = "${counterVM.inc()}"}
    }
/*
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("counter",counter)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        counter = savedInstanceState.getInt("counter")
        textViewCounter.text = "$counter"

    }


    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: ")
    }
    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: ")
    }
    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart: ")
    }
    override fun onPause() {
        super.onPause()
        Log.w(TAG, "onPause: ")
    }
    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop: ")
    }
    override fun onDestroy() {
        Log.d(TAG, "onDestroy: ")
        super.onDestroy()
    }
    */

}