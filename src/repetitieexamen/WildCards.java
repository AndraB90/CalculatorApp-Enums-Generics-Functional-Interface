package repetitieexamen;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;

public class WildCards {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(2, 35, 7, 9);

        /*int suma = 0;
        for (int numar : list1) {
            suma += numar;
        }
        System.out.println("Totalul este " + suma);

         */

        calculeazaSuma(list1);


        List<Double> list2 = Arrays.asList(2.3, 5.6, 55.5);

        /*double suma2 = 0;
        for (double numar : list2) {
            suma2 += numar;
        }
        System.out.println("Totalul este " + suma2);

         */

        calculeazaSuma(list2);

    }

    private static void calculeazaSuma(List<? extends Number> list) {
        double suma = 0;
        for (Number numar : list) {
            suma += numar.doubleValue();
        }
        System.out.println("Totalul este " + suma);

    }

}
