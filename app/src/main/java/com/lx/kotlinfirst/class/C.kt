package com.lx.kotlinfirst.`class`

import com.lx.kotlinfirst.utils.Utils

/**
 * 测试内部类和类的嵌套
 *
 * Created on 17-9-8 下午5:57
 */
class C {
    var str: String = ""

    init {
        str = "C"
    }

    inner class innerClass() {
        //内部类可以获取外部类的引用，这不同于类的嵌套
        var s = "inner"

        fun innerTest() {
            var text = this@C
            Utils.log(text.str)
            text.str = s
            Utils.log(text.str)
        }
    }

    class errorClass() {
        var eee = this@errorClass
    }

}