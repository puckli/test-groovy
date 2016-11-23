package test;

import static org.junit.Assert.*

class Test {
	
	@org.junit.Test
	public void test() {
		def list = ["id", "name"]
		println "hello groovy"
		// ͨ��Shell���о�����ṹ��Groovy�ű�
		StringBuffer script = new StringBuffer();
		 script.append("class Tmp{def id;def name;String strings(){return 'Hello,id ' + id + ',name ' + name;}};")
		script.append("def user = new Tmp(name:'zhangsan',id:1);")
		 .append("user.strings();");
		Binding binding = new Binding();
		GroovyShell shell = new GroovyShell(binding);
		
		String msg = "��Ķ���%orderId%�ѷ���";
		String message = (String)shell.evaluate(script.toString());
		System.out.println(message);
		
		String mainMethod = "def user = new Tmp(name:'lisi',id:12);println(user.strings());";
		shell.evaluate(mainMethod);
		
		//��дmain����,Ĭ��ִ��
		mainMethod = "static void main(String[] args){def user = new Tmp(name:'lisi',id:12);return user.strings();}";
		String result = shell.evaluate(mainMethod);
		println result;
		shell = null;
	}

	
	
}
