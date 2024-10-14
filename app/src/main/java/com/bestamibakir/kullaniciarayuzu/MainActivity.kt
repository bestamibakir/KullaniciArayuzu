package com.bestamibakir.kullaniciarayuzu

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bestamibakir.kullaniciarayuzu.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        /*
        binding.textView4.text = "Merhaba Dünya"
        binding.button.setOnClickListener {
            binding.textView4.text = "Butona Tıklandı"
        }
        */

        /*
        //bu yöntem xmldeki widgetlara ulaşmanın en ilkel yolu
        val myImage = findViewById<ImageView>(R.id.imageView)
        myImage.setImageResource(R.drawable.istanbul2)
        val myText = findViewById<TextView>(R.id.textView4)
        */

    }

    fun kaydet(view : View){
        binding.textView4.text = "Kayıt Edildi"
    }

    fun iptal(view : View){
        binding.textView4.text = "İptal Edildi"
    }

}