package com.example.junitBootcamp.servicios;

import static org.junit.jupiter.api.Assertions.*;

import com.example.junitBootcamp.bbdd.BaseDatosI;
import com.example.junitBootcamp.model.Articulo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class CarritoCompraServiceImplTest {
	@Mock
	private BaseDatosI baseDatos;

	@InjectMocks
	private CarritoCompraServiceImpl carritoService;

	@Test
	void testLimpiarCesta() {
		Articulo articulo1 = new Articulo("a1", 0.0);
		carritoService.addArticulo(articulo1);
		assertFalse(carritoService.getArticulos().isEmpty());

		carritoService.limpiarCesta();

		assertTrue(carritoService.getArticulos().isEmpty());
		assertEquals(0, (int) carritoService.getNumArticulos());
	}

	@Test
	void testAddArticulo() {
		Articulo articulo1 = new Articulo("a2", 12.0);

		carritoService.addArticulo(articulo1);

		assertFalse(carritoService.getArticulos().isEmpty());
		assertEquals(1, (int) carritoService.getNumArticulos());
	}

	@Test
	void testGetNumArticulos() {
		Articulo articulo1 = new Articulo("a3", 15.0);
		carritoService.addArticulo(articulo1);
		Articulo articulo2 = new Articulo("a4", 14.0);
		carritoService.addArticulo(articulo2);

		assertEquals(2, (int) carritoService.getNumArticulos());
	}

	@Test
	void testGetArticulos() {

		Articulo articulo1 = new Articulo("pantalon", 15.0);
		carritoService.addArticulo(articulo1);
		Articulo articulo2 = new Articulo("camiseta", 14.0);
		carritoService.addArticulo(articulo2);

	}

	@Test
	void testTotalPrice() {
		Articulo articulo1 = new Articulo("pantalon", 15.0);
		carritoService.addArticulo(articulo1);
		Articulo articulo2 = new Articulo("camiseta", 14.0);
		carritoService.addArticulo(articulo2);

		assertEquals(29.0, carritoService.totalPrice());
	}

	@Test
	void testCalculadorDescuento() {
		assertEquals(carritoService.calculadorDescuento(30.0, 10.0), 27.0);
	}

	@Test
	void testAplicarDescuento (){
		Articulo articulo = new Articulo("Pelota", 50.0);
		when(baseDatos.findArticuloById(1)).thenReturn(articulo);

		assertEquals(45.0, carritoService.aplicarDescuento(1, 10.0));
	}

	@Test
	void testInsertarArticulo(){
		Articulo articulo = new Articulo("Gorra", 12.0);
		when(baseDatos.insertarArticulo(articulo)).thenReturn(1);

		Integer id = carritoService.insertarArticulo(articulo);

		assertEquals(1, id);
		assertTrue(carritoService.getArticulos().contains(articulo));
		verify(baseDatos, atLeastOnce()).insertarArticulo(articulo);
	}
}
