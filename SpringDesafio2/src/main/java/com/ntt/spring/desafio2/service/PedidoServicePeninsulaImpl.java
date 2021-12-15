package com.ntt.spring.desafio2.service;

import com.ntt.spring.desafio2.model.Pedido;
import com.ntt.spring.desafio2.model.Producto;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("pedidoServicePeninsula")
public class PedidoServicePeninsulaImpl implements PedidoService {

    public void resolucion(Pedido pedido, Producto producto) {
        pedido.getProductos().add(producto);
    }

    @Override
    public void retorno(Pedido pedido, Producto producto) {
        pedido.getProductos().remove(producto);
    }

    @Override
    public Float precioTotal(Pedido pedido) {

        Float precioTotal = new Float(0);
        for(Producto p : pedido.getProductos()) {
            precioTotal += p.getPrecio();
        }

        Float IVA = 0.21f;
        precioTotal += precioTotal*IVA;
        return precioTotal;
    }
}
