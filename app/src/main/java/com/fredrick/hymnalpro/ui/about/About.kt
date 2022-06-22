package com.fredrick.hymnalpro.ui.about

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.fredrick.hymnalpro.R


class aboutFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ):View{
        val root:View = inflater.inflate(R.layout.fragment_about, container,  false)
        return root

    }



    override fun onDestroyView() {
        super.onDestroyView()

    }
}