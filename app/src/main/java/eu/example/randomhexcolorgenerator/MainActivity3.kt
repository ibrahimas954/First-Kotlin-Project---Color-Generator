package eu.example.randomhexcolorgenerator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        supportActionBar!!.title = "Random Color Generator"
        btnSelectHEX.setOnClickListener {
            val intent  = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        btnSelecetRGB.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }
}