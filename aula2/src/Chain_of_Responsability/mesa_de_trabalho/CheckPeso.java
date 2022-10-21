package Chain_of_Responsability.mesa_de_trabalho;

public class CheckPeso extends CheckQuality{


    @Override
    public void check(Artigo artigo) {
        if((artigo.getPeso() >= 1200) && (artigo.getPeso()<=1300) ) {
            System.out.println("Verificação de PESO: VÁLIDO!");
        } else {
            if(this.getCheckProximo() != null ){
                this.getCheckProximo().check(artigo);
            }
        }
    }
}
