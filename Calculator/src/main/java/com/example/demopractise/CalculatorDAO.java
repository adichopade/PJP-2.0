package com.example.demopractise;

import org.springframework.stereotype.Component;

@Component
public class CalculatorDAO {
	
	public int a=10,b=16;
	
	public int add() {
		return a+b;
	}
	public int sub() {
		return a-b;
	}
	public int mul() {
		return a*b;
	}
	public int div() {
		return a/b;
	}
	
	

}
