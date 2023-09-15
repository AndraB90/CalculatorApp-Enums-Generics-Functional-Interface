package enums;

public class Main3 {
    public static void main(String[] args) {
        System.out.println();
        for(Anotimp a: Anotimp.values()){
            System.out.println(a);
            a.printActivities();
            System.out.println();
        }
    }
}
