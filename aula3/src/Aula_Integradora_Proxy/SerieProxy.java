package Aula_Integradora_Proxy;

public class SerieProxy implements ISerie{

    int qtdViews = 1;

    @Override
    public String getSerie(String serie) {
        try {
            if (qtdViews <= 5) {
                qtdViews++;
                return "Exibindo serie...";
            } else {
               throw new Exception("Limite semanal atingido!");
            }
        } catch (Exception serieNaoHabilitadaException) {
           return serieNaoHabilitadaException.getMessage();
        }
    }
}
