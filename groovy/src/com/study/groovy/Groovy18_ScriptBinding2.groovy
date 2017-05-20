package com.study.groovy

/**
 * Created by Administrator on 2017/5/20.
 */
println "in 2"
name = "name in 2"
shell = new GroovyShell(binding)    //每个脚本执行时都有一个binding对象
ret = shell.evaluate(new File("Groovy17_ScriptBinding1.groovy"))
println ret

println "current name is ${name}"

shell.setVariable("name", "changed name")
shell.evaluate(new File("Groovy17_ScriptBinding1.groovy"))