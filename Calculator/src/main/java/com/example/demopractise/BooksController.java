package com.example.demopractise;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {
	
	@GetMapping("/books")
	public List<Books> getAllBooks(){
		return Arrays.asList(new Books(10l,"Web Application Hackers Handbook","Security and Application Network"));
	}
	
	@GetMapping("/adi/{name}")
	public String adi(@PathVariable String name) {
		return "Aadesh is awesome "+name;
	}

}
