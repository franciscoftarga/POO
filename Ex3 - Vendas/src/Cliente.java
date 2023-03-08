//Classe utilizada para armazenar métodos relacionados ao cliente.
public class Cliente {
    private String nome;
    private int cod;

    //Cria um cliente através das informações de nome e cod.
    public Cliente(String nome, int cod){
        this.cod = cod;
        this.nome = nome;
    }

    //Métodos Getter que obtém informações de nome e cod
    public String getNome(){
        return nome;
    }
    public int getCod(){
        return cod;
    }
}
