package com.lulu.teoriamusical.view.moduloI.pautas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.lulu.teoriamusical.R

class TelaPauta : AppCompatActivity() {

    private lateinit var botaoAvancar:AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_pauta)

        botaoAvancar = findViewById(R.id.botao_pau_avan_i)
        botaoAvancar.setOnClickListener{
            startActivity(Intent(this, TelaPautaII::class.java))
        }

    }
}