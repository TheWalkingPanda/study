package com.study.groovy
/**
 * Created by Administrator on 2017/5/18.
 */
class Groovy10_Map {
    static void main(String[] args) {
        def map = ["key1" : "value1", "key2" : "value2", "c++" : "value3"]
        println map.getClass().name

        println map["key1"]

        println map.key2

//        println map.c++ //坑

        println map."c++"

        map.each {entry -> println "key : $entry.key and value : $entry.value"}

        map.each {key, value -> println "key : $key and value : $value"}

        println map.collect {key, value ->
            value.replace("value", "v")
        }

        println map.find {key, value ->
            key == "key1" //groovy中，== 相当于java中 equals；Groovy 用 is 比较两个对象的引用是否相同
        }

        println map.findAll {key, value ->
            key.startsWith("key")
        }
    }
}
