package com.study.groovy

/**
 * Created by Administrator on 2017/5/20.
 */
class Groovy14_ClosureTest {
    def useClosure (closure) {
        println "calling closure"
        closure()
    }

    def passToClosure (value, closure) {
        println "${value} use in closure"
        closure(value)
    }
}
