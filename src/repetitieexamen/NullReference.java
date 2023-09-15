package repetitieexamen;

public class NullReference {
    public static void main(String[] args) {

        //Object obj = readFromDb(1);

        //Cod citit din baze de date
        //Daca exista objectul cu id-ul 1 returneaza objectul din baza de date, altfel returneaza null

        String s = null;

        try {
            System.out.println(s.toUpperCase());
        }catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("TESTTESTTEST");


    }

    public static Object readFromDb( int id){
        return new Object();
    }
}
