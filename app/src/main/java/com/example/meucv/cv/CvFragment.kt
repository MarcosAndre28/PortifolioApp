package com.example.meucv.cv

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.meucv.R


class CvFragment : Fragment() {


    lateinit var  RvCv : RecyclerView
    lateinit var  adpater: CVAdapter
    lateinit var items: List<CVItem>

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        RvCv = view.findViewById(R.id.recycleview_cv)


        items = ArrayList<CVItem>()
        (items as ArrayList<CVItem>).add(CVItem("20 April 2013", getString(R.string.Kotlin_text2)))

        adpater = CVAdapter(items)
        RvCv.setLayoutManager( LinearLayoutManager(getContext()))
        RvCv.setAdapter(adpater)
    }




    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_cv, container, false)
    }

}




