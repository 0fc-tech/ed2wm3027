package com.eniecole.mod5navcomponent

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs

class HomeFragment : Fragment() {
    val args by navArgs<HomeFragmentArgs>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("HomeFrag", "onViewCreated: IDARTICLE : ${args.idArticle}")
        Log.d("HomeFrag", "onViewCreated: User : ${args.user.prenom} ${args.user.nom}")
    }
}