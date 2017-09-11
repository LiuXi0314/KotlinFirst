package com.lx.kotlinfirst.activity

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.lx.kotlinfirst.R
import kotlinx.android.synthetic.main.activity_first.*

class FirstActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        baseFun.setOnClickListener {
            startActivity(Intent().setClass(this, BaseFunActivity::class.java))
        }

        drawActivity.setOnClickListener {
            startActivity(Intent().setClass(this, DrawActivity::class.java))
        }

        listDemo.setOnClickListener {
            startActivity(Intent().setClass(this, ListDemoActivity::class.java))
        }

        listExample.setOnClickListener {
            startActivity(Intent().setClass(this, ItemListActivity::class.java))
        }

        testClass.setOnClickListener {
            startActivity(Intent().setClass(this, TestClassActivity::class.java))
        }

        testInterface.setOnClickListener {
            startActivity(Intent().setClass(this, TestInterfaceActivity::class.java))
        }

        testData.setOnClickListener {
            startActivity(Intent().setClass(this, TestDataActivity::class.java))
        }
    }


}
