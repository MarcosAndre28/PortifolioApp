package com.example.meucv.portifolio

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.meucv.R
import com.google.android.material.bottomsheet.BottomSheetDialogFragment



class PortifolioFragmentDetails : BottomSheetDialogFragment() {

    private lateinit var listaPort: MutableList<PortifolioItem>
    lateinit var imgPortifolio: ImageView
    lateinit var title: TextView
    lateinit var descripition: TextView

    fun PortifolioFragmentDetails(){

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_portifolio_details, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        imgPortifolio = view.findViewById(R.id.portfolio_details_img)
        title = view.findViewById(R.id.portifolio_datails_name)
        descripition = view.findViewById(R.id.portifolio_datails_desc)
        val bundle : Bundle? = arguments
        val item: PortifolioItem = bundle!!.getSerializable("object") as PortifolioItem
        loadPortifolioData(item)
    }
    fun loadPortifolioData(item: PortifolioItem){
        context?.let { Glide.with(it).load(item.img).into(imgPortifolio) }
        title.setText(item.title)
        descripition.setText(item.description)


    }
}


