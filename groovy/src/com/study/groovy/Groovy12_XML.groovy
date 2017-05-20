package com.study.groovy

/**
 * Created by Administrator on 2017/5/20.
 */
class Groovy12_XML {
    static void main(String[] args) {
        def xml = new XmlParser().parse("F:\\study\\groovy\\src\\res\\tests.xml")

        println "type = ${xml.attribute("type")}"

        xml.test.each {
            println it.attribute("name")
            println it.text()
            println "${it.@name} : ${it.text()}"
        }

        println "============================================================="

        // 对于较大的xml，使用XmlSlurper节省内存，他执行惰性请求，开销更低
        def xml2 = new XmlSlurper().parse("F:\\study\\groovy\\src\\res\\tests.xml")
        println "type = ${xml.@type}"
        xml2.test.each {
            println "${it.@name} : ${it.text()}"
        }

        println "============================================================="

        def map = ["key1" : "val1", "key2" : "val2", "key3" : "val3"]
        def content = ""
        map.each { key, val ->
            def tmp = """
                <test name="${key}">
                    <value>${val}</value>
                </test>
            """
            content += tmp
        }

        def result = "<tests>${content}</tests>"
        println result
    }
}
