package com.example.flamengoouno

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        val intent = intent
        val resultado = intent.getIntExtra("respostaTela4", 0)
        val imageView = findViewById<ImageView>(R.id.imageView11)
        val texto1 = findViewById<TextView>(R.id.Parabens)
        val texto2 = findViewById<TextView>(R.id.maiorDoRio)

        if (resultado == 24) {
            imageView.setImageResource(R.drawable.brasilerao)
            texto1.text = "Parábens!"
            texto2.text = "Você torce para o maior do Rio!"
        }
        if (resultado < 24) {
            imageView.setImageResource(R.drawable.chororo)
            texto1.text = "Que pena!"
            texto2.text = "Você é triste amigão!"
        }
    }
}