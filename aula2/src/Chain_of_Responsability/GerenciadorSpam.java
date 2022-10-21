package Chain_of_Responsability;

public class GerenciadorSpam extends Gerenciador{

    @Override
    public void verificar(Mail eMail) {
        System.out.println("\nMarcado como SPAM.");
    }
}
