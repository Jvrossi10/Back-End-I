package Template_Method_Pattern;

import org.junit.jupiter.api.Test;

public class FuncionarioTest {

    @Test
    void Calculos(){
        Funcionario funcionarioEfetivo = new Efetivo("Odair", "Antunes", "1234567890", 3000.00,1000.00,500.00);
        funcionarioEfetivo.pagamentoSalario();
        Funcionario funcionarioContratado = new Contratado("Marlene", "Peixoto", "0987654321",50.00,50);
        funcionarioContratado.pagamentoSalario();
    }

}