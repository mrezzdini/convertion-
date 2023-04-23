package com.example.convertion

import android.R.attr
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_conversion.*
import android.R.attr.data




class conversion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_conversion)
        val m = intent.getFloatExtra("montant", 0.0f)
        val s = intent.getStringExtra("sens")
        tv_montant.text = "$m"
        tv_sens.text = s
        bt_convert.setOnClickListener {
            if (s == "DT en EUR") {
                val new = m * 0.31
                tv_result.text="$m DT = $new EUR"
                Toast.makeText(
                    this, "$m DT = $new EUR",
                    Toast.LENGTH_LONG
                ).show()
            }
            if (s == "EUR en DT") {
                val new = m / 0.31
                tv_result.text="$m EUR = $new DT"
                Toast.makeText(
                    this, "$m EUR = $new DT",
                    Toast.LENGTH_LONG
                ).show()
            }


        }

    }
}
