//Classe utilizada para armazenar todos os métodos relacionados à itens de venda.

public class ItemVenda {
    private int quantidade;
    private Produto produto;

    //Cria um item de venda utilizando as informações de quantidade e produto.
    public ItemVenda(int quantidade, Produto produto){
        this.quantidade = quantidade;
        this.produto = produto;
    }

    //Getters que obtém informações de quantidade e produto referentes aos itens de venda.
    public int getQuantidade(){
        return quantidade;
    }
    public Produto getProduto(){
        return produto;
    }
}
