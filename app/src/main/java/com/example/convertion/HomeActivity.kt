package com.example.convertion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        bt_conversion.setOnClickListener {
            val i = Intent(this,MainActivity::class.java)
            startActivity(i)
        }
        bt_temperature.setOnClickListener {
            val i = Intent(this,TemperatureActivity::class.java)
            startActivity(i)
        }
    }
}

/*btn22.setOnClickListener {
    val i= Intent(this,MainActivity::class.java)
    if(ett22.text.isEmpty()&&ettp22.text.isEmpty()){

        Toast.makeText(this, "please fill the required fields", Toast.LENGTH_SHORT).show()

    }
    else{
        Toast.makeText(this, "${ett22.text} is logged in!!", Toast.LENGTH_SHORT).show()
    }
    startActivity(i)*/