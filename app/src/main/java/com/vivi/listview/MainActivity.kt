package com.vivi.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.AdapterView.OnItemClickListener
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import java.text.FieldPosition

class MainActivity : AppCompatActivity() {

    val name : String = "Mohan"
    val name_ = "fsdgdfg"
    var array= arrayOf("Melbourne", "Vienna", "Vancouver", "Toronto", "Calgary", "Adelaide", "Perth", "Auckland", "Helsinki", "Hamburg", "Munich", "New York", "Sydney", "Paris", "Cape Town", "Barcelona", "London", "Bangkok")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter =ArrayAdapter(this,R.layout.listview_item,array)
        val listView:ListView = findViewById(R.id.listview_1)
        listView.adapter = adapter
        listView.onItemClickListener = object : OnItemClickListener {
            override fun onItemClick(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                val itemValue = listView.getItemAtPosition(position) as String
                Toast.makeText(applicationContext,
                "Position : $position \n Item Value : $itemValue", Toast.LENGTH_SHORT).show()

            }
        }


    }
}