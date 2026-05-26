package com.itb.inf2gm.pizzarialiberato;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PizzarialiberatoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PizzarialiberatoApplication.class, args);

        System.out.println("Pizzaria Liberato rodando na porta 8080");
	}

}
