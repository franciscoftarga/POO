public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    public String getNome(Pessoa p){
        return nome;
    }
    public int getIdade(Pessoa p){
        return idade;
    }
    public String toString(){
       return "Nome: " + nome + " Idade: " +  idade;
    }
}
