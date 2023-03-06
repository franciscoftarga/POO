import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas  = new ArrayList<>();
        Pessoa eu = new Pessoa("Francisco", 22);
        Pessoa pedro = new Pessoa("Pedro", 22);
        pessoas.add(pedro);
        pessoas.add(eu);
        System.out.println(pessoas.toString());

        System.out.println();
        System.out.println("Lista dos fodas: \n");
        for(int pos=0; pos < pessoas.size(); pos++) {
            String pessoasfodas = String.valueOf(pessoas.get(pos));
            System.out.println(pessoasfodas);
        }
        pessoas.remove(0);
        System.out.println("\nRemovido da lista, lixo. " + "\n\nLista dos fodas: " + pessoas);
    }
}