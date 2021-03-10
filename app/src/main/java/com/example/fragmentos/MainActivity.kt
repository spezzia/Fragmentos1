package com.example.fragmentos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragmentos.Fragmentos.Login
import com.example.fragmentos.Fragmentos.Recetas

class MainActivity : AppCompatActivity(), Comunicacion {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val login = Login()
        supportFragmentManager.beginTransaction().replace(R.id.contenedor,login).commit()
    }

    override fun enviarDatos(nombre: String) {
        val recetas = Recetas()
        val bundle:Bundle = Bundle()
        bundle.putString("nombre",nombre)
        val transaction = this.supportFragmentManager.beginTransaction()
        recetas.arguments = bundle
        transaction.replace(R.id.contenedor,recetas).commit()
    }

    override fun salir() {
        val login = Login()
        val transaction = this.supportFragmentManager.beginTransaction()
        transaction.replace(R.id.contenedor,login).commit()
    }

    override fun Comida(nombre: String) {
        val comida = com.example.fragmentos.Fragmentos.Comida()
        val bundle:Bundle = Bundle()
        bundle.putString("nombre",nombre)
        val transaction = this.supportFragmentManager.beginTransaction()
        comida.arguments = bundle
        transaction.replace(R.id.contenedor,comida).commit()
    }

    override fun Bebida(nombre: String) {
        val bebida = com.example.fragmentos.Fragmentos.Bebida()
        val bundle:Bundle = Bundle()
        bundle.putString("nombre",nombre)
        val transaction = this.supportFragmentManager.beginTransaction()
        bebida.arguments = bundle
        transaction.replace(R.id.contenedor,bebida).commit()
    }

    override fun Postre(nombre: String) {
        val postre = com.example.fragmentos.Fragmentos.Postre()
        val bundle:Bundle = Bundle()
        bundle.putString("nombre",nombre)
        val transaction = this.supportFragmentManager.beginTransaction()
        postre.arguments = bundle
        transaction.replace(R.id.contenedor,postre).commit()
    }
}