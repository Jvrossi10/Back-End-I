package JUnit.mesa_de_trabalho;

public class Circulo extends Figura{

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularPerimetro() {
        double perimetroCirculo = (2*3.14) * this.raio;
        return perimetroCirculo;
    }
}
