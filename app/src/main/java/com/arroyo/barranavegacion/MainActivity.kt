package com.arroyo.barranavegacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.fragment.app.Fragment
import com.arroyo.barranavegacion.ui.theme.BarraNavegacionTheme
import com.google.android.material.bottomnavigation.BottomNavigationView
//Importacion de los fragemetnos de la navegacion
import com.arroyo.barranavegacion.Opcion1Fragment
import com.arroyo.barranavegacion.Opcion2Fragment
import com.arroyo.barranavegacion.Opcion3Fragment
import com.arroyo.barranavegacion.Opcion4Fragment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Variable para crear la navegacion
        val barraNavegacionView = findViewById<BottomNavigationView>(R.id.barra_navegacion)
        //Definir el fragmento por defecto pantalla inicial
        cargarFragmentos(Opcion1Fragment())

        /*/Configurar la barra de navegacion
        barraNavegacionView.setOnNavigationItemReselectedListener { menu ->
            var seleccionFragemento: Fragment? = null
            when (menu.itemId) {
                R.id.nav_inicio -> seleccionFragemento = Opcion1Fragment()
                R.id.nav_opcion2 -> seleccionFragemento = Opcion2Fragment()
                R.id.nav_opcion3 -> seleccionFragemento = Opcion3Fragment()
                R.id.nav_opcion4 -> seleccionFragemento = Opcion4Fragment()
            }
            if (seleccionFragemento != null) {
                cargarFragmentos(seleccionFragemento)
            }
            true
        }*/

        /*/Alternativa para metodos depreciados
        barraNavegacionView.setOnApplyWindowInsetsListener{
            menu->
            var seleccionFragemento:Fragment?=null
        }*/
        //Alternativa 2
        barraNavegacionView.setOnItemReselectedListener {
            menu->
            var seleccionFragemento: Fragment? = null
            when (menu.itemId) {
                R.id.nav_inicio -> seleccionFragemento = Opcion1Fragment()
                R.id.nav_opcion2 -> seleccionFragemento = Opcion2Fragment()
                R.id.nav_opcion3 -> seleccionFragemento = Opcion3Fragment()
                R.id.nav_opcion4 -> seleccionFragemento = Opcion4Fragment()
            }
            if (seleccionFragemento!=null){
                cargarFragmentos(seleccionFragemento)
            }
            true
        }

    }
    //Funcion para cargar los fragmentos
    private fun cargarFragmentos(fragment: Fragment){
       // supporFragementManager.beginTransaction()
         //   .replace(R.id.nav_host_fragemento,fragment)
           //  .comit()
    }

}
