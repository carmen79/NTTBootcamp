package com.nttdata.patterns.patterns;

import com.nttdata.patterns.patterns.prototype.PersonPrototype;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatternsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatternsApplication.class, args);

		// Ejemplo del prototype
		PersonPrototype pp = new PersonPrototype(1L, "Carmen", "Bueno");
		PersonPrototype copyP = pp.copy(pp);
		
	}

}
