package com.example.meucv.team

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.meucv.R


class TeamAdapter(private val mdata: List<TeamItem>) : RecyclerView.Adapter<TeamAdapter.TeamViewHolder>(){



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TeamViewHolder {
        val view: View
        view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_team,parent,false)

        return TeamViewHolder(view)
    }

    override fun onBindViewHolder(holder: TeamViewHolder, position: Int) {
        holder.tv_name.setText(mdata.get(position).name)
        holder.tv_desc.setText(mdata.get(position).desc)
        mdata.get(position).img?.let { holder.imag.setImageResource(it) }
    }

    override fun getItemCount(): Int {
        return mdata.size
    }
    class TeamViewHolder : RecyclerView.ViewHolder{

        var tv_name: TextView
        var tv_desc: TextView
        var imag: ImageView

        constructor(itemView: View) : super(itemView){
            tv_name = itemView.findViewById(R.id.team_item_name)
            tv_desc = itemView.findViewById(R.id.team_item_desc)
            imag = itemView.findViewById(R.id.team_item_img)
        }
    }
}


