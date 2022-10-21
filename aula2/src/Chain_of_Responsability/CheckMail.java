package Chain_of_Responsability;

public class CheckMail {

    Gerenciador inicial;

    public CheckMail(){
        this.inicial = new GerenciadorGerencia();
        Gerenciador tecnico = new GerenciadorTecnico();
        Gerenciador comercial = new GerenciadorComercial();
        Gerenciador spam = new GerenciadorSpam();

        inicial.setGerenciadorSeguinte(comercial);
        comercial.setGerenciadorSeguinte(tecnico);
        tecnico.setGerenciadorSeguinte(spam);
    }

    public void verificar(Mail eMail){
        inicial.verificar(eMail);
    }

}
