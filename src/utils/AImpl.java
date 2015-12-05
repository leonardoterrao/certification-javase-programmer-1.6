package utils;

interface A {
	public void doSomething(String thing);
}

public class AImpl implements A {
	public void doSomething(String thing) {}
}

class B {
	public A doit(){return null;}
	public String execute() {return null;}
}

class C extends B {
	public AImpl doit() {return null;}
	public String execute() {
//	public Object execute() {
		return null;
	}
}