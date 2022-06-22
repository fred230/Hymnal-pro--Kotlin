package com.fredrick.hymnalpro.ui.home

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView

import androidx.fragment.app.Fragment
import com.fredrick.hymnalpro.R
import android.widget.ArrayAdapter as ArrayAdapter1

class HomeFragment : Fragment() {
    lateinit var context:Activity

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val view:View =  inflater.inflate(R.layout.fragment_home, container,  false)
        return view


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val listView = view.findViewById<ListView>(R.id.listview)
        val hymns = resources.getStringArray(R.array.hymn)
        val lyrics = resources.getStringArray(R.array.hymn_lyrics)

        val arrayAdapter =  ArrayAdapter1<String>(activity!!, android.R.layout.simple_list_item_1, hymns)

        listView.adapter = arrayAdapter


    }






}