package com.nttdata.spring.controller;

import com.nttdata.spring.repository.NTTDataCustomer;
import com.nttdata.spring.services.NTTDataCustomerManagementServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {

    @Autowired
    private NTTDataCustomerManagementServiceI service;

    @RequestMapping("/customers")
    public String consult (Model model) {
        model.addAttribute("customers", service.searchAllCustomers());
        return "customers" ;
    }

    @RequestMapping("/addCustomer")
    public String addCustomer (Model model) {
        model.addAttribute("customer", new NTTDataCustomer());
        return "addCustomer";
    }

    @PostMapping ("saveCustomer")
    public String saveCustomer (@ModelAttribute NTTDataCustomer customer, Model model) {
        NTTDataCustomer customerSaved = service.insertNewCustomer(customer);
        model.addAttribute("customer", customerSaved);
        return "addCustomer";
    }

    @RequestMapping("/findCustomers")
    public String findCustomer (Model model) {
        model.addAttribute("customer", new NTTDataCustomer());
        model.addAttribute("customers", service.searchAllCustomers());
        return "searchCustomer" ;
    }

    @PostMapping("/findCustomers")
    public String findCustomer (@ModelAttribute NTTDataCustomer customer, Model model) {
        model.addAttribute("customer", customer);
        model.addAttribute("customers", service.searchByName(customer.getName()));
        return "searchCustomer" ;
    }

}
