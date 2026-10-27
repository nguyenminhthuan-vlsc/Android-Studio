package com.example.thicuoiky_mobileapp_2500114700

import android.graphics.Color
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Ánh xạ bằng findViewById truyền thống (không dùng ViewBinding)
        val etEmail = findViewById<EditText>(R.id.etEmail)
        val etPassword = findViewById<EditText>(R.id.etPassword)
        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val tvStatus = findViewById<TextView>(R.id.tvStatus)

        btnLogin.setOnClickListener {
            val email = etEmail.text.toString().trim()
            val password = etPassword.text.toString().trim()

            if (email.isEmpty() || password.isEmpty()) {
                tvStatus.text = "Vui lòng nhập đầy đủ Email và Mật khẩu!"
                tvStatus.setTextColor(Color.RED)
            } else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                tvStatus.text = "Email không đúng định dạng!"
                tvStatus.setTextColor(Color.RED)
            } else if (password.length < 6) {
                tvStatus.text = "Mật khẩu phải từ 6 ký tự trở lên!"
                tvStatus.setTextColor(Color.RED)
            } else {
                tvStatus.text = "Đăng nhập hợp lệ"
                tvStatus.setTextColor(Color.parseColor("#388E3C"))
            }
        }
    }
}
