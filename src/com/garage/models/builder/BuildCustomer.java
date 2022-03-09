package com.garage.models.builder;

import com.garage.models.Customer;
import com.garage.utils.ConsoleManager;

import java.time.LocalDateTime;
import java.util.UUID;

public class BuildCustomer {

    public static class CustomerBuilder {

        private UUID id = UUID.randomUUID();
        private String firstName;
        private String lastName;
        private Boolean isParticipant;
        private LocalDateTime createdAt = LocalDateTime.now();

        public CustomerBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public CustomerBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public CustomerBuilder seIsParticipant(Boolean isParticipant) {
            this.isParticipant = isParticipant;
            return this;
        }

        public CustomerBuilder printConsole() {
            ConsoleManager.getInstance().printToConsole("Choose a first name", true);
            ConsoleManager.getInstance().printToConsole("> ", false);
            firstName = ConsoleManager.getInstance().readUserInput();


            ConsoleManager.getInstance().printToConsole("Choose a last name", true);
            ConsoleManager.getInstance().printToConsole("> ", false);
            lastName = ConsoleManager.getInstance().readUserInput();

            return this;
        }

        public Customer build() {
            Customer customer = new Customer();
            customer.setId(id);
            customer.setFirstName(firstName);
            customer.setLastName(lastName);
            customer.setIsParticipant(isParticipant);
            customer.setCreatedAt(createdAt);

            return customer;
        }
    }
}
