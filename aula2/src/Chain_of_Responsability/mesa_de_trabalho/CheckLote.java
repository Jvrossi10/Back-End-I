package Chain_of_Responsability.mesa_de_trabalho;

public class CheckLote extends Verificador{

    @Override
    public void verificar(Artigo artigo) {
        if((artigo.getLote() < 1000) || (artigo.getLote() >2000) ) {
            System.out.println("Verificação de LOTE: INVÁLIDO!");
        } else {
            if(this.getCheckProximo() != null ){
                this.getCheckProximo().verificar(artigo);
            }
        }
    }

}

