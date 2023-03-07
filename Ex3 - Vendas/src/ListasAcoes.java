import java.util.ArrayList;

public class ListasAcoes {
    private ArrayList<Cliente> clientes;
    private ArrayList<Produto> produtos;
    private ArrayList<Venda> vendas;
    private ArrayList<ItemVenda> itens;

    private int contVendas;

    public void criarListas() {
        clientes = new ArrayList<>();
        produtos = new ArrayList<>();
        vendas = new ArrayList<>();
        itens = new ArrayList<>();
        contVendas = 0;
    }

    public void addCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void addProduto(Produto produto) {
        produtos.add(produto);
    }

    public void addItem(ItemVenda item) {
        itens.add(item);
    }

    public void comprar(Cliente cliente, ItemVenda item) {
        if (clientes.contains(cliente) && itens.contains(item)) {
            contVendas++;
            Venda venda = new Venda(cliente, item);
            venda.setNome("Venda" + contVendas);
            vendas.add(venda);
        } else {
            System.out.println("Realize seu cadastro e verifique se o produto desejado encontra-se disponível pra compra");
        }
    }

    public void mostrarCompras(Cliente cliente) {
        for (Venda v : vendas) {
            if (v.getCliente().equals(cliente)) {
                System.out.println("Produtos de " + cliente.getNome() + ": " + v.getItem().getProduto().getNome());
            }
        }
    }
}


