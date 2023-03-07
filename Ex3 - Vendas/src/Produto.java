import java.util.ArrayList;

public class Produto {
    private int codigo;
    private String nome;
    private double preco;
    private ArrayList<Produto>produtos;

    public Produto(int codigo, String nome, double preco){
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }
    public int getCodigo(){
        return codigo;
    }
    public String getNome(){
        return nome;
    }
    public double getPreco(){
        return preco;
    }

    @Override
    public String toString() {
        return codigo + nome + preco;
    }
}
