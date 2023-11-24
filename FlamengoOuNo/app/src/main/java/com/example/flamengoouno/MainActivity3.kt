package com.example.flamengoouno

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)


        val sim = findViewById<Button>(R.id.sim2)
        val nao = findViewById<Button>(R.id.nao2)
        val intent = intent
        var respostaTela2 = intent.getIntExtra("respostaTela2", 0)

        sim.setOnClickListener{
            val intent = Intent(this@MainActivity3, MainActivity4::class.java)
            respostaTela2 += 8
            intent.putExtra("respostaTela3", respostaTela2)

            startActivity(intent)
        }

        nao.setOnClickListener{
            val intent = Intent(this@MainActivity3, MainActivity4::class.java)
            respostaTela2 += 2
            intent.putExtra("respostaTela3", respostaTela2)

            startActivity(intent)
        }

    }
}


