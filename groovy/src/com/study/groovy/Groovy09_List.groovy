package com.study.groovy

/**
 * Created by Administrator on 2017/5/17.
 */
class Groovy09_List {
    static void main(String[] args) {
        def list = [1, 2, 3, 4, 5]
        println list
        println list.getClass().name
        println list[-1]
        println list[2..4]

        list.each {println it}
        println list.collect {it * 2}

        println list.find {it > 3}
        println list.findAll {it > 3}

        println list.sum()
    }
}
