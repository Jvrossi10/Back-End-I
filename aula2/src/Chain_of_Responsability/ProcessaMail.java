package Chain_of_Responsability;

public class ProcessaMail {

    public static void main(String[] args) {

        CheckMail processo = new CheckMail();

        processo.verificar(new Mail("email@email.com", "tecnico@digitalhouse.com", "Reclamação"));
        processo.verificar(new Mail("email@email.com", "sds@digitalhouse.com", "Gerencia"));
        processo.verificar(new Mail("email@email.com", "juan@pepe.com", "Comercial"));
        processo.verificar(new Mail("email@email.com", "tecnico@colmeia.com", "Reclamação"));

    }

}
