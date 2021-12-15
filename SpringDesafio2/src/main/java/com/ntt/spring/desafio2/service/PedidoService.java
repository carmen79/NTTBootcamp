package com.ntt.spring.desafio2.service;

import com.ntt.spring.desafio2.model.Pedido;
import com.ntt.spring.desafio2.model.Producto;

public interface PedidoService {

    public void resolucion(Pedido pedido, Producto producto);
    public void retorno(Pedido pedido, Producto producto);
    public Float precioTotal(Pedido pedido);
}
