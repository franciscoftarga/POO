//Classe utilizada para armazenar todos métodos relacionados aos produtos.

public class Produto {
    private int codigo;
    private String nome;
    private double preco;

    //Cria um produto através de um código, um nome e um preço.
    public Produto(int codigo, String nome, double preco){
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    //Métodos Getters que obtém informações de codigo, nome e preço.
    public int getCodigo(){
        return codigo;
    }
    public String getNome(){
        return nome;
    }
    public double getPreco(){
        return preco;
    }

}
