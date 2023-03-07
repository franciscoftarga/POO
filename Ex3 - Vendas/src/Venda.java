public class Venda {
    private Cliente cliente;
    private ItemVenda item;

    private String nome;

    public Venda(Cliente cliente, ItemVenda item){
        this.cliente = cliente;
        this.item = item;
    }
    public Cliente getCliente(){
        return cliente;
    }
    public ItemVenda getItem(){
        return item;
    }

    @Override
    public String toString() {
        return "Cliente: " + cliente.getNome() + " Item: " + item.getProduto().getNome();
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
}

