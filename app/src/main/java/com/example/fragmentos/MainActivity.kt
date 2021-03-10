package com.example.fragmentos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragmentos.Fragmentos.Login

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val login = Login()
        supportFragmentManager.beginTransaction().replace(R.id.contenedor,login).commit()
    }
}