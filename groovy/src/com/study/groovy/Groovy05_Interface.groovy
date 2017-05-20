package com.study.groovy
/**
 * Created by Administrator on 2017/5/15.
 */
class Groovy05_Interface {
    static void main (String[] args) {
        //java
        testInterface(new InterfaceTest1(){

            @Override
            void test() {
                println 123
            }

            @Override
            void test2() {
                println 666
            }
        })

        def test = [
                test : {println "test1666"},
                test2 : {println "test2666"}
        ]
        testInterface2(test as InterfaceTest1)


    }

    static void testInterface (InterfaceTest1 test) {
        test.test2()
    }

    static void testInterface2 (InterfaceTest1 test) {
        test.test()
    }

}

interface InterfaceTest1 {
   void test()
    void test2()
}
