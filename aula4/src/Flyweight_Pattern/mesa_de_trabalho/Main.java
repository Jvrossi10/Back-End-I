package Flyweight_Pattern.mesa_de_trabalho;

public class Main {

    public static void main(String[] args) {

        Floresta floresta = new Floresta();
        for(int i = 0; i <= 1000000; i++){
            floresta.plantarArvore("Ornamentais", 200, 400, "Verde");
            floresta.plantarArvore("Frutíferas", 500, 300, "Vermelha");
            floresta.plantarArvore("Florífera", 100, 200, "Azul");

        }

        System.out.println(ArvoreFactory.TIPO_ARVORES.size());
        System.out.println(floresta.getARVORE().size());
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Memória utilizada: " + (runtime.totalMemory() - runtime.freeMemory() / (1024*1024)));

    }

}
