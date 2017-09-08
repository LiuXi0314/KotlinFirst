package com.lx.kotlinfirst.`class`

/**
 * Created on 17-9-8 下午5:56
 */
abstract class B {
    init {

    }

    abstract fun f()


    abstract class b : B() {
        override abstract fun f()
    }


}