package com.example.tp3_a_composant

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnAfficherInfo = findViewById<Button>(R.id.btnAfficherInfo)
        btnAfficherInfo.setOnClickListener {
            // Navigation vers InfoActivity
            val intent = Intent(this, InfoActivity::class.java)
            startActivity(intent)
        }
    }
}