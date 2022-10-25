package Facade_Pattern.mesa_de_trabalho;

import java.time.LocalDate;

public class Voo {

    private LocalDate dataPartida;
    private String origem, destino;

    public Voo(LocalDate dataPartida, String origem, String destino) {
        this.dataPartida = dataPartida;
        this.origem = origem;
        this.destino = destino;
    }

    public LocalDate getDataPartida() {
        return dataPartida;
    }

    public void setDataPartida(LocalDate dataPartida) {
        this.dataPartida = dataPartida;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
}
