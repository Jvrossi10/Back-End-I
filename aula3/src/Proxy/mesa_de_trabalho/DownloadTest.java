package Proxy.mesa_de_trabalho;

import org.junit.jupiter.api.Test;

public class DownloadTest {

    @Test
    public void teste01() {
        System.out.println(("---------------------"));
        Usuario usuario1 = new Usuario(001, "Free");

        ServicoDownloadProxy servicoDownloadProxy = new ServicoDownloadProxy();
        servicoDownloadProxy.download(usuario1);
    }

    @Test
    public void teste02(){
        System.out.println(("---------------------"));
        Usuario usuario2 = new Usuario(002, "Premium");

        ServicoDownloadProxy servicoDownloadProxy = new ServicoDownloadProxy();
        servicoDownloadProxy.download(usuario2);
    }

}
