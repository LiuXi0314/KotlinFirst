package com.lx.kotlinfirst.activity

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.lx.kotlinfirst.R
import com.lx.kotlinfirst.common.Hello

class FirstActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        Hello.x

        findViewById(R.id.baseFun).setOnClickListener {
            startActivity(Intent().setClass(this, BaseFunActivity::class.java))
        }

        findViewById(R.id.drawActivity).setOnClickListener {
            startActivity(Intent().setClass(this, DrawActivity::class.java))
        }

        findViewById(R.id.listDemo).setOnClickListener {
            startActivity(Intent().setClass(this, ListDemoActivity::class.java))
        }

        findViewById(R.id.listExample).setOnClickListener {
            startActivity(Intent().setClass(this, ItemListActivity::class.java))
        }

    }


}
