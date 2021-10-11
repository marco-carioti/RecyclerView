package Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recyclerview.Mondo
import com.example.recyclerview.R

class CityAdapter(val list:List<Mondo>, val context: Context): RecyclerView.Adapter<CityAdapter.CustomViewHolder>() {

    inner class CustomViewHolder(view:View):RecyclerView.ViewHolder(view){
        lateinit var immagine1:ImageView
        lateinit var titolo1:TextView
        lateinit var desrizione1:TextView
        init {
            immagine1=view.findViewById(R.id.immagine)
            titolo1=view.findViewById(R.id.titolo)
            desrizione1=view.findViewById(R.id.descrizione)
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CustomViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.card_view,parent,false)
       return CustomViewHolder(view)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        val mondo = list[position]
        Glide.with(context).load(mondo.imgUrl).into(holder.immagine1)
        holder.titolo1.text = mondo.nome_citta
        holder.desrizione1.text=mondo.descrizione_citta
    }

    override fun getItemCount()=list.size
}