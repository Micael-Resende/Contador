package com.example.contador
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvCounter = findViewById<TextView>(R.id.tvCounter)
        val btnIncrement = findViewById<Button>(R.id.btnIncrement)
        val btnDecrement = findViewById<Button>(R.id.btnDecrement)

        // Atualiza o TextView com o valor atual do contador
        fun updateCounter() {
            tvCounter.text = counter.toString()
        }

        // Incrementa o valor do contador ao clicar no botão
        btnIncrement.setOnClickListener {
            counter++
            updateCounter()
        }

        // Decrementa o valor do contador ao clicar no botão
        btnDecrement.setOnClickListener {
            if (counter > 0) {
                counter--
                updateCounter()
            }
        }
    }
}
