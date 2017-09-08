package com.lx.kotlinfirst.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.lx.kotlinfirst.R
import com.lx.kotlinfirst.`class`.A
import com.lx.kotlinfirst.`class`.C
import com.lx.kotlinfirst.utils.Utils

class TestClassActivity : AppCompatActivity() {

    var name: String? = null

    init {
        Utils.log("test")
    }

    private var num: Int = 0
            //后端变量机制 关键字field,只能用于属性的访问器
        get() = field
        set(value) {
            field = if (value > 20)
                value
            else
                1
            Utils.log("$num-----------")
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_class)
        test("s")

    }

    fun test(str: String) {
        num = 0
        num = 21
        var c = C()
        c.innerClass().innerTest()
    }

    var a = A("ss")
    var aa = A("ss", 1)


}
