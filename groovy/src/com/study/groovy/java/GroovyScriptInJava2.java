package com.study.groovy.java;

import groovy.lang.Binding;
import groovy.util.GroovyScriptEngine;
import groovy.util.ResourceException;
import groovy.util.ScriptException;

import java.io.IOException;

/**
 * Created by Administrator on 2017/5/20.
 */
public class GroovyScriptInJava2 {
    public static void main(String[] args) {

        try {
            GroovyScriptEngine engine = new GroovyScriptEngine("/");
            Binding binding = new Binding();
            binding.setVariable("name", "testName");

            engine.run("TestGroovyScript.groovy", binding);
        } catch (ResourceException e) {
            e.printStackTrace();
        } catch (ScriptException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
