package Template_Method_Pattern.mesa_de_trabalho;

public class Main {

    public static void main(String[] args) {

        Funcionario funcionario01 = new Funcionario("João",1);
        Cardapio prato01 = new Cardapio_Adulto(19.90);
        Cardapio prato02 = new Cardapio_Infantil(14.99, 7.99);
        Cardapio prato03 = new Cardapio_Vegetariano(22.50);

        funcionario01.montar(prato01);
        funcionario01.montar(prato02);
        funcionario01.montar(prato03);

        System.out.println("O valor total da compra é: R$ " + funcionario01.calcularPreco());

    }

}
