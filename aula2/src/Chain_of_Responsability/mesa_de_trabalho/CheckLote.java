package Chain_of_Responsability.mesa_de_trabalho;

public class CheckLote extends CheckQuality{

    @Override
    public void check(Artigo artigo) {
        if((artigo.getLote() >= 1000) && (artigo.getLote()<=2000) ) {
            System.out.println("Verificação de LOTE: VÁLIDO!");
        } else {
            if(this.getCheckProximo() != null ){
                this.getCheckProximo().check(artigo);
            }
        }
    }

}

