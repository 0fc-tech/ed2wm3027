package com.eniecole.enishop.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.eniecole.enishop.R
import com.eniecole.enishop.dao.ArticleRepository


class ListArticleFragment : Fragment() {
    lateinit var textViewAffichageArticles: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list_article, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val button = view.findViewById<Button>(R.id.buttonToDetail)
        textViewAffichageArticles = view.findViewById<TextView>(R.id.textViewAffichageArticles)
        val article = ArticleRepository.getArticle(1L)
        textViewAffichageArticles.text = article.toString()

        button.setOnClickListener {
            val direction = ListArticleFragmentDirections.actionListToDetail(article)
            findNavController().navigate(direction)
        }
    }

    override fun onResume() {
        super.onResume()
        textViewAffichageArticles.text = ArticleRepository.getAllArticles().toString()
    }
}