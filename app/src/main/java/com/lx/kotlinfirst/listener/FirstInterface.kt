package com.lx.kotlinfirst.listener

import com.lx.kotlinfirst.utils.Utils

/**
 * Created on 17-9-11 下午3:53
 */
interface FirstInterface {

    var str: String
    fun main()

    fun test(int: Int){

    }


    fun foo(){
        Utils.log("first")
    }


}