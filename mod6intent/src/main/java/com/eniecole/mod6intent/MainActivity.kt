package com.eniecole.mod6intent

import android.Manifest
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.activity.result.contract.ActivityResultContracts

const val EXTRA_STRING_ALIMENT = "aliment"
class MainActivity : AppCompatActivity() {
    //Je passe un contrat avec Android pour une demande de permission. Je définis ce que je fais après sa réponse
    val requestPermissionLauncher = registerForActivityResult(ActivityResultContracts.RequestPermission()){ isGranted ->
        //La permission a été accordée
        if(isGranted){
            //Je demande à Android de déclencher un Intent permettant l'appel et d'un tel
            startActivity(Intent(Intent.ACTION_CALL,Uri.parse("tel:098765432")))
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //intent Explicite vers TargetActivity
        val buttonExplicit = findViewById<Button>(R.id.buttonExplicit)
        buttonExplicit.setOnClickListener {
            Intent(this,TargetActivity::class.java).apply {
                putExtra(EXTRA_STRING_ALIMENT,"Pain Au chocolat")
                startActivity(this)
            }
        }
        //Intent implicite vers App Téléphone pour "voir" un numéro de tel
        val buttonViewPhone = findViewById<Button>(R.id.buttonViewPhone)
        buttonViewPhone.setOnClickListener {
            Intent(Intent.ACTION_CALL, Uri.parse("tel:0876543234")).apply {
                startActivity(this)
            }
        }
        //Intent implicite vers téléphone pour un appel (avec demande permission)
        val buttonCallPhone = findViewById<Button>(R.id.buttonCallPhone)
        buttonCallPhone.setOnClickListener {
                                            //On Importe le Manifest "android"
            requestPermissionLauncher.launch(Manifest.permission.CALL_PHONE)
        }
    }
}