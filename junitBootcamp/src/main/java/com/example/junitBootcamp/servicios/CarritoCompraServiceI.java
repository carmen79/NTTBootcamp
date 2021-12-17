package com.example.junitBootcamp.servicios;

import java.util.List;

import com.example.junitBootcamp.model.Articulo;

public interface CarritoCompraServiceI {

	public void limpiarCesta();
	
	public void addArticulo(Articulo articulo);
	
	public Integer getNumArticulos();
	
	public List<Articulo> getArticulos();
	
	public Double totalPrice();
	
	public Double calculadorDescuento(Double precio, Double porcentajeDescuento);

	public Double aplicarDescuento (Integer id, Double porcentajeDescuento);

	public Integer insertarArticulo(Articulo articulo);
}
