package eu.example.randomhexcolorgenerator

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*
import kotlin.random.Random

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        supportActionBar!!.title = "Random RGB Color Generator"
        supportActionBar!!.
        btnRGBColorGenerator.setOnClickListener{
            val randomRed = Random.nextInt(256)
            val randomGreen = Random.nextInt(256)
            val randomBlue = Random.nextInt(256)
            var color = Color.argb(255, randomRed, randomGreen, randomBlue)
            screen.setBackgroundColor(color)
        }
    }
}