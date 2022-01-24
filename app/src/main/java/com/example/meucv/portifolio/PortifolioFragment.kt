package com.example.meucv.portifolio

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.meucv.R


class PortifolioFragment : Fragment(), PortifolioCallback {

    private lateinit var listaPort: MutableList<PortifolioItem>
    private lateinit var rv_portifolio: RecyclerView
    private lateinit var portifolioAdapter: PortifolioAdapter


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_portifolio, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rv_portifolio = view.findViewById(R.id.rv_portifolio)

        listaPort = mutableListOf()
        listaPort.add(PortifolioItem(R.drawable.project1,"Projeto 1", "Sem Descrição"))
        listaPort.add(PortifolioItem(R.drawable.project2,"Projeto 2", "Sem Descrição"))
        listaPort.add(PortifolioItem(R.drawable.project3,"Projeto 3", "Sem Descrição"))
        listaPort.add(PortifolioItem(R.drawable.project4,"Projeto 4", "Sem Descrição"))
        listaPort.add(PortifolioItem(R.drawable.project5,"Projeto 5", "Sem Descrição"))
        listaPort.add(PortifolioItem(R.drawable.project6,"Projeto 6", "Sem Descrição"))
        listaPort.add(PortifolioItem(R.drawable.project7,"Projeto 7", "Sem Descrição"))
        listaPort.add(PortifolioItem(R.drawable.project0,"Projeto 8", "Sem Descrição"))
        listaPort.add(PortifolioItem(R.drawable.profile,"Projeto 9", "Sem Descrição"))

        portifolioAdapter = PortifolioAdapter(listaPort,this)

        //Grid
        rv_portifolio.layoutManager = GridLayoutManager(activity,3)
        rv_portifolio.adapter = portifolioAdapter
    }

    override fun onPortifolioItemClick(pos: Int) {

        val portfolioFragmentDetails = PortifolioFragmentDetails()

        val bundle = Bundle()
        bundle.putSerializable("object",listaPort.get(pos))
        portfolioFragmentDetails.arguments = bundle

        activity?.let { portfolioFragmentDetails.show(it.supportFragmentManager,"tagname") }
    }


}