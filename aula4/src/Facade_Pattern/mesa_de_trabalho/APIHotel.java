package Facade_Pattern.mesa_de_trabalho;

public class APIHotel {

    public String reservaHotel(Hotel hotel, Viagem viagem){
        if((viagem.getDataPartida() == hotel.getDataEntrada()) && (viagem.getDataRetorno() == hotel.getDataSaida())){
            return "Hotel reservado com sucesso!";
        } else {
            return "Não há hoteis disponíveis para a data selecionada!";
        }
    }

}
