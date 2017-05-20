package com.study.groovy

/**
 * Created by Administrator on 2017/5/15.
 */
class Groovy06_Boolean {
    static void main (String[] args) {
        //检查该引用是否为null，null 为 false；非null 为true（如果对象的类型为集合，则集合中必须有一个元素，才为true，否则为false）

        def str1 = null
        if (!str1) {
            println "str1 is null"
        }

        def str2 = "not null"
        if (str2) {
            println str2
        }
    }
}
