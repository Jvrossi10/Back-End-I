package Proxy.mesa_de_trabalho;

public class ServicoDownload implements Download{


    @Override
    public void download(Usuario usuario) {
        System.out.println("Efetuando o download...");
    }

    public void downloadPirata(){
        System.out.println("4shared atualizado");
    }
}
