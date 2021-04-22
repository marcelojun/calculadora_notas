package com.example.calculadora

import android.graphics.Color
import android.graphics.Color.green
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.annotation.IntegerRes
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btCalcular: Button = calcular
        val resultado: TextView = resultado

        btCalcular.setOnClickListener {
            val nota1 = Integer.parseInt(nota1.text.toString())
            val nota2 = Integer.parseInt(nota2.text.toString())
            val media = (nota1 + nota2) / 2
            val faltas = Integer.parseInt(faltas.text.toString())

            if (media >= 5 && faltas <= 10) {
                resultado.setText("Parabéns! Você está aprovado")
                resultado.setTextColor(Color.GREEN)
            } else if (media >= 4 && faltas <= 10) {
                resultado.setText("Aluno em Recuperação!!")
                resultado.setTextColor(Color.CYAN)

            } else {
                resultado.setText("Aluno REPROVADO!!")
                resultado.setTextColor(Color.RED)

            }
        }
    }}