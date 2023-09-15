package enums;

public enum Luna {
    IANUARIE("mergi la schi"),
    FEBRUARIE("participi la carnaval"),
    MARTIE("plantezi flori"),
    APRILIE("sabatoresti pastele"),
    MAI("participi la targuri de primavara"),
    IUNIE("mergi la festivaluri muzicale"),
    IULIE("faci surfing sau scufundari"),
    AUGUST("mergi in excursie"),
    SEPTEMBRIE("faci o plimbare prin parcuri sau padure"),
    OCTOMBRIE("sarbatoresti Halloween"),
    NOIEMBRIE("decorezi casa"),
    DECEMBRIE("petreci sarbatoriile alaturi de familie si prieteni");

    String activitate;

    Luna(String activitate) {
        this.activitate = activitate;
    }

    public void printActivity(){
        System.out.println(activitate);
    }
}
