package test.syntax;

import test.bean.EventDetailTo;
import groovy.lang.Binding;
import groovy.lang.GroovyClassLoader;
import groovy.lang.GroovyShell;
import groovy.util.Eval;

/**
 * java & groovy
 * @author Puck
 *
 */
public class ClassJava {
	public static void main(String[] args) {
		// method one
//		new GClass().script();
		Eval.me("println 22");
		
		// method to
		Binding binding = new Binding();
		binding.setVariable("foo", new Integer(2));
		GroovyShell shell = new GroovyShell(binding);

		String script = " "
		        + "def a = 12; println 'C# md5:' + 'ddd'; "
		        + "return foo * a ";
		Object value = shell.evaluate(script);
		System.out.println(value.toString());

		EventDetailTo to = new EventDetailTo();
		to.setId(1);
		to.setTitle("xxxxxx");
		binding = new Binding();
		binding.setVariable("to", to);
		shell = new GroovyShell(binding);
		script = "import test.bean.EventDetailTo; "
		        + "def getTitle(EventDetailTo to) { return to.getTitle()}; "
		        + "getTitle(to)";
		value = shell.evaluate(script);
		System.out.println(value.toString());
		
	}
	
	// 
	public void forGr(String arg){
		System.out.println(arg);
	}
}
