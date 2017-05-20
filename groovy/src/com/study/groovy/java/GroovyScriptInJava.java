package com.study.groovy.java;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by Administrator on 2017/5/20.
 */
public class GroovyScriptInJava {
    public static void main(String[] args) {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("groovy");
        try {
            engine.eval("println 'hello groovy script'");

            engine.eval(new FileReader("F:\\study\\groovy\\src\\com\\study\\groovy\\groovy15_Script1.groovy"));

            engine.put("name", "name from java");
            engine.eval(new FileReader("F:\\study\\groovy\\src\\com\\study\\groovy\\Groovy17_ScriptBinding1.groovy"));

            for (;;) {
                engine.eval(new FileReader("F:\\TestGroovyScript.groovy"));
                Thread.sleep(1000);
            }
        } catch (ScriptException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
