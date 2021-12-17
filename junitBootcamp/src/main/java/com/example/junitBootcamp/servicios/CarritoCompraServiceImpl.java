package com.example.junitBootcamp.servicios;

import java.util.ArrayList;
import java.util.List;

import com.example.junitBootcamp.bbdd.BaseDatosI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.junitBootcamp.model.Articulo;

@Service
public class CarritoCompraServiceImpl implements CarritoCompraServiceI {
	
	private List<Articulo> cesta = new ArrayList<>();

	@Autowired
	private BaseDatosI baseDatos;

	@Override
	public void limpiarCesta() {
		cesta.clear();
	}

	@Override
	public void addArticulo(Articulo articulo) {
		cesta.add(articulo);
	}

	@Override
	public Integer getNumArticulos() {
		return cesta.size();
	}

	@Override
	public List<Articulo> getArticulos() {
		return cesta;
	}

	@Override
	public Double totalPrice() {
		Double total = 0D;
		for(Articulo articulo : cesta) {
			total = total + articulo.getPrecio();
		}
		return total;
	}

	@Override
	public Double calculadorDescuento(Double precio, Double porcentajeDescuento) {
		return precio - precio*porcentajeDescuento/100;
	}
	@Override
	public Double aplicarDescuento (Integer id,Double porcentajeDescuento) {
		Articulo articulo = baseDatos.findArticuloById(id);
		return calculadorDescuento(articulo.getPrecio(), porcentajeDescuento);
	}

	@Override
	public Integer insertarArticulo(Articulo articulo) {
		Integer id = baseDatos.insertarArticulo(articulo);
		addArticulo(articulo);
		return id;
	}
}
