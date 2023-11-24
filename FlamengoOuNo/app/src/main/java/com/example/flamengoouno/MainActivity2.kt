package com.example.flamengoouno

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        val sim = findViewById<Button>(R.id.sim)
        val nao= findViewById<Button>(R.id.nao)
        var result = 0

        sim.setOnClickListener{
            val intent = Intent(this@MainActivity2, MainActivity3::class.java)
            result = 8
            intent.putExtra("respostaTela2", result)

            startActivity(intent)
        }

        nao.setOnClickListener{
            val intent = Intent(this@MainActivity2, MainActivity3::class.java)
            result = 2
            intent.putExtra("respostaTela2", result)

            startActivity(intent)
        }


    }
}