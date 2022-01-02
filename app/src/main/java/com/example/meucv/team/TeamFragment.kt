package com.example.meucv.team

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.meucv.R


class TeamFragment : Fragment() {


    private lateinit var  RvTeam : RecyclerView
    private lateinit var  adapter: TeamAdapter
    private lateinit var listaTeam: List<TeamItem>

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        RvTeam = view.findViewById(R.id.rv_team)

        val item =TeamItem("Desenvolvimento Kotlin Iniciante",getString(R.string.curso_Kotlin1),R.drawable.kotlin)


        listaTeam = ArrayList<TeamItem>()
        (listaTeam as ArrayList<TeamItem>).add(item)


        RvTeam.setLayoutManager( LinearLayoutManager(getContext()))
        adapter = TeamAdapter(listaTeam)
        RvTeam.setAdapter(adapter)





    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_team, container, false)
    }


}