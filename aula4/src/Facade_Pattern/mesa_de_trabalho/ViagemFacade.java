package Facade_Pattern.mesa_de_trabalho;

import java.time.LocalDate;

public class ViagemFacade implements IViagemFacade {

    private APIVoo apiVoo;
    private APIHotel apiHotel;

    public ViagemFacade(){
        apiVoo = new APIVoo();
        apiHotel = new APIHotel();
    }



    public Viagem agendarViagem(Viagem viagem) {

        return null;
    }
}


