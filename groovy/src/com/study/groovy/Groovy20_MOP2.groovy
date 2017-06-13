package com.study.groovy

import com.study.groovy.java.Test

/**
 * Created by Administrator on 2017/6/5.
 */
class Groovy20_MOP2 implements GroovyInterceptable {

    def test1 () {
        System.out.println("test1")
    }

    def test2 () {
        System.out.println("test2")
    }

    def invokeMethod (String name, args) {
        System.out.println("name :" + name)
        Groovy20_MOP2.metaClass.invokeMethod(this, name, args)
    }

    static void main(String[] args) {
        //use GroovyInterceptable
        Groovy20_MOP2 test = new Groovy20_MOP2()
        test.test1()
        test.test2()

        //use metaclass
        Test javaTest = new Test()
        javaTest.metaClass.invokeMethod = {String name, args1 ->
            System.out.println("name : $name")
            Test.metaClass.invokeMethod(javaTest, name, args1)
        }
        javaTest.test1()
        javaTest.test2()
    }
}
