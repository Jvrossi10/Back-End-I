package Chain_of_Responsability.mesa_de_trabalho;

public class CheckEmbalagem extends Verificador{

    @Override
    public void verificar(Artigo artigo) {
        if((artigo.getEmbalagem().equalsIgnoreCase("Não saudavel")) || (artigo.getEmbalagem().equalsIgnoreCase("Não saudável")) ) {
            System.out.println("Verificação de EMBALAGEM: INVÁLIDO!");
        } else {
            if(this.getCheckProximo() != null ){
                this.getCheckProximo().verificar(artigo);
            } else {
                System.out.println("ARTIGO APROVADO EM TODAS AS ETAPAS!");
            }

        }
    }

}
