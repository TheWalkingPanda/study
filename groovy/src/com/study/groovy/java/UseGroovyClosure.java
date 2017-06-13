package com.study.groovy.java;

import com.study.groovy.Groovy14_ClosureTest;

/**
 * Created by Administrator on 2017/5/20.
 */
public class UseGroovyClosure {
    public static void main(String[] args) {
        Groovy14_ClosureTest instance = new Groovy14_ClosureTest();
        Object ret = instance.useClosure(new Object(){
            public String call () {
                return "called from groovy";
            }
        });
        System.out.println(ret);
        Object ret2 = instance.passToClosure(2, new Object(){
            public String call (int value) {
                return "called from groovy, value is " + value;
            }
        });

        System.out.println(ret2);
    }
}
