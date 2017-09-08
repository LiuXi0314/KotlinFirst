package com.lx.kotlinfirst.`class`

import com.lx.kotlinfirst.utils.Utils

/**
 * Created on 17-9-8 下午5:23
 */
class A constructor(str: String) {

    var a: String
        set(value) {
            a = value
        }
        get() = a

    var b: Boolean
        get() = b
        set(value) {
            b = value
        }

    //次级构造函数
    constructor(str: String, num: Int) : this(str) {
        Utils.log(str + "$num")


    }


}

