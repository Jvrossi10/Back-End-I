package Flyweight_Pattern.mesa_de_trabalho;

public class Arvore {

    private int altura;
    private int largura;
    private String cor, tipoArvore;

    public Arvore(int altura, int largura, String cor, String tipoArvore) {
        this.altura = altura;
        this.largura = largura;
        this.cor = cor;
        this.tipoArvore = tipoArvore;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipoArvore() {
        return tipoArvore;
    }

    public void setTipoArvore(String tipoArvore) {
        this.tipoArvore = tipoArvore;
    }

    @Override
    public String toString() {
        return "Arvore{" +
                "altura=" + altura +
                ", largura=" + largura +
                ", cor='" + cor + '\'' +
                ", tipoArvore='" + tipoArvore + '\'' +
                '}';
    }
}

