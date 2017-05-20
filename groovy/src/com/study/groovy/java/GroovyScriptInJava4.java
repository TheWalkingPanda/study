package com.study.groovy.java;

import groovy.lang.GroovyClassLoader;
import groovy.lang.GroovyObject;

import java.io.File;
import java.io.IOException;

/**
 * Created by Administrator on 2017/5/20.
 */
public class GroovyScriptInJava4 {
    public static void main(String[] args) {
        GroovyClassLoader loader = new GroovyClassLoader();

        try {
            Class groovyClass = loader.parseClass(new File("F:/TestGroovyClassLoader.groovy"));
            GroovyObject groovyObject = (GroovyObject)groovyClass.newInstance();
            groovyObject.invokeMethod("testGroovyClassLoader", new String[]{"testName", "testName2"});
        }  catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
