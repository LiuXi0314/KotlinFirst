package com.lx.kotlinfirst.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.lx.kotlinfirst.R
import com.lx.kotlinfirst.utils.Utils
import kotlinx.android.synthetic.main.activity_test_data.*

class TestDataActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_data)
        test.setOnClickListener { test() }
    }

    private fun test() {
        var a = sealedClass.A("")
        var b = sealedClass.B(1)
        test(a)
        test(b)

    }

    /*
    *  密封类 test
    * */
    sealed class sealedClass {
        data class A(var srt: String) : sealedClass()
        data class B(var int: Int) : sealedClass()

    }

    fun test(sea: sealedClass): Int = when (sea) {
        is sealedClass.A -> {
            log("a")

        }
        is sealedClass.B -> {
            log("b")
        }

    }

    fun log(str: String): Int {
        Utils.log(str)
        return 1
    }


}
