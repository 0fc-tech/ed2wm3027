package com.eniecole.enishop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.eniecole.enishop.dao.ArticleRepository
//logt
private const val TAG = "MainActivity"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //logd logi
        Log.d(TAG, "onCreate: ${ArticleRepository.getArticle(1L)}")
    }
}