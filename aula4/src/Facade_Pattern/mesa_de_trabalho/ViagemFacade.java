package Facade_Pattern.mesa_de_trabalho;

import java.time.LocalDate;

public class ViagemFacade implements IViagemFacade {

    private APIVoo apiVoo;
    private APIHotel apiHotel;

    public ViagemFacade(){
        apiVoo = new APIVoo();
        apiHotel = new APIHotel();
    }



    public void agendarViagem(LocalDate dataPartida, LocalDate dataRetorno, String origem, String destino) {
        String agendar;
        Viagem viagem = new Viagem(dataPartida,dataRetorno,origem,destino);
        agendar = apiVoo.reservarVoo(viagem.getDataPartida(),viagem.getDestino())
    }
}


