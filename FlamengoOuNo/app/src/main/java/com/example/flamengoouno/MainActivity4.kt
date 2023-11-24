package com.example.flamengoouno

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val sim = findViewById<Button>(R.id.sim3)
        val nao = findViewById<Button>(R.id.nao3)
        val intent = intent
        var respostaTela2 = intent.getIntExtra("respostaTela3", 0)

        sim.setOnClickListener{
            val intent = Intent(this@MainActivity4, MainActivity5::class.java)
            respostaTela2 += 8
            intent.putExtra("respostaTela4", respostaTela2)

            startActivity(intent)
        }

        nao.setOnClickListener{
            val intent = Intent(this@MainActivity4, MainActivity5::class.java)
            respostaTela2 += 2
            intent.putExtra("respostaTela4", respostaTela2)

            startActivity(intent)
        }


    }
}