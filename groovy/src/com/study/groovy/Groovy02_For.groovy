package com.study.groovy

/**
 * Created by Administrator on 2017/5/15.
 */
class Groovy02_For {
    static void main (String[] args) {
        for (i in 0..2) {
            println(i)
        }
        println "------"
        for (int i = 0; i < 3; i++) {
            println(i)
        }
        println "------"
        0.upto(2) {println("$it")}
        println "------"
        3.times {println("$it")}
        println "------"
        0.step(10, 2) {println("$it")}

    }
}
