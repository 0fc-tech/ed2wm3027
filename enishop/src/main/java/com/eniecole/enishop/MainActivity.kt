package com.eniecole.enishop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.eniecole.enishop.dao.ArticleRepository
import com.eniecole.enishop.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

//logt
private const val TAG = "MainActivity"
class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.article = ArticleRepository.getArticle(1L)
        //logd logi
        Log.d(TAG, "onCreate: ${ArticleRepository.getArticle(1L)}")
        binding.button.setOnClickListener {
            Snackbar.make(it,"Vous venez de créer ${binding.article?.titre} vendu pour un" +
                    "montant de ${binding.article?.prix}€",Snackbar.LENGTH_LONG).show()
        }
    }
}