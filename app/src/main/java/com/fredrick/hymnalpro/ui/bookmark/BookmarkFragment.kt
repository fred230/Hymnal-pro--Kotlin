package com.fredrick.hymnalpro.ui.bookmark

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import androidx.fragment.app.Fragment

import com.fredrick.hymnalpro.R


class BookmarkFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ):View{
        val root:View = inflater.inflate(R.layout.fragment_bookmark, container,  false)
        return root



    }

    override fun onDestroyView() {
        super.onDestroyView()

    }
}