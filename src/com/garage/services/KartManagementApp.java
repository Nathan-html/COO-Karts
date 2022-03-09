package com.garage.services;

import com.garage.datas.Data;
import com.garage.models.Customer;
import com.garage.models.Kart;
import com.garage.models.builder.BuildCustomer;
import com.garage.utils.ConsoleManager;
import java.util.ArrayList;

public class KartManagementApp {

    // data of the app
    private Data data = new Data();
    private ArrayList<Kart> karts = data.getKart();
    private ArrayList<Customer> customers = data.getCustomer();
    private ArrayList<Customer> participant;

    // the main function
    public void run() {
        HelloWorld();
        ChooseAction();
        goodbye();
    }

    // say HEE-HOOO
    private void HelloWorld() {
        ConsoleManager.getInstance().printToConsole("Bienvenu sur l'app de gestion de karts", true);
    }

    // see u next time
    private void goodbye() {
        ConsoleManager.getInstance().printToConsole("a++", true);
    }

    // defines routes
    private void ChooseAction(){

        boolean exit = false;

        do {
            printMenu();
            int action = ConsoleManager.getInstance().readUserInputInteger();

            if (action == 1) {
                customers.add(new BuildCustomer.CustomerBuilder().printConsole().build());
            }
            if (action == 2) {
                printCustomers();
            }
            if (action == 3) {
                ChooseParticipant();
            }
            if (action == 4) {

            }
            if (action == 0) {
                exit = true;
            }

        } while (!exit);
    }

    private void ChooseParticipant() {

        boolean exit = false;

        do {

            printCustomersWithId();
            ConsoleManager.getInstance().printToConsole("0 -> Quiter", true);
            int req = ConsoleManager.getInstance().readUserInputInteger();

        } while (!exit);
    }

    private void printMenu() {
        for (MenuType item : MenuType.values()) {
            ConsoleManager.getInstance().printToConsole(item.toString(), true);
        }
    }

    private void printCustomers() {
        for (Customer customer: customers) {
            ConsoleManager.getInstance().printToConsole(customer.toString(), true);
        }
    }

    private void printCustomersWithId() {
        int id = 1;
        for (Customer customer: customers) {
            ConsoleManager.getInstance().printToConsole(id + " -> "+ customer.toString(), true);
            id++;
        }
    }

    // check if the req is handle
    private Boolean handleMenuReq(int req) {
        if ( req < 0 || req >= MenuType.values().length ) {
            return false;
        }
        if ( req < MenuType.values().length && req >= 0) {
            return true;
        }
        else { return false; }
    }
}