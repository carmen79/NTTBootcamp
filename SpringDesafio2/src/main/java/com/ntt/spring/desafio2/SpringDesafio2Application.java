package com.ntt.spring.desafio2;


import com.ntt.spring.desafio2.model.Pedido;
import com.ntt.spring.desafio2.model.Producto;
import com.ntt.spring.desafio2.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringDesafio2Application implements CommandLineRunner {

    @Autowired
    @Qualifier("pedidoServicePeninsula")
    private PedidoService pedidoServicePeninsula;

    @Autowired
    @Qualifier("pedidoServiceCeutaMelillaCanarias")
    private PedidoService pedidoServiceCeutaMelillaCanarias;

    public static void main(String[] args) {
        SpringApplication.run(SpringDesafio2Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("SpringBoot desafio2");

        System.out.println("Crear Producto");
        Producto ps5 = new Producto(1L, "PS5", 350.0f);
        System.out.println("Producto 1:" + ps5);
        Producto nintendoSwitch = new Producto(1L, "Nintendo Switch", 350.0f);
        System.out.println("Producto 2:" + nintendoSwitch);

        Pedido pedidoPeninsula = new Pedido(1L, "Malaga", false);
        pedidoServicePeninsula.resolucion(pedidoPeninsula, ps5);
        pedidoServicePeninsula.resolucion(pedidoPeninsula, nintendoSwitch);
        Float precioTotal = pedidoServicePeninsula.precioTotal(pedidoPeninsula);
        System.out.println("Pedido para peninsula: " + pedidoPeninsula);
        System.out.println("Pedido para peninsula precio total: " + precioTotal);
        System.out.println("Retorno de producto");
        pedidoServicePeninsula.retorno(pedidoPeninsula, ps5);
        System.out.println("Pedido para peninsula sin PS5: " + pedidoPeninsula);
        Float precioTotalSinPS5 = pedidoServicePeninsula.precioTotal(pedidoPeninsula);
        System.out.println("Pedido para peninsula precio total sin PS5: " + precioTotalSinPS5);

    }
}
