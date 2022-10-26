package Log4J;

import org.apache.log4j.Logger;

public class Main {

    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {

        Leao leao = new Leao();
        leao.setIdade(4);
        leao.setNome("Simba");
        leao.seteAlfa(true);
        leao.correr();

        try{
           leao.eMaiorQue10();
        }catch (Exception e){
            logger.error("A idade do leão " + leao.getNome() + " está incorreta!", e);
        }

        Leao leao2 = new Leao();
        leao2.setIdade(-1);
        leao2.setNome("Gente Boa");
        leao2.seteAlfa(true);
        leao2.correr();

        try{
            leao2.eMaiorQue10();
        }catch (Exception e){
            logger.error("A idade do leão " + leao2.getNome() + " está incorreta!", e);
        }

        Tigre tigre = new Tigre();
        tigre.setNome("Osvaldo");
        tigre.setIdade(8);
        tigre.correr();

        try{
            tigre.eMaiorQue10();
        }catch (Exception e){
            logger.error("A idade do leão " + tigre.getNome() + " está incorreta!", e);
        }
    }

}