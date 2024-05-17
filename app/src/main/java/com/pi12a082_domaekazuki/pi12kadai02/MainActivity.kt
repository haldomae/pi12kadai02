package com.pi12a082_domaekazuki.pi12kadai02

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
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
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // 画面の要素取得
        val messageView: TextView = findViewById(R.id.messageView)
        val waterBtn: Button = findViewById(R.id.waterBtn)
        val flowerImage: ImageView = findViewById(R.id.flowerImage)
        val resetBtn: Button = findViewById(R.id.resetBtn)

        var count = 0
        waterBtn.setOnClickListener {
            count++
            if(10 < count){
                messageView.text = getString(R.string.message0)
                flowerImage.setImageResource(R.drawable.f1)
            }

        }

        resetBtn.setOnClickListener {
            count = 0
            messageView.text = getString(R.string.message)
            flowerImage.setImageResource(R.drawable.f0)
        }
    }
}