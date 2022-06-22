package com.fredrick.hymnalpro.ui.home

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView.OnItemClickListener
import android.widget.ListView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import com.fredrick.hymnalpro.LyricsActivity
import com.fredrick.hymnalpro.R
import android.widget.ArrayAdapter as ArrayAdapter1

class HomeFragment : Fragment() {
    lateinit var context:Activity
    lateinit var bundle:Bundle

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


        //drawer buttons
        listView.onItemClickListener =
            OnItemClickListener { parent, view, i, l -> //initializing intent
                context = activity as FragmentActivity

            val intent = Intent(context, LyricsActivity::class.java)

                //getting hymn title of a selection
                val title = listView.adapter.getItem(i).toString()


                //retrieving selected number of hymn
                var stateName = listView.adapter.getItem(i).toString()
                stateName = stateName.substring(0, stateName.indexOf(" ")).trim { it <= ' ' }


                //short service for our media player- midi selection number
                var x = stateName.toInt()
                x = x - 1

                //hymn lyrics  selection number
                val z = stateName.toInt()
                val strLyric = lyrics[z - 1]

                    intent.putExtra("title", title)

                intent.putExtra("lyric", strLyric)

                //short service for sending the number of selected midi to our midi player
                intent.putExtra("midi", x)

                context.startActivity(intent)



            }


    }
}