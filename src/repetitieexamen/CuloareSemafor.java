package repetitieexamen;

public enum CuloareSemafor {
    VERDE("traversam"),
    ROSU("stam be loc"),
    GALBEN("Mai bine asteptam");

    String actiune;

    CuloareSemafor(String actiune) {
        this.actiune = actiune;
    }

    public String getActiune() {
        return actiune;
    }
}
