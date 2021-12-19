package com.nttdata.spring.services;

import com.nttdata.spring.repository.NTTDataCustomer;

public interface NTTDataCustomerManagementServiceI {

	/**
	 * Añade un nuevo cliente.
	 * 
	 * @param newCustomer
	 * @return NTTDataCustomer
	 */
	public NTTDataCustomer insertNewCustomer(final NTTDataCustomer newCustomer);

	/**
	 * Eliminar un cliente.
	 *
	 * @param id
	 */
	public void removeCustomer(final Long id);

	/**
	 * Consulta todos los clientes.
	 */
	public Iterable<NTTDataCustomer> searchAllCustomers();

	/**
	 * Búsqueda por nombre completo.
	 * 
	 * @param name
	 * @param surname1
	 * @param surname2
	 */
	public void searchByFullName(final String name, final String surname1, final String surname2);

	/**
	 * Búsqueda por nombre.
	 * 
	 * @param name
	 */
	public Iterable<NTTDataCustomer> searchByName(final String name);

	/**
	 * Búsqueda por ID
	 * @param id
	 * @return NTTDataCustomer
	 */
	public NTTDataCustomer searchById(Long id);
}
