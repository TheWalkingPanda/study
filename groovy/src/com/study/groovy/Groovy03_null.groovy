package com.study.groovy

/**
 * Created by Administrator on 2017/5/15.
 */
class Groovy03_null {
    static void main(String[] args) {
        println foo("test")
        println foo(null)
    }

    static def foo (str) {
        // [?.] 只有str不为null时才调用reverse()
        str?.reverse()
    }
}
