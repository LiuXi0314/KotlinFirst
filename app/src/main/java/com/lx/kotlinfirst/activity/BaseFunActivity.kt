package com.lx.kotlinfirst.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import com.lx.kotlinfirst.Hello
import com.lx.kotlinfirst.R

class BaseFunActivity : AppCompatActivity() {

    private var textView: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base_fun)
        initView()

    }

    private fun initView() {
        findViewById(R.id.firstButton).setOnClickListener { testTextView() }
        findViewById(R.id.secondButton).setOnClickListener { doSomeThing() }
    }

    private fun testTextView() {
        textView = findViewById(R.id.firstButton) as TextView
        textView!!.text = "第一次尝试构建一个button"
        textView!!.setTextColor(getColor(R.color.colorAccent))
        textView!!.textSize = 14f
        textView!!.setOnClickListener { Toast.makeText(this, "无敌变换", Toast.LENGTH_LONG).show() }
    }


    private fun doSomeThing() {
        val demo = object {
            var x: Int = 10
            var y = 11
        }
        var a = sum(1, 2)
        var s = "一段文本"
        Log.d("first", "$s.length = ${s.length}")
        Log.d("first", "demo.x=${demo.x}")
        Log.d("first", "demo.y=${demo.y}")

        Log.d("first", "Hello.x=${Hello.x}")
    }

    private var sum: (a: Int, b: Int) -> Int = { x, y -> x + y }
}
