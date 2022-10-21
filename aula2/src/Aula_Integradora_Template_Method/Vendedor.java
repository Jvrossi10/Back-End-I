package Aula_Integradora_Template_Method;

public abstract class Vendedor {

    private String categoria;

    public Vendedor(String categoria) {
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }



    public abstract void vender();
    public abstract int calcularPontos();
    public abstract void recategorizar(Vendedor vendedor);
    public abstract void mostrarCategoria();


}
