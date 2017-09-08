package com.lx.kotlinfirst.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import com.lx.kotlinfirst.R
import com.lx.kotlinfirst.common.Hello
import com.lx.kotlinfirst.utils.Utils

class BaseFunActivity : AppCompatActivity() {

    private var textView: TextView? = null //可变变量 var

    private var finalTextView: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base_fun)
        initView()
        vars(1, 2, 3, 4, 5, 6, 7, 8, 9, 1111231231)

    }

    private fun initView() {
        findViewById(R.id.firstButton).setOnClickListener { testTextView() }
        findViewById(R.id.secondButton).setOnClickListener { doSomeThing() }
        findViewById(R.id.label).setOnClickListener { testLabel() }
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

    private fun sum(a: Int, b: Int): Int {
        return a + b
    }

    private var sum: (a: Int, b: Int) -> Int = { x, y -> x + y }

    private var multiplication: (a: Int, b: Int) -> Int = { a, b -> a * b }


    /**
     * 可变长参函数
     */
    fun vars(vararg v: Int) {
        for (i in v) {
            Log.d("first", "$i")
        }

    }

    fun test(a: Int) {
        if (a in 1..10) {
            Log.d("first", "ssssssss")
        }
    }

    fun testFor(list: List<String>) {
        for (str in list) {
            Log.d("test", str)
        }
    }


    private fun testLabel() {
        //break ,continue 功效一样
        //loop@ continue@loop break@loop
        Utils.log("----------------------------------------")
        for (i in 1..2) {
            for (j in 1..2) {
                if (i == 1 && j == 1) continue
                Utils.log("$i-------$j")
            }
        }

        Utils.log("----------------------------------------")
        loop@ for (i in 1..2) {
            for (j in 1..2) {
                if (i == 1 && j == 1) continue@loop
                Utils.log("$i-------$j")
            }
        }
        Utils.log("----------------------------------------")

        val arrays = intArrayOf(1, 0, 2)
        //lit@
        arrays.forEach lit@ {
            if (it == 0) return@lit
            Utils.log("--------------$it")
        }
        Utils.log("----------------------------------------")
        //匿名标签
        arrays.forEach {
            if (it == 0) return@forEach
            Utils.log("--------------$it")
        }
        Utils.log("----------------------------------------")
//        arrays.forEach {
//            if (it == 0) return
//            Utils.log("--------------$it")
//        }
//        Utils.log("----------------------------------------")
        //匿名函数类
        arrays.forEach {
            fun(it: Int) {
                if (it == 0) return
                Utils.log("$it")
            }
        }

    }


}
