package puck.syntax

import puck.bean.JavaBean


class GClass {
	void script(def arg){
		println "in script method"
		Eval.me(arg)
	}
	
	static main(arg){
		new ClassJava().forGr("hello java baby");
		
		def jb = new JavaBean();
		jb.java = "java filed";
		println jb.@java
	}
}
