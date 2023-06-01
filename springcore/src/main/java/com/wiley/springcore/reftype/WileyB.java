package com.wiley.springcore.reftype;

public class WileyB {
	
	private int countb;
	
	private WileyB ob;
	
	public WileyB()
	{
		
	}

	public WileyB(int countb, WileyB ob) {
		super();
		this.countb = countb;
		this.ob = ob;
	}

	public int getCountb() {
		return countb;
	}

	public void setCountb(int countb) {
		this.countb = countb;
	}

	public WileyB getOb() {
		return ob;
	}

	public void setOb(WileyB ob) {
		this.ob = ob;
	}

	@Override
	public String toString() {
		return "WileyB [countb=" + countb + ", ob=" + ob + "]";
	}
	
	

}
