//Classe utilizada para armazenar todos os métodos relacionados às vendas.

public class Venda {
    private Cliente cliente;
    private ItemVenda item;
    private String nome;

    //Cria uma venda utilizando as informações de cliente e item de venda.
    public Venda(Cliente cliente, ItemVenda item){
        this.cliente = cliente;
        this.item = item;
    }

    //Métodos Getters que obtém informações de cliente e item de venda.
    public Cliente getCliente(){
        return cliente;
    }
    public ItemVenda getItem(){
        return item;
    }
    public String getNome(){ return nome; }

    //Método Setter que permite que o nome do produto seja mudado.
    public void setNome(String nome){
        this.nome = nome;
    }
}

