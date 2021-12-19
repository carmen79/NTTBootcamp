package com.nttdata.spring.restcontroller;

import com.nttdata.spring.repository.NTTDataCustomer;
import com.nttdata.spring.services.NTTDataCustomerManagementServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest/customer")
public class RestCustomerController {

    //**************************************
    // PROPIEDADES
    //**************************************
    @Autowired
    private NTTDataCustomerManagementServiceI service;

    //**************************************
    // METODOS
    //**************************************

    @GetMapping
    public Iterable <NTTDataCustomer> getCustomers() {
        return service.searchAllCustomers();
    }

    @GetMapping("/{id}")
    public NTTDataCustomer getById(final @PathVariable Long id){
        return service.searchById(id);
    }

    @GetMapping("/search")
    public Iterable<NTTDataCustomer> getByName(final @RequestParam String name){
        return service.searchByName(name);
    }

    @PostMapping
    public void addCustomer(final @RequestBody NTTDataCustomer newCustomer) {
        service.insertNewCustomer(newCustomer);
    }

    @DeleteMapping(value = "/{id}")
    public void removeCustomer (final @PathVariable Long id){
        service.removeCustomer(id);
    }

}
