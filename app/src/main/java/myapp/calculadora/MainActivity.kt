package myapp.calculadora

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()



        setContentView(R.layout.activity_main)
        val num1 = findViewById<TextView>(R.id.num1)

        val num2 = findViewById<TextView>(R.id.num2)

        var resultado = findViewById<TextView>(R.id.resultado)

        val somar = findViewById<Button>(R.id.somar)
        somar.setOnClickListener {
            resultado.text = "Resultado: ${num1.text.toString().toInt()+num2.text.toString().toInt()}"
        }

        val subtrair = findViewById<Button>(R.id.subtrair)
        subtrair.setOnClickListener {
            resultado.text = "Resultado: ${num1.text.toString().toInt()-num2.text.toString().toInt()}"
        }

        val multiplicar = findViewById<Button>(R.id.multiplicar)
        multiplicar.setOnClickListener {
            resultado.text = "Resultado: ${num1.text.toString().toInt()*num2.text.toString().toInt()}"
        }

        val dividir = findViewById<Button>(R.id.dividir)
        dividir.setOnClickListener {
            resultado.text = "Resultado: ${num1.text.toString().toInt()/num2.text.toString().toInt()}"
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}