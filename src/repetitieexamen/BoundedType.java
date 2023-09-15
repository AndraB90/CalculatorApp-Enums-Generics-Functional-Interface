package repetitieexamen;

public class BoundedType {
    public static void main(String[] args) {

        Exemplu<Integer> integerExemplu=new Exemplu<>(10);
        Exemplu<Double> doubleExemplu=new Exemplu<>(100.6);
        doubleExemplu.display();
        integerExemplu.display();

    }
}

class Exemplu<T extends Number>{

    private T informatie;

    public Exemplu(T informatie) {
        this.informatie = informatie;
    }

    public void display(){
        System.out.println("informatia mea este "+informatie);
    }
}
