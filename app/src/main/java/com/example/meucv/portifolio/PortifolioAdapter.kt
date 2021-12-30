package com.example.meucv.portifolio

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.meucv.R


class PortifolioAdapter(private val listaPorti: List<PortifolioItem> ) : RecyclerView.Adapter<PortifolioAdapter.PortifolioViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PortifolioViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val contactView = inflater.inflate(R.layout.item_portifolio, parent, false)

        return PortifolioViewHolder(contactView)
    }

    override fun onBindViewHolder(holder: PortifolioViewHolder, position: Int) {
          Glide.with(holder.itemView.context).load(listaPorti.get(position).img).into(holder.tvPosition)
       // holder.tvPosition.setText(position.toString())



    }

    override fun getItemCount(): Int {
        return listaPorti.size
    }
    class PortifolioViewHolder : RecyclerView.ViewHolder {

        var tvPosition : ImageView

        constructor(itemView: View) : super(itemView){
            tvPosition = itemView.findViewById(R.id.item_portfolio_img)
        }
    }
}


