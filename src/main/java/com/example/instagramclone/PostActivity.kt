package com.example.instagramclone

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import com.example.instagramclone.R.id.postButton

class PostActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_post)

        val postButton = findViewById<TextView>(postButton)
        postButton.setOnClickListener {
            finish()
        }
    }
}