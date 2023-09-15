package enums;

public class Main2 {
    public static void main(String[] args) {
        System.out.println(Luna.OCTOMBRIE.activitate);
        Luna.FEBRUARIE.printActivity();
        System.out.println();
        for(Luna l:Luna.values()){
            System.out.println(l);
            l.printActivity();
            System.out.println();
        }
    }
}
