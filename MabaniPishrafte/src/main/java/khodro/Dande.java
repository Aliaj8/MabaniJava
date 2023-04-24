package khodro;

public enum Dande {
    MANUAL("otomatik","automatiq"),
    AUTOMATIC("dasti","manuel");

    private final String toPersian;
    private String toFrench;
    Dande(String toPersian) {
        this.toPersian=toPersian;
    }

    Dande(String topersian, String toFrench) {
        this.toPersian=topersian;
        this.toFrench=toFrench;

    }


    public static void print() {
        Dande [] value =Dande.values();
        for (Dande dande : value) {
            System.out.println(dande);
        }
    }

    public static void printInPersian() {
        Dande [] value =Dande.values();
        for (Dande dande : value) {
            System.out.println(dande.toPersian);
        }
    }

    public static void printInFrench() {
        Dande [] value =Dande.values();
        for (Dande dande : value) {
            System.out.println(dande.toFrench);
        }
    }

    public String getToPersian() {
        return toPersian;
    }

    public String getToFrench() {
        return toFrench;
    }
}
