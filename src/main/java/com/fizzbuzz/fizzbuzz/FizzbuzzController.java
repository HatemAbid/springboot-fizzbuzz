package com.fizzbuzz.fizzbuzz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@ComponentScan
public class FizzbuzzController {
	
	private Fizzbuzz fizzBuzz;
	private String json;

	@Autowired
    public FizzbuzzController(Fizzbuzz fizzBuzz) {
        this.fizzBuzz = fizzBuzz;
    }

	@RequestMapping( value = "/{number}", headers = "Accept=application/json")
    public String fizzBuzz(@PathVariable("number") int number) {
		this.json = "[";
		int i = 1;
		while (i <= number-1) {
			// System.out.println("Number : " + i + " = " + fizzBuzz.functionFizzBuzz(i) );
			this.json = this.json + "{\"" + i + "\" : \"" + fizzBuzz.functionFizzBuzz(i) + "\"},";
			i++;
		}
		this.json = this.json + "{\"" + number + "\" : \"" + fizzBuzz.functionFizzBuzz(number) + "\"}";
		this.json += "]";
		return this.json;
	}
	
}
