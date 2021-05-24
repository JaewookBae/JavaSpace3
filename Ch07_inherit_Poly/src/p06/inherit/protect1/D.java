package p06.inherit.protect1;

import p06.inherit.protect.A;

public class D extends A {

	public D() {
		super();				//(o)
		this.field = "value";	//(o)
		this.method();			//(o)
	}
}
