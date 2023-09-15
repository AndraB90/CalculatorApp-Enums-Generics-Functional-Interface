package enums;

public class Main {
    public static void main(String[] args) {
        System.out.println(Zi.LUNI.englishNameVersion);
        Zi.MARTI.printActivity();

        for (Zi zi: Zi.values()) {
            //zi.printActivity();
            //System.out.println(zi);
            System.out.println(zi.englishNameVersion);
        }

        Zi zi=Zi.valueOf("LUNI");

    }
}

// 1) Declara un enum pentru fiecare luna a anului
// O activitate in fiecare luna
// O metoda care se printeze activitatea
// Testeaza in main toate functionalitatiile

//2) Declara un enum pentru fiecare anotimp
// O lista de luni pe care sa le bagi la fel ca in exercitiu 1
// O metoda care se printeze toate activitatiile luniilor din sezon
