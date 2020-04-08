package com.mindorks.example.mergeadapter

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.MergeAdapter
import androidx.recyclerview.widget.RecyclerView
import com.mindorks.example.mergeadapter.adapter.AdAdapter
import com.mindorks.example.mergeadapter.adapter.MyDetailAdapter
import com.mindorks.example.mergeadapter.adapter.UsersAdapter
import com.mindorks.example.mergeadapter.data.DataSource
import com.mindorks.example.mergeadapter.data.model.MyDetail

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: MergeAdapter
    lateinit var userHorizontalAdapter: MyDetailAdapter
    lateinit var userVerticalAdapter: UsersAdapter
    lateinit var adAdapter: AdAdapter
    val myDetail = MyDetail(1, "Himanshu Singh", "I am an writer and Open Source contributor in MindOrks.")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupDataInRecyclerView()
    }

    private fun setupDataInRecyclerView() {
        recyclerView.layoutManager = LinearLayoutManager(this)
        userVerticalAdapter = UsersAdapter(DataSource.getUser())
        adAdapter = AdAdapter(DataSource.getAd())
        userHorizontalAdapter = MyDetailAdapter(myDetail)
        val listOfAdapters = listOf<RecyclerView.Adapter<out RecyclerView.ViewHolder>>(userHorizontalAdapter, userVerticalAdapter, adAdapter)
        adapter = MergeAdapter(listOfAdapters)
        recyclerView.adapter = adapter

    }
}