package com.eniecole.enishop.ui.activity

import android.os.Build
import android.os.Bundle
import android.util.Log
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.eniecole.enishop.bo.Article
import com.eniecole.enishop.dao.ArticleRepository
import com.eniecole.enishop.databinding.ActivityAjoutArticleBinding
import com.eniecole.enishop.ui.fragment.DetailArticleFramentArgs
import com.google.android.material.snackbar.Snackbar
import java.time.LocalDate
import java.time.format.DateTimeFormatter


private const val TAG = "MainActivity"
class AjoutArticleActivity : AppCompatActivity() {
    private lateinit var binding : ActivityAjoutArticleBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAjoutArticleBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.article = ArticleRepository.getArticle(1L)
        //logd logi
        Log.d(TAG, "onCreate: ${ArticleRepository.getArticle(1L)}")
        binding.button.setOnClickListener {
            Snackbar.make(
                it, "Vous venez de créer ${binding.article?.titre} vendu pour un" +
                        "montant de ${binding.article?.prix}€", Snackbar.LENGTH_LONG
            ).show()
            val articleSauvegarde = binding.article!!.copy(
                urlImage = "https://image.jpg",
                prix = binding.editTextPrix.text.toString().toDoubleOrNull() ?: -1.0,
                dateSortie = LocalDate.now()
            )
            ArticleRepository.addArticle(articleSauvegarde)
            finish()
        }
    }
}








