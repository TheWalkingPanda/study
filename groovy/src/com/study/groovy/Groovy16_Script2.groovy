package com.study.groovy

/**
 * Created by Administrator on 2017/5/20.
 */
println "from script2"

shell = new GroovyShell()
shell.evaluate(new File("Groovy15_Script1.groovy"))

evaluate(new File("Groovy15_Script1.groovy"))