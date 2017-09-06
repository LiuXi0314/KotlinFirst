package com.lx.kotlinfirst.adapter.ViewHolder

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import com.lx.kotlinfirst.R

/**
 * Created on 17-9-6 下午5:09
 */
class FirstHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {

    var mContent: TextView? = null
    var mId: TextView? = null

    init {
        mId = itemView!!.findViewById(R.id.id)
        mContent = itemView!!.findViewById(R.id.content)
    }

    override fun toString(): String {
        return "FirstHolder(mContent=$mContent, mId=$mId)"
    }

}