package com.garage.datas;

import com.garage.models.Customer;
import com.garage.models.builder.BuildCustomer;

import java.util.ArrayList;

public class CustomerData {

    public static ArrayList<Customer> run() {
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new BuildCustomer.CustomerBuilder().setFirstName("test").setLastName("test").build());
        customers.add(new BuildCustomer.CustomerBuilder().setFirstName("billy").seIsParticipant(true).build());

        return customers;
    }

}
