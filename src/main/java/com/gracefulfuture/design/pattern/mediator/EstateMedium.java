package com.gracefulfuture.design.pattern.mediator;

import java.util.ArrayList;
import java.util.List;

public class EstateMedium extends Medium{
    private List<Customer> customers = new ArrayList<>();
    @Override
    public void register(Customer customer) {
        if(!customers.contains(customer)){
            customer.setMedium(this);
            customers.add(customer);
        }
    }

    @Override
    public void relay(String from,String advertisement) {
        for (Customer customer : customers) {
            String name = customer.getName();
            if(!name.equals(from)){
                customer.receive(from,advertisement);
            }
        }
    }
}
