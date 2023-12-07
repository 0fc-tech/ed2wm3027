package com.eniecole.enishop.ui.fragment

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.eniecole.enishop.R
import com.eniecole.enishop.databinding.FragmentDetailArticleFramentBinding

class DetailArticleFrament : Fragment() {
    private lateinit var binding : FragmentDetailArticleFramentBinding
    val args by navArgs<DetailArticleFramentArgs>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //XML Layout en Binding (kotlin)
        binding = FragmentDetailArticleFramentBinding.inflate(inflater, container, false)
        //Récuparation du Layout (kotlin) depuis le binding
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.article = args.article
        binding.textViewTitre.setOnClickListener {
            val intentToGoogle = Intent(Intent.ACTION_VIEW,
                Uri.parse("https://google.com/search?q=eni-shop%20${args.article.titre}"))
            startActivity(intentToGoogle)
        }
    }
}