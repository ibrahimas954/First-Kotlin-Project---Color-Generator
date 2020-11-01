package eu.example.randomhexcolorgenerator

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
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

        fun copyColor(value:String){
            var clipboard = getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
            var clip = ClipData.newPlainText("Copy Text", value)
            clipboard.setPrimaryClip(clip)
        }

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnGenerateColor.setOnClickListener {
            var randomClr = createColor()
            Toast.makeText(this, randomClr ,Toast.LENGTH_SHORT).show()
            btnShowingColor.setBackgroundColor(Color.parseColor(randomClr))

            btnCopy.setOnClickListener {
                 copyColor(randomClr)
                 Toast.makeText(this, randomClr + " Kopyalandı " ,Toast.LENGTH_SHORT).show()
            }
        }
        btnCopy.setOnClickListener{
            Toast.makeText(this, "Lütfen önce bir renk seçiniz !" ,Toast.LENGTH_SHORT).show()
        }




    }


}