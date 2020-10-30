package eu.example.randomhexcolorgenerator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.graphics.Color
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        fun createColor() : String {
            val color_chars = ArrayList<Char>()
            color_chars.addAll(listOf('0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'))
            var new_clr_str = "#"
            var new_clr_chr = ""
            for(i in 0 until 6){
                new_clr_chr = color_chars[Random.nextInt(0, color_chars.size)].toString()
                new_clr_str += new_clr_chr
            }
            return new_clr_str
        }

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnGenerateColor.setOnClickListener {
            // Toast.makeText(this, "Çalışıyor",Toast.LENGTH_SHORT).show()
            var randomClr = createColor()
            Toast.makeText(this, randomClr ,Toast.LENGTH_SHORT).show()
            btnShowingColor.setBackgroundColor(Color.parseColor(randomClr))
        }


    }


}