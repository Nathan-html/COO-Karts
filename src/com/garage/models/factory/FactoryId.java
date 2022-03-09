package com.garage.models.factory;

import java.util.Random;

public class FactoryId {

    // the factory
    private final static char[] ALPHABET = {
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
    };

    public String generate() {
        String numberTest = "";
        for (int i = 0; i < 2; i++) {
            numberTest += String.valueOf(new Random().nextInt(9));
        }
        for (int z = 0; z < 2; z++) {
            numberTest += ALPHABET[new Random().nextInt(ALPHABET.length)];
        }
        return numberTest;
    }
}
