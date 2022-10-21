package Chain_of_Responsability.mesa_de_trabalho;

import Chain_of_Responsability.Mail;

public class Verificador {

    Verificador inicial;

    public Verificador(){
        CheckQuality checkLote = new CheckLote();
        CheckQuality checkPeso = new CheckPeso();
        CheckQuality checkEmbalagem = new CheckEmbalagem();

        //buguei aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa

    }
    public void verificar(Artigo artigo){
        inicial.verificar(artigo);
    }

}
