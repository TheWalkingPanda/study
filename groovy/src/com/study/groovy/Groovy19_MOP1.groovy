package com.study.groovy

/**
 * Created by Administrator on 2017/6/5.
 */
class Groovy19_MOP1 {
    static void main(String[] args) {
        String.metaClass.hello = {name ->
            println "hello $name"
        }

        String test = "test"
        test.hello("test")

        String test2 = "test2"
        test2.hello("test2")

        test.metaClass.objHello = {name ->
            println "obj hello $name"
        }

        test.objHello("obj")
//        test2.objHello("obj2")
    }
}
