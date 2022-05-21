package castor.no.c.programar.recycleview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recycler:RecyclerView
    // lo hacemos estatico y no se necesita una instancia para poderlo utilizar
    companion object{
        val personas = ArrayList<Persona>()
    }
    fun abrirAregar(v: View){
        val intent = Intent(this, AgregarPersona::class.java)
        startActivity(intent)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recycler = findViewById(R.id.rv_persona)
    }
    override fun onPostResume() {
        super.onPostResume()
        actualizarRecyvler()
    }
    fun actualizarRecyvler(){
        val adaptador = Adaptador(this, personas)
        recycler.adapter = adaptador
    }

}