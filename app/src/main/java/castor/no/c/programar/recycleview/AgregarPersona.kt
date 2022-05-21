package castor.no.c.programar.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class AgregarPersona : AppCompatActivity() {
    lateinit var txtNombre: EditText
    lateinit var txtDomicilio:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agregar_persona)
        txtNombre = findViewById(R.id.txtPersona)
        txtDomicilio = findViewById(R.id.txtDom)
    }
    fun agregarDato(v: View) {
        //Aqui hago la lectura de los campos de texto
        val nombre = txtNombre.text.toString()
        val domicilio = txtDomicilio.text.toString()
        val persona = Persona(nombre, domicilio)
        MainActivity.personas.add(persona)
        Toast.makeText(this, "Se agrego una persona", Toast.LENGTH_LONG).show()
        finish()
    }
}