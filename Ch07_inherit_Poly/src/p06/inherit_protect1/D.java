package p06.inherit_protect1;

import p06.inherit_protect.A;

public class D extends A {

	public D() {
		super();				//(o)
		this.field = "value";	//(o)
		this.method();			//(o)
	}
}
