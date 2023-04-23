package com.example.convertion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mont = montant.text
        eurdt.setOnClickListener {
            val i = Intent (this ,conversion::class.java)
            i.putExtra("montant",mont.toString().toFloat())
            i.putExtra("sens","EUR en DT")
            startActivity(i)
        }
        dteur.setOnClickListener {
            val i = Intent (this ,conversion::class.java)
            i.putExtra("montant",mont.toString().toFloat())
            i.putExtra("sens","DT en EUR")
            startActivity(i)
        }
    }
}