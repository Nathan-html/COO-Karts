package com.garage.datas;

import com.garage.models.Customer;
import com.garage.models.Kart;

import java.util.ArrayList;

public class Data {

    public ArrayList<Kart> getKart() {
        return KartData.run();
    }

    public ArrayList<Customer> getCustomer() {
        return CustomerData.run();
    }
}
