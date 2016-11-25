package test;

import groovy.lang.Binding;
import groovy.lang.GroovyShell;

public class TestJava {
	public static void main(String[] args) {
		StringBuffer script = new StringBuffer();
		script.append("class Tmp{def id;def name;String strings(){return 'Hello,id ' + id + ',name ' + name;}};");
		script.append("def user = new Tmp(name:'zhangsan',id:1);").append("println user.strings();");
		Binding binding = new Binding();
		GroovyShell shell = new GroovyShell(binding);
		shell.evaluate(script.toString());
		
	}
}
