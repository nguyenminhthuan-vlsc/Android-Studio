package com.example.thicuoiky_mobileapp_2500114700

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        // Ánh xạ bằng findViewById truyền thống
        val tvUserEmail = findViewById<TextView>(R.id.tvUserEmail)
        val btnLogout = findViewById<Button>(R.id.btnLogout)

        // Nhận dữ liệu truyền sang từ LoginActivity
        val userEmail = intent.getStringExtra("USER_EMAIL") ?: "Không có dữ liệu Email"
        tvUserEmail.text = "Email: $userEmail"

        btnLogout.setOnClickListener {
            finish()
        }
    }
}
