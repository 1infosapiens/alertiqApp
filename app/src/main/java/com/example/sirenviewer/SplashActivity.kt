package com.example.sirenviewer
import android.content.Intent
import android.os.*
import androidx.appcompat.app.AppCompatActivity
class SplashActivity: AppCompatActivity(){override fun onCreate(b:Bundle?){super.onCreate(b);Handler(Looper.getMainLooper()).postDelayed({startActivity(Intent(this,MainActivity::class.java));finish()},1500)}}