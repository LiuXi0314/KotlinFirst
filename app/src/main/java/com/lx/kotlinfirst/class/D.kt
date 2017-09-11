package com.lx.kotlinfirst.`class`

/**
 *
 * abstract    // 抽象类
 * final       // 类不可继承，默认属性
 * enum        // 枚举类
 * open        // 类可继承，类默认是final的
 * annotation  // 注解类
 *
 * private    // 仅在同一个文件中可见
 * protected  // 同一个文件中或子类可见
 * public     // 所有调用的地方都可见
 * internal   // 同一个模块中可见
 *
 * Created on 17-9-8 下午6:10
 */
open class D {

    open class D1() : D() {

    }

    class D2 : D1() { //类默认为 final,无法被继承，open标志次类可以被继承

    }

    annotation class D3//注解类

    open fun dFun(){

    }


}