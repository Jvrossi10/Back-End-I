package Chain_of_Responsability;

public class GerenciadorComercial extends Gerenciador{


    @Override
    public void verificar(Mail eMail) {
        if((eMail.getDestino().equalsIgnoreCase("comercial@colmeia.com"))||(eMail.getAssunto().equalsIgnoreCase("Comercial"))){
            System.out.println("\nEnviado ao departamento Comercial.");
        } else {
            if(this.getGerenciadorSeguinte() != null){
                //Chamamos ao método o seguinte objeto
                this.getGerenciadorSeguinte().verificar(eMail);
            }
        }
    }
}
