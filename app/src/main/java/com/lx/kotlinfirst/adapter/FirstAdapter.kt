package com.lx.kotlinfirst.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.lx.kotlinfirst.R
import com.lx.kotlinfirst.adapter.ViewHolder.FirstHolder
import com.lx.kotlinfirst.bean.ItemData

/**
 * Created on 17-9-6 下午5:04
 */
class FirstAdapter(private var list: List<ItemData>) : RecyclerView.Adapter<FirstHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): FirstHolder {
        return FirstHolder(LayoutInflater.from(parent!!.context).inflate(R.layout.item_list_content, null))
    }

    override fun getItemCount(): Int {
        return list!!.size
    }

    override fun onBindViewHolder(holder: FirstHolder?, position: Int) {
        holder!!.mId!!.text = list!![position].id
        holder!!.mContent!!.text = list!![position].content
    }


}
