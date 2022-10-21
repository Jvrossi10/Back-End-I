package Chain_of_Responsability.mesa_de_trabalho;

import Chain_of_Responsability.Mail;

public abstract class Verificador {

    protected Verificador checkProximo;
    protected int cont;

    public Verificador getCheckProximo() {
        return checkProximo;
    }

    public void setCheckProximo(Verificador checkProximo) {
        this.checkProximo = checkProximo;
    }

    public abstract void verificar(Artigo artigo);

}


