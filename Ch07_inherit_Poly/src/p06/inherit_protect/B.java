package p06.inherit_protect;

public class B {

	public void method() {
		A a = new A();		//(o)
		a.field = "value";	//(o)
		a.method();			//(o)
	}
}
