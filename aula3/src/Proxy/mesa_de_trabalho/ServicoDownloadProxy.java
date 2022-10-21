package Proxy.mesa_de_trabalho;

public class ServicoDownloadProxy implements Download{


    @Override
    public void download(Usuario usuario) {
        if(usuario.getTipoUsuario().equalsIgnoreCase("Premium")){
            ServicoDownload servicoDownload = new ServicoDownload();
            servicoDownload.download(usuario);
            //servicoDownload.downloadPirata();
        } else {
            System.out.println("Download não permitido!");
        }

    }
}
