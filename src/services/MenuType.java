package services;

public enum MenuType {

    ADD_CUSTOMER( "1", "Ajouter un client"),
    SHOW_CUSTOMER( "2", "Voir les clients"),
    ADD_ENTRANT( "3", "Ajouter une participation"),
    SHOW_ENTRANT( "4", "Voir les participations"),
    EXIT( "0", "Quitter");

    private String id;
    private String title;

    MenuType(String id, String title) {
        this.id = id;
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return id + " -> " + title;
    }
}
