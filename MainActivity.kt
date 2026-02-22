
package com.cineai.javier

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val generar = findViewById<Button>(R.id.generarBtn)

        generar.setOnClickListener {
            Toast.makeText(this,"🎬 Proyecto listo para generar videos IA",Toast.LENGTH_LONG).show()
        }
    }
}
