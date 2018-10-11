package com.example.kamal.listviewtestingwithadapter

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.BaseAdapter
import android.widget.ListView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listView)
        val adapter = CustomAdapter(this)
        var arrList = ArrayList<String>()
        //val adapter2= ArrayAdapter(this, android.R.layout.simple_list_item_1, arrList)
        listView.adapter = adapter
    }

    class CustomAdapter(context : Context): BaseAdapter()
    {


        var mContext:Context
        init
        {
            mContext = context
        }
        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
//            var textView = TextView(mContext)
//            textView.text = "Welcome to KIT"
//            return textView

            var inflator = LayoutInflater.from(mContext)
            var view  = inflator.inflate(R.layout.my_list, parent, false)

            val  name = view.findViewById<TextView>(R.id.name)
            name.text = StudentContainer.arrList.get(position).name
            val  email = view.findViewById<TextView>(R.id.email)
            email.text = StudentContainer.arrList.get(position).email
            val mobile = view.findViewById<TextView>(R.id.phone)
            mobile.text = StudentContainer.arrList.get(position).email
            return view
        }

        override fun getItem(position: Int): Any {
            return "Hi"
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getCount(): Int {
            return StudentContainer.arrList.size
        }
    }
}