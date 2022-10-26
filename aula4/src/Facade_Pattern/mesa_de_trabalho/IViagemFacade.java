package Facade_Pattern.mesa_de_trabalho;

import java.time.LocalDate;

public interface IViagemFacade {

    public void agendarViagem(LocalDate dataPartida, LocalDate dataRetorno, String origem, String destino);

}

