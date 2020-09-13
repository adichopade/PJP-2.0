package com.example.demopractise;

public class Calculator {
	
	private int a,b;
	private String func;

	/**
	 * @param a
	 * @param b
	 * @param func
	 * 
	 */
	public Calculator() {
		
	}
	public Calculator(int a, int b, String func) {
		super();
		this.a = a;
		this.b = b;
		this.func = func;
	}

	public String getFunc() {
		return func;
	}

	public void setFunc(String func) {
		this.func = func;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	/**
	 * @param a
	 * @param b
	 */
	public Calculator(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

}
