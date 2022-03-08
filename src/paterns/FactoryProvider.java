package paterns;

public class FactoryProvider {

    public static IUniqueIdentifier getFactory(String choice){
        if(choice.equalsIgnoreCase("id")){
            return new FactoryKartId();
        }
        return null;
    }
}
