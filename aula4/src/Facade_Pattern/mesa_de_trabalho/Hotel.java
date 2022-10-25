package Facade_Pattern.mesa_de_trabalho;

import java.time.LocalDate;

public class Hotel {

    private LocalDate dataEntrada, dataSaida;
    private String cidade;

    public Hotel(LocalDate dataEntrada, LocalDate dataSaida, String cidade) {
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.cidade = cidade;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public LocalDate getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(LocalDate dataSaida) {
        this.dataSaida = dataSaida;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
