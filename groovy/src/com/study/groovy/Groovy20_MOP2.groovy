package com.study.groovy

/**
 * Created by Administrator on 2017/6/5.
 */
class Groovy20_MOP2 implements GroovyInterceptable {

    def test1 () {
        println "test1"
    }

    def test2 () {
        println "test2"
    }

    def invokeMethod (String name, args) {
        System.out.println("name :" + name)
//        Groovy20_MOP2.metaClass.invokeMethod(this, name, args)
    }







    static void main(String[] args) {
        Groovy20_MOP2 test = new Groovy20_MOP2()
        test.test1()
        test.test2()
    }
}
