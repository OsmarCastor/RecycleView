package castor.no.c.programar.recycleview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adaptador(context: Context, private var datos:List<Persona>):RecyclerView.Adapter<Adaptador.ViewHolderPersona>() {
    //Esta clase tiene la funcion de que agarre un cuadro y los llene de datos
    class ViewHolderPersona(item: View):RecyclerView.ViewHolder(item){
        var txtNombre:TextView = item.findViewById(R.id.txtNombre)
        var txtDom:TextView = item.findViewById(R.id.txtDomicilio)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderPersona {
        val layoutItem = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return ViewHolderPersona(layoutItem)
    }

    override fun onBindViewHolder(holder: ViewHolderPersona, position: Int) {
        val persona = datos[position]
        holder.txtNombre.text = persona.nombre
        holder.txtDom.text = persona.domicilio
    }

    override fun getItemCount(): Int = datos.size
}