package com.example.holamundo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private  var tvGreeting: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvGreeting = findViewById(R.id.txtSaludo)
        CambiarMensaje()
        //tvGreeting.text = getString(R.string.despedida)
    }
    private fun CambiarMensaje(){
        val mensaje_original:String
        mensaje_original = tvGreeting?.text.toString()
        Toast.makeText(this, "Tu mensaje original era: " + mensaje_original + " :) ", Toast.LENGTH_LONG).show()
    }
    private fun CambiarMensaje(tipo: Int){
        if (tipo == 1){
            tvGreeting?.text = getString(R.string.despedida)
        }else{
            Toast.makeText(this, "El tipo es $tipo", Toast.LENGTH_LONG).show()
        }
    }
}