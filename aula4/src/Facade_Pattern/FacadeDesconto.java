package Facade_Pattern;

public class FacadeDesconto implements IFacadeDesconto{

    //Armazenam nas variáveis uma instância de cada uma
    private APICartao apiCartao;
    private APIProduto apiProduto;
    private APIQuantidade apiQuantidade;

    //Construtor que irá criar as instâncias
    public FacadeDesconto() {
        apiCartao = new APICartao();
        apiProduto = new APIProduto();
        apiQuantidade = new APIQuantidade();
    }

    //Simplifica os descontos
    public int desconto(Cartao cartao, Produto produto, int quantidade){
        int desconto = 0;
        desconto = desconto + apiQuantidade.desconto(quantidade);
        desconto = desconto + apiProduto.desconto(produto);
        desconto = desconto + apiCartao.desconto(cartao);
        return desconto;
    }


}
