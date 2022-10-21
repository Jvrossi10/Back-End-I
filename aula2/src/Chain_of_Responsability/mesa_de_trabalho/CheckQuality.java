package Chain_of_Responsability.mesa_de_trabalho;

public class CheckQuality {
    Verificador inicial;

    public CheckQuality(){
        this.inicial = new CheckLote();
        Verificador checkPeso = new CheckPeso();
        Verificador checkEmbalagem = new CheckEmbalagem();

        inicial.setCheckProximo(checkPeso);
        checkPeso.setCheckProximo(checkEmbalagem);
    }

    public void verificar(Artigo artigo){
        inicial.verificar(artigo);
    }

}
