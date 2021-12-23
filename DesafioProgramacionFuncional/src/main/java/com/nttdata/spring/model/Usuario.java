package com.nttdata.spring.model;

import java.io.Serializable;

/**
 * Formación Spring.
 * 
 * @author NTTData
 *
 */
public class Usuario implements Serializable {

	private Long id;
	private String nombre;
	private String userName;
	private String password;

	public Usuario(Long id, String nombre, String userName, String password) {
		this.id = id;
		this.nombre = nombre;
		this.userName = userName;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Usuario{" +
				"id=" + id +
				", nombre='" + nombre + '\'' +
				", userName='" + userName + '\'' +
				", password='" + password + '\'' +
				'}';
	}
}
