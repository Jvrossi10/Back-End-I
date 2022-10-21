package Aula_Integradora_Template_Method;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VendedorTest {

    @Test
    public void teste01(){
        Vendedor vendedorAfiliado = new Afiliado("Novato", 0);
        vendedorAfiliado.vender();
        vendedorAfiliado.recategorizar(vendedorAfiliado);
        vendedorAfiliado.mostrarCategoria();
        System.out.println("Pontos obtidos pelo funcionário: " + vendedorAfiliado.calcularPontos());
        System.out.println(vendedorAfiliado.toString());
        System.out.println("---------------------------------------------------------");
    }

    @Test
    public void teste02(){
        Funcionario vendedorFuncionario1 = new Funcionario("Novato",0,0);
        vendedorFuncionario1.vender();
        vendedorFuncionario1.vender();
        vendedorFuncionario1.obterAfiliado();
        vendedorFuncionario1.obterAfiliado();
        vendedorFuncionario1.recategorizar(vendedorFuncionario1);
        vendedorFuncionario1.mostrarCategoria();
        System.out.println("Pontos obtidos pelo funcionário: " + vendedorFuncionario1.calcularPontos());
        System.out.println(vendedorFuncionario1.toString());
        System.out.println("---------------------------------------------------------");
    }
    @Test
    public void teste03(){
        Funcionario vendedorFuncionario2 = new Funcionario("Novato",0,1);
        vendedorFuncionario2.vender();
        vendedorFuncionario2.vender();
        vendedorFuncionario2.obterAfiliado();
        vendedorFuncionario2.obterAfiliado();
        vendedorFuncionario2.recategorizar(vendedorFuncionario2);
        vendedorFuncionario2.mostrarCategoria();
        System.out.println("Pontos obtidos pelo funcionário: " + vendedorFuncionario2.calcularPontos());
        System.out.println(vendedorFuncionario2.toString());
        System.out.println("---------------------------------------------------------");
    }

    @Test
    public void teste04(){
        Vendedor vendedorAfiliado = new Afiliado("Novato", 0);
        vendedorAfiliado.vender();
        vendedorAfiliado.vender();
        vendedorAfiliado.vender();
        vendedorAfiliado.recategorizar(vendedorAfiliado);
        vendedorAfiliado.mostrarCategoria();
        System.out.println("Pontos obtidos pelo funcionário: " + vendedorAfiliado.calcularPontos());
        System.out.println(vendedorAfiliado.toString());
        System.out.println("---------------------------------------------------------");
    }

    @Test
    public void teste05(){
        Vendedor vendedorEstagiario1 = new Estagiario("Novato",0);
        vendedorEstagiario1.vender();
        vendedorEstagiario1.vender();
        vendedorEstagiario1.vender();
        vendedorEstagiario1.vender();
        vendedorEstagiario1.vender();
        vendedorEstagiario1.vender();
        vendedorEstagiario1.recategorizar(vendedorEstagiario1);
        vendedorEstagiario1.mostrarCategoria();
        System.out.println("Pontos obtidos pelo funcionário: " + vendedorEstagiario1.calcularPontos());
        System.out.println("---------------------------------------------------------");
    }

    @Test
    public void teste06(){
        Vendedor vendedorEstagiario = new Estagiario("Novato",30);
        vendedorEstagiario.vender();
        vendedorEstagiario.vender();
        vendedorEstagiario.vender();
        vendedorEstagiario.vender();
        vendedorEstagiario.vender();
        vendedorEstagiario.vender();
        vendedorEstagiario.recategorizar(vendedorEstagiario);
        vendedorEstagiario.mostrarCategoria();
        System.out.println("Pontos obtidos pelo funcionário: " + vendedorEstagiario.calcularPontos());
        System.out.println("---------------------------------------------------------");

    }


}