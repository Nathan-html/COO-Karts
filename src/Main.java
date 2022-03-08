import models.Kart;
import paterns.FactoryKartId;
import services.KartManagementApp;

public class Main {

    public static void main(String[] args) {
     //   new KartManagementApp().run();
    Kart kart = new Kart("toto","1",true);
    System.out.println(kart.toString());
    }

}

