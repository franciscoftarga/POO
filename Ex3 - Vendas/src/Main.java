import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        ListasAcoes listas = new ListasAcoes();
        listas.criarListas();

        Cliente francisco = new Cliente("Francisco", "03078944018");
        listas.addCliente(francisco);
        Cliente doralice = new Cliente("Doralice", "80852220006");
        listas.addCliente(doralice);
        Cliente taches = new Cliente("Taches", "03078931030");

        Produto produto1 = new Produto(1, "produto1", 10);
        Produto produto2 = new Produto(2,"produto2",20);
        listas.addProduto(produto1);

        ItemVenda item1 = new ItemVenda(10, produto1);
        ItemVenda item2 = new ItemVenda(20, produto2);
        listas.addItem(item1);
        listas.addItem(item2);
        listas.comprar(francisco,item1);
        listas.comprar(francisco,item2);
        listas.comprar(doralice,item2);

        listas.mostrarCompras(francisco);
        listas.mostrarCompras(doralice);
    }
}