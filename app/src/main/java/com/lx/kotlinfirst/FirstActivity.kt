package com.lx.kotlinfirst

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log

class FirstActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        findViewById(R.id.baseFun).setOnClickListener {

        }


    }

    private var sumaaaa: (a: Int, b: Int) -> Int = { x, y -> x + y }

    fun doSomeThing(){
        val demo = object {
            var x : Int = 10
            var y = 11
        }
        var a = sumaaaa(1, 2)
        var s = "ssssssssssss"
        Log.d("first", "$s.length = ${s.length}")
        Log.d("first", "demo.x=${demo.x}")
        Log.d("first", "demo.y=${demo.y}")

        Log.d("first","Hello.x=${Hello.x}")
    }



}
