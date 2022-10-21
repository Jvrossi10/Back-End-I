package Chain_of_Responsability.mesa_de_trabalho;

public abstract class CheckQuality {

    protected CheckQuality checkProximo;

    public CheckQuality getCheckProximo() {
        return checkProximo;
    }

    public void setCheckProximo(CheckQuality checkProximo) {
        this.checkProximo = checkProximo;
    }

    public abstract void check(Artigo artigo);

}
