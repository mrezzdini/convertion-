package com.example.convertion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_temperature.*
import kotlin.math.ceil

class TemperatureActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_temperature)
        val num = et_temperature.text
        rGroup.setOnCheckedChangeListener { group, checkedId ->
            if(et_temperature.text.isEmpty()) {
                Toast.makeText(
                    this, "Champ vide",
                    Toast.LENGTH_LONG
                ).show()
            }
            when (checkedId) {
                R.id.rb_celfar -> {
                    val Tf = ((9*num.toString().toFloat())/5) + 32
                    if (checkBox.isChecked){

                        tv_resulta.text = ceil(Tf).toString()

                    } else {
                        tv_resulta.text = "$Tf"

                    }

                }
                R.id.rb_farcel -> {
                   val Tc = (5*(num.toString().toFloat() - 32)) / 9
                    if (checkBox.isChecked){
                        tv_resulta.text = ceil(Tc).toString()
                    } else {
                        tv_resulta.text = "$Tc"

                    }


                }
            }

        }
    }
}