package com.example.meucv.portifolio

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.meucv.R


class PortifolioFragment : Fragment() {

    private lateinit var listaPort: List<PortifolioItem>
    private lateinit var rv_portifolio: RecyclerView
    private lateinit var portifolioAdapter: PortifolioAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_portifolio, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rv_portifolio = view.findViewById(R.id.rv_portifolio)

        listaPort = ArrayList()
        (listaPort as ArrayList<PortifolioItem>).add(PortifolioItem())
        (listaPort as ArrayList<PortifolioItem>).add(PortifolioItem())
        (listaPort as ArrayList<PortifolioItem>).add(PortifolioItem())
        (listaPort as ArrayList<PortifolioItem>).add(PortifolioItem())
        (listaPort as ArrayList<PortifolioItem>).add(PortifolioItem())
        (listaPort as ArrayList<PortifolioItem>).add(PortifolioItem())
        (listaPort as ArrayList<PortifolioItem>).add(PortifolioItem())
        (listaPort as ArrayList<PortifolioItem>).add(PortifolioItem())
        (listaPort as ArrayList<PortifolioItem>).add(PortifolioItem())

        portifolioAdapter = PortifolioAdapter(listaPort)
        rv_portifolio.layoutManager = GridLayoutManager(activity,3)
        rv_portifolio.setHasFixedSize(true)
        rv_portifolio.adapter = portifolioAdapter
    }
}