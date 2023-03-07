import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        ArrayList<Cliente>clientes = new ArrayList<>();
        ArrayList<Produto>produtos = new ArrayList<>();
        ArrayList<ItemVenda>itemVendas = new ArrayList<>();
        ArrayList<Venda>vendas = new ArrayList<>();

        Cliente cliente1 = new Cliente("Francisco", "03078944018");
        clientes.add(cliente1);

        Produto produto1 = new Produto(1, "produto 1", 10);
        produtos.add(produto1);

        ItemVenda item1 = new ItemVenda(10,produto1);
        itemVendas.add(item1);

        Venda venda1 = new Venda(cliente1, item1);
        vendas.add(venda1);


        for(Venda v : vendas){
            System.out.println(v.toString());
        }
    }
}