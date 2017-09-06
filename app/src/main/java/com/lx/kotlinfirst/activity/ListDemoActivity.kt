package com.lx.kotlinfirst.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.lx.kotlinfirst.R
import com.lx.kotlinfirst.adapter.FirstAdapter
import com.lx.kotlinfirst.bean.ItemData

class ListDemoActivity : AppCompatActivity() {

    var dataList: MutableList<ItemData> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_demo)
        setTitle("List Demo")
        dataList = arrayListOf()
        initRecyclerView()
    }

    private fun initRecyclerView() {
        var mRecyclerView = findViewById(R.id.recyclerView) as RecyclerView
        mRecyclerView.layoutManager = LinearLayoutManager(this)
        mRecyclerView.adapter = FirstAdapter(dataList)
        initData()
        mRecyclerView.adapter.notifyDataSetChanged()
    }

    private fun initData() {
        dataList.clear()
        for (i in 1..30) {
            dataList.add(ItemData("$i", "这是第 $i 条内容"))
        }

    }


}
