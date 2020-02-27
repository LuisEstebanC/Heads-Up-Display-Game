package com.example.headsupdisplaygame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnCategorias.setOnClickListener{
            val intent = Intent(this, Categorias::class.java)
            startActivity(intent)
            finish()
        }

        btnAcercade.setOnClickListener{
            val intent = Intent(this, AcercaDe::class.java)
            startActivity(intent)
            finish()
        }
    }

}
