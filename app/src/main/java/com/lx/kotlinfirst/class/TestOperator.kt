package com.lx.kotlinfirst.`class`

import com.lx.kotlinfirst.utils.Utils

/**
 * Created by liuxi on 2018/3/22.
 */
class TestOperator {

    class DataPlus(var a: Int, var b: Int) {

        operator fun plus(other: DataPlus): DataPlus {
            var newData = DataPlus(a + other.a, b + other.b)
            Utils.log(newData.toString())
            return newData
        }

        override fun toString(): String {
            return "DataPlus(a=$a, b=$b)"
        }

    }
}



