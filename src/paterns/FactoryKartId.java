package paterns;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FactoryKartId implements IUniqueIdentifier {

    private static FactoryKartId INSTANCE = null;

    public static FactoryKartId getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new FactoryKartId();
        }

        return INSTANCE;
    }

    private final static char[] ALPHABET = {
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
    };

    @Override
    public String generate() {
        String numberTest = "";
        String charTest = "";
        for (int i = 0; i < 2; i++) {
            numberTest += String.valueOf(new Random().nextInt(9));
        }
        for (int z = 0; z < 2; z++) {
            charTest += ALPHABET[new Random().nextInt(ALPHABET.length)];
        }
        return charTest + numberTest;
    }
}
