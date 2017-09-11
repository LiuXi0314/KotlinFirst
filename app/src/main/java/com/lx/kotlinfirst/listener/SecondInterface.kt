package com.lx.kotlinfirst.listener

import com.lx.kotlinfirst.utils.Utils

/**
 * Created on 17-9-11 下午4:12
 */
interface SecondInterface {
    fun foo() {
        Utils.log("second")
    }

    fun test(int: Int)
}