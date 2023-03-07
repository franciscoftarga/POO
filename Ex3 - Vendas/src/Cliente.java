//Classe utilizada para armazenar métodos relacionados ao cliente.
public class Cliente {
    private String nome;
    private String cpf;

    //Cria um cliente através das informações de nome e CPF.
    public Cliente(String nome, String cpf){
        this.cpf = cpf;
        this.nome = nome;
    }

    //Métodos Getter que obtém informações de nome e CPF
    public String getNome(){
        return nome;
    }
    public String getCpf(){
        return cpf;
    }
}
