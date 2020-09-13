package com.example.demopractise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorRestController {
	
	@Autowired
	private CalculatorDAO service;
	
	@RequestMapping(value="/add",method = RequestMethod.GET)
	public float add() {
		return  service.add();
	}
	@RequestMapping(value="/sub",method = RequestMethod.GET)
	public float sub() {
		return service.sub();
	}
	@RequestMapping(value="/mul",method = RequestMethod.GET)
	public float mul() {
		return service.mul();
	}
	@RequestMapping(value="/div",method = RequestMethod.GET)
	public float div() {
		return service.div();
	}

}
