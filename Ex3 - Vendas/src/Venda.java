public class Venda {
    private Cliente cliente;
    private ItemVenda item;

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
}

