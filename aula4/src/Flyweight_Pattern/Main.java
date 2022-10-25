package Flyweight_Pattern;

public class Main {

    public static void main(String[] args) {

        ComputadorFactory computador = new ComputadorFactory();
        Computador mac1 = computador.getComputador(16, 500);
        Computador windows1 = computador.getComputador(2, 256);
        Computador mac2 = computador.getComputador(16, 500);

        System.out.println(mac2.toString());
        System.out.println(mac1.toString());
        System.out.println(windows1.toString());

    }

}
