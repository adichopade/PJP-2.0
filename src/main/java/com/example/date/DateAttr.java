package com.example.date;

public class DateAttr {
	
	String a,b;
	int item;
	int number;

	/**
	 * @param a
	 * @param b
	 * @param item
	 * @param number
	 */
	public DateAttr(String a, String b, int item, int number) {
		super();
		this.a = a;
		this.b = b;
		this.item = item;
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public String getB() {
		return b;
	}

	
	@Override
	public String toString() {
		return "DateAttr [a=" + a + ", b=" + b + ", item=" + item + ", number=" + number + "]";
	}

	public void setB(String b) {
		this.b = b;
	}

	public int getItem() {
		return item;
	}

	public void setItem(int item) {
		this.item = item;
	}
	
	
	

}
