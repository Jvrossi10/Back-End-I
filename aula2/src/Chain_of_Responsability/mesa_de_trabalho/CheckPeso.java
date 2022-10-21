package Chain_of_Responsability.mesa_de_trabalho;

public class CheckPeso extends Verificador{


    @Override
    public void verificar(Artigo artigo) {
        if((artigo.getPeso() < 1200) || (artigo.getPeso() > 1300) ) {
            System.out.println("Verificação de PESO: INVÁLIDO!");
        } else {
            if(this.getCheckProximo() != null ){
                this.getCheckProximo().verificar(artigo);
            }
        }
    }
}
