package repetitieexamen;

public class FunctionalInterface {
    public static void main(String[] args) {

        Processor processor = new Processor() {
            @Override
            public void process(int numar) {
                System.out.println("Processing the number "+numar);
            }
        };

        ceva(10, processor);

    }

    public static void ceva(int number, Processor processor){
        processor.process(number);
    }
}
