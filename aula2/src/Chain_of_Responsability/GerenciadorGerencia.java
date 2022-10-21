package Chain_of_Responsability;

public class GerenciadorGerencia extends Gerenciador{


    @Override
    public void verificar(Mail eMail) {
        if((eMail.getDestino().equalsIgnoreCase("gerencia@colmeia.com"))||(eMail.getAssunto().equalsIgnoreCase("Gerência"))){
            System.out.println("\nEnviado ao departamento Gerencial.");
        } else {
            if(this.getGerenciadorSeguinte() != null){
                //Chamamos ao método o seguinte objeto
                this.getGerenciadorSeguinte().verificar(eMail);
            }
        }
    }
}
