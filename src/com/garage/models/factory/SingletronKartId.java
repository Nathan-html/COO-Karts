package com.garage.models.factory;

public class SingletronKartId {

    // https://refactoring.guru/design-patterns/singleton/
    private FactoryId factory;

    private static FactoryId instance;

    private SingletronKartId(FactoryId factory) {
        this.factory = factory;
    }

    public static FactoryId getInstance(FactoryId factory) {
        // You can read more info DCL ( double-checked locking ) issues in Java here:
        // https://refactoring.guru/java-dcl-issue
        FactoryId result = instance;
        if (result != null) {
            return result;
        }
        synchronized (FactoryId.class) {
            if (instance == null) {
                instance = factory;
            }
            return instance;
        }
    }

}
