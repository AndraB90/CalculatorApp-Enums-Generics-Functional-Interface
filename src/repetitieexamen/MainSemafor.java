package repetitieexamen;

public class MainSemafor {
    public static void main(String[] args) {
        CuloareSemafor culoareSemafor=CuloareSemafor.ROSU;
        System.out.println(culoareSemafor.getActiune());

        CuloareSemafor culoareSemafor2=CuloareSemafor.VERDE;
        System.out.println(culoareSemafor2.getActiune());

        CuloareSemafor culoareSemafor3=CuloareSemafor.GALBEN;
        System.out.println(culoareSemafor3.getActiune());



    }
}
