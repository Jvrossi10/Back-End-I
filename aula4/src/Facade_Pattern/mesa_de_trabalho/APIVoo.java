package Facade_Pattern.mesa_de_trabalho;

public class APIVoo {

    public String reservarVoo(Voo voo, Viagem viagem) {
        if ((viagem.getDataPartida() == voo.getDataPartida()) && (viagem.getOrigem() == voo.getOrigem()) && (viagem.getDestino() == voo.getDestino()) ) {
            return "Voo agendado com sucesso!";
        } else {
            return "Não há voos disponíveis para a data selecionada!";
        }
    }

}
