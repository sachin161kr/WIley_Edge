package com.wiley.springcore.reftype;

public class WileyA {
	
	private int counta;
	private WileyB ob;
	
	@Override
	public String toString() {
		return "WileyA [counta=" + counta + ", ob=" + ob + "]";
	}
	
	public WileyA()
	{
		
	}

	public WileyA(int counta, WileyB ob) {
		super();
		this.counta = counta;
		this.ob = ob;
	}

	public int getCounta() {
		return counta;
	}

	public void setCounta(int counta) {
		this.counta = counta;
	}

	public WileyB getOb() {
		return ob;
	}

	public void setOb(WileyB ob) {
		this.ob = ob;
	}


}
