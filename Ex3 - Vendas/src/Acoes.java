//Classe utilizada para armazenar todas as listas e métodos de ações utilizadas pelo cliente.

import java.util.ArrayList;

public class Acoes {
    private ArrayList<Cliente> clientes;
    private ArrayList<Produto> produtos;
    private ArrayList<Venda> vendas;
    private ArrayList<ItemVenda> itens;

    private int contVendas;

    //Cria as listas de clientes, produtos, vendas, itens e inicializa a variável contadora de vendas.
    public void criarListas() {
        clientes = new ArrayList<>();
        produtos = new ArrayList<>();
        vendas = new ArrayList<>();
        itens = new ArrayList<>();
        contVendas = 0;
    }

    //Adiciona um cliente na lista de clientes.
    public void cadastraCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    //Adiciona um produto na lista de produtos.
    public void addProduto(Produto produto) {
        produtos.add(produto);
    }

    //Adiciona um item na lista de itens de venda.
    public void addItem(ItemVenda item) {
        itens.add(item);
    }

    //Adiciona os itens na lista de vendas do cliente que realizou a compra
    public void comprar(Cliente cliente, ItemVenda item) {
        if (clientes.contains(cliente) && itens.contains(item)) {
            contVendas++;
            Venda venda = new Venda(cliente, item);
            venda.setNome("Compra" + contVendas);
            vendas.add(venda);
        } else {
            System.out.println("Realize seu cadastro e verifique se o produto desejado encontra-se disponível pra compra");
        }
    }

    //Imprime os produtos que o cliente selecionado quer comprar, suas quantidades, seus valores e o valor total da compra
    public void mostrarCompras(Cliente cliente) {
        double valorTotalDaVenda = 0.0;
        int quantidade = 0;
        double preco = 0.0;

        System.out.println("------------------------------------------------------------");
        System.out.println("***** COMPRAS DO CLIENTE " + cliente.getNome() + " *****");

        for (Venda v : vendas) {
            if (v.getCliente().equals(cliente)) {
                System.out.println("Produto: " + v.getItem().getProduto().getNome() + " - Preço: R$" + v.getItem().getProduto().getPreco()
                        + " - Quantidade: " + v.getItem().getQuantidade());
                quantidade += v.getItem().getQuantidade();
                preco += v.getItem().getProduto().getPreco();
                valorTotalDaVenda = preco * quantidade;
            }
        }
        System.out.println("Total valor a pagar: R$" + valorTotalDaVenda);
        valorTotalDaVenda = 0.0;
        System.out.println("------------------------------------------------------------");
    }

        //Imprime os produtos disponíveis na lista de produtos.
        public void mostrarProdutos() {
            System.out.println("------------------------------------------------------------");
            System.out.println("***** PRODUTOS DISPONÍVEIS: *****");

            for (Produto p : produtos) {
                System.out.println("\n Nome: " + p.getNome() + " - Código: " + p.getCodigo() + " - Preço: " + p.getPreco());
            }
            System.out.println("------------------------------------------------------------");
        }
    }


