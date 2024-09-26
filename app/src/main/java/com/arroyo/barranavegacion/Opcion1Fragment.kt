package com.arroyo.barranavegacion

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.arroyo.barranavegacion.R

class Opcion1Fragment : Fragment() {
    fun crearVista(
        inflater: LayoutInflater,
        container:ViewGroup?,
        savedInstanceState: Bundle?
    ) {
        //Mostrar el diseño para el fragemeto creado
        return
        inflater.inflate(R.layout.fragment_opcion1,container, false)
    }
}