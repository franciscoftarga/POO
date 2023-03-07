public class ItemVenda {
    private int quantidade;
    private Produto produto;

    public ItemVenda(int quantidade, Produto produto){
        this.quantidade = quantidade;
        this.produto = produto;
    }
    public int getQuantidade(){
        return quantidade;
    }
    public Produto getProduto(){
        return produto;
    }

    @Override
    public String toString() {
        return quantidade + produto.getNome().toString();
    }
}
