package com.example.priority.view.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.priority.R
import com.example.priority.view.login.SignInActivity

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Handler().postDelayed({
            val splashIntent = Intent(this, SignInActivity::class.java)
            startActivity(splashIntent)
        }, 3000)
    }
}