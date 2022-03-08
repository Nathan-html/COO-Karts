package services;

import utils.ConsoleManager;

public class KartManagementApp {

    public void run() {
        HelloWorld();
        ChooseAction();
        goodbye();
    }

    private void HelloWorld() {
        ConsoleManager.getInstance().printToConsole("Bienvenu sur l'app de gestion de karts", true);
    }

    private void goodbye() {
        ConsoleManager.getInstance().printToConsole("a++", true);
    }

    private void ChooseAction(){

        boolean exit = false;

        do {
            printMenu();
            int action = ConsoleManager.getInstance().readUserInputInteger();

            if (action == 0) {
                exit = true;
            }

        } while (!exit);
    }

    private void printMenu() {
        for (MenuType item : MenuType.values()) {
            ConsoleManager.getInstance().printToConsole(item.toString(), true);
        }
    }

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