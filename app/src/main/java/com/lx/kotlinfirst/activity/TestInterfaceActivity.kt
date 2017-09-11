package com.lx.kotlinfirst.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.lx.kotlinfirst.R
import com.lx.kotlinfirst.`class`.D
import com.lx.kotlinfirst.listener.FirstInterface
import com.lx.kotlinfirst.listener.SecondInterface
import com.lx.kotlinfirst.utils.Utils
import kotlinx.android.synthetic.main.activity_test_interface.*

class TestInterfaceActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_interface)
        interfaceTest.setOnClickListener { firstTest() }

    }

    private fun firstTest() {
        var a = AClass()

    }

    class AClass : FirstInterface, SecondInterface {


        override fun foo() {
            super<FirstInterface>.foo()
            super<SecondInterface>.foo()
        }

        override var str: String = ""
            get() = field
            set(value) {
                field = value
            }

        override fun main() {
            Utils.log("main")
        }

        override fun test(int: Int) {
            super.test(int)
        }
    }

    fun D.addFun(){

    }

}
