package Chain_of_Responsability;

public class GerenciadorTecnico extends Gerenciador{

    @Override
    public void verificar(Mail eMail) {
        if((eMail.getDestino().equalsIgnoreCase("tecnico@colmeia.com"))||(eMail.getAssunto().equalsIgnoreCase("Técnico"))){
            System.out.println("\nEnviado ao departamento Técnico.");
        } else {
            if(this.getGerenciadorSeguinte() != null){
                //Chamamos ao método o seguinte objeto
                this.getGerenciadorSeguinte().verificar(eMail);
            }
        }
    }

}
