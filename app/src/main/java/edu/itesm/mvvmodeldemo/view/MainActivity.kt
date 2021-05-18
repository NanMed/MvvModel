package edu.itesm.mvvmodeldemo.view

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import edu.itesm.mvvmodeldemo.databinding.ActivityMainBinding
import edu.itesm.mvvmodeldemo.viewModel.MensajesViewModel


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val mensajesViewModel: MensajesViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mensajesViewModel.mensajesModelo.observe(this, Observer {
            // Actualizar la GUI
            binding.texto.text = it.mensaje
            val image = it.picture
            binding.foto.setImageResource(getResources().getIdentifier(image, "drawable", getPackageName()))
        })

        binding.container.setOnClickListener{
            mensajesViewModel.mensajeRandom()
        }
    }
}