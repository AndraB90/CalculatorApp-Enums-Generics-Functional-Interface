package enums;


import java.util.ArrayList;
import java.util.Arrays;

public enum Anotimp {
    IARNA(new ArrayList<>(Arrays.asList(Luna.DECEMBRIE,Luna.IANUARIE, Luna.FEBRUARIE))),
    PRIMAVARA(new ArrayList<>(Arrays.asList(Luna.MARTIE,Luna.APRILIE, Luna.MAI))),
    VARA(new ArrayList<>(Arrays.asList(Luna.IUNIE,Luna.IULIE, Luna.AUGUST))),
    TOAMNA(new ArrayList<>(Arrays.asList(Luna.SEPTEMBRIE,Luna.OCTOMBRIE, Luna.NOIEMBRIE)));


    /*Luna luna1;
    Luna luna2;
    Luna luna3;

     */

    ArrayList<Luna> lunaArrayList;


    Anotimp(ArrayList<Luna> lunaArrayList) {
        this.lunaArrayList = lunaArrayList;
    }

    public void printActivities(){
        System.out.println("Activitatiile sezonului "+this.name()+" sunt:");
        lunaArrayList.stream().forEach(System.out::println);
    }
}
