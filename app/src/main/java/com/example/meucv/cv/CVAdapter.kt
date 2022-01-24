package com.example.meucv.cv

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.meucv.R
import org.w3c.dom.Text


class CVAdapter (private val lista: List<CVItem>): RecyclerView.Adapter<CVAdapter.CVViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CVViewHolder {
        val view: View
        view = LayoutInflater.from(parent.context).inflate(R.layout.item_cv,parent,false)
        return CVViewHolder(view)
    }

    override fun onBindViewHolder(holder: CVAdapter.CVViewHolder, position: Int) {
        holder.tvTitle.setText(lista.get(position).title)
        holder.tvDescription.setText(lista.get(position).description)
    }

    override fun getItemCount(): Int {
        return lista.size
    }
 class CVViewHolder : RecyclerView.ViewHolder{
        var tvTitle: TextView
        var tvDescription: TextView

     constructor(itemView: View) : super(itemView){
        tvTitle = itemView.findViewById(R.id.item_cv_title)
          tvDescription = itemView.findViewById(R.id.item_cv_description)
     }

 }
}


