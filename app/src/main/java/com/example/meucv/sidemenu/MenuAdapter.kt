package com.example.meucv.sidemenu

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.meucv.R

class MenuAdapter(private var listaMenu: List<MenuItem>) : RecyclerView.Adapter<MenuAdapter.MenuViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val contactView = inflater.inflate(R.layout.item_menu, parent, false)
        return MenuViewHolder(contactView)
    }

    override fun onBindViewHolder(holder: MenuViewHolder, position: Int) {
        listaMenu.get(position).icon?.let { holder.icon.setImageResource(it) }
        if (listaMenu.get(position).isSelected == true){
            holder.isSelected.setVisibility(View.VISIBLE)
        }else{
            holder.isSelected.setVisibility(View.INVISIBLE)
        }
    }

    override fun getItemCount(): Int {
       return listaMenu.size
    }

    class  MenuViewHolder : RecyclerView.ViewHolder {

        var icon : ImageView
        var isSelected : ImageView

        constructor(itemView: View) : super(itemView){

            icon = itemView.findViewById(R.id.item_menu_icon)
            isSelected = itemView.findViewById(R.id.item_menu_selected)
        }
    }
}