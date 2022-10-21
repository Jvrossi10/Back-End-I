package Chain_of_Responsability.mesa_de_trabalho;

public class CheckEmbalagem extends CheckQuality{


    @Override
    public void check(Artigo artigo) {
        if((artigo.getEmbalagem().equalsIgnoreCase("Saudável")) || (artigo.getEmbalagem().equalsIgnoreCase("Saudavel")) ) {
            System.out.println("Verificação de EMBALAGEM: VÁLIDO!");
        } else {
            if(this.getCheckProximo() != null ){
                this.getCheckProximo().check(artigo);
            }
        }
    }
}
