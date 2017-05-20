package com.study.groovy

/**
 * Created by Administrator on 2017/5/18.
 */
class Groovy11_GDK {
    static void main(String[] args) {
        def str = "hello world"
        println str
        println str.dump()

        def list = [1, 2]
        list.add(3)
        list.add(4)
        println list.size()
        println list.contains(2)

        def list2 = [1, 2]
        list2.with {        //创建一个上下文，在with作用域内调用的任何方法，都会被定向到该上下文对象
            add(3)
            add(4)
            println size()
            println contains(2)
        }
        println Thread.currentThread().name
        def thread = Thread.start {
            println Thread.currentThread().name
            def startTime = System.currentTimeMillis()
            new Object().sleep(1000)
            def endTime = System.currentTimeMillis()
            println "startTime : $startTime, endTime : $endTime"
        }
    }
}
