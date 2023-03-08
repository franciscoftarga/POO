import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Acoes acao = new Acoes();
        acao.criarListas();

        Cliente francisco = new Cliente("Francisco", 1);
        acao.cadastraCliente(francisco);
        Cliente doralice = new Cliente("Doralice", 2);
        acao.cadastraCliente(doralice);

        Produto produto1 = new Produto(1, "produto1", 10);
        Produto produto2 = new Produto(2,"produto2",20);
        acao.addProduto(produto1);
        acao.addProduto(produto2);

        ItemVenda item1 = new ItemVenda(10, produto1);
        ItemVenda item2 = new ItemVenda(20, produto2);

        acao.addItem(item1);
        acao.addItem(item2);

        acao.comprar(francisco,item1);
        acao.comprar(francisco,item2);
        acao.comprar(doralice,item2);

        acao.mostrarCompras(francisco);
        acao.mostrarCompras(doralice);

        acao.mostrarProdutos();
    }
}