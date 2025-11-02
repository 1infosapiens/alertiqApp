package com.example.sirenviewer
import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.*
import android.view.View
import android.widget.ProgressBar
class MainActivity: AppCompatActivity(){private lateinit var w:WebView;private lateinit var p:ProgressBar;@SuppressLint("SetJavaScriptEnabled")override fun onCreate(b:Bundle?){super.onCreate(b);setContentView(R.layout.activity_main);w=findViewById(R.id.webView);p=findViewById(R.id.progressBar);window.decorView.systemUiVisibility=View.SYSTEM_UI_FLAG_FULLSCREEN or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION;w.settings.javaScriptEnabled=true;w.settings.domStorageEnabled=true;w.webViewClient=WebViewClient();w.webChromeClient=object:WebChromeClient(){override fun onProgressChanged(v:WebView?,n:Int){p.progress=n;p.visibility=if(n==100)View.GONE else View.VISIBLE}};w.loadUrl("http://siren.local:3000")}override fun onBackPressed(){if(w.canGoBack())w.goBack() else super.onBackPressed()}}