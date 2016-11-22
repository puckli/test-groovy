package test.syntax


class GClass {
	void script(def arg){
		println "in script method"
		Eval.me(arg)
	}
	
	static main(arg){
		new ClassJava().forGr("hello java baby");
	}
}
