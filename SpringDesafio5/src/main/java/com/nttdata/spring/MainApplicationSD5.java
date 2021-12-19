package com.nttdata.spring;

import com.nttdata.spring.repository.NTTDataCustomer;
import com.nttdata.spring.services.NTTDataCustomerManagementServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Formación Spring.
 * 
 * @author NTTData
 *
 */
@SpringBootApplication
public class MainApplicationSD5 implements CommandLineRunner {

	@Autowired
	private NTTDataCustomerManagementServiceI service;

	/**
	 * Método principal.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(MainApplicationSD5.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// Insertamos un cliente de ejemplo para que cuando arrancamos la aplicacion haya algo en Base de Datos
		NTTDataCustomer customer = new NTTDataCustomer();
		customer.setName("Alberto");
		customer.setSurName1("Perez");
		customer.setSurName2("Martin");
		customer.setIdentityDocNumber("88548161D");
		service.insertNewCustomer(customer);
	}

}
