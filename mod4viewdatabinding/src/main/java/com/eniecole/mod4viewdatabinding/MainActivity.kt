package com.eniecole.mod4viewdatabinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.eniecole.mod4viewdatabinding.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    //On créé une variable qui contiendra TOUTES nos vues
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //On récupère notre binding (qui contient toutes nos vue)
        binding = ActivityMainBinding.inflate(layoutInflater)
        //On affiche toute notre vue => Layout
        setContentView(binding.root)

        //val textViewHelloWorld = findViewById<TextView>(R.id.textViewHelloWorld)
        //val button = findViewById<Button>(R.id.button)
        val foo1 = User("Elon", "Musk",50,"elon@tesla.com")
        binding.user = foo1
        //binding.textViewName.text = foo1.nom
        //binding.textViewAge.text = "${foo1.age} ans"
        //binding.textViewSurname.text = foo1.nom
        //binding.textViewEmail.text = foo1.email

        binding.button.setOnClickListener {
            binding.textViewHelloWorld.text = "Ok, le bouton a été appuyé 😄"
        }
    }
}