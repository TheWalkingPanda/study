package com.study.groovy.java;

import groovy.lang.GroovyShell;

import java.io.File;
import java.io.IOException;

/**
 * Created by Administrator on 2017/5/20.
 */
public class GroovyScriptInJava3 {
    public static void main(String[] args) {
        GroovyShell shell = new GroovyShell();
        try {
            shell.setVariable("name", "name from shell");
            shell.evaluate(new File("F:\\TestGroovyScript.groovy"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
