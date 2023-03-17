package pucrs.myflight.modelo;
import java.util.ArrayList;
public class GerenciadorAeroportos {

    private ArrayList<Aeroporto>aeroportos;
    public void adicionar(Aeroporto aeroporto){
        aeroportos.add(aeroporto);
    }

    public void remover(Aeroporto aeroporto){
        aeroportos.remove(aeroporto);
    }
    public void listarTodos(){
        System.out.println("Aeroportos cadastradas: " + aeroportos.size() + "\n");
        for(Aeroporto a : aeroportos){
            System.out.println(getIndexAeronave(a) + " - Código: " + a.getCodigo() + " - Descrição: " + a.getNome() + " - Geolocalização: " + a.getLocal());
        }
    }
    public int getIndexAeronave(Aeroporto aeroporto){
        return aeroportos.indexOf(aeroporto);
    }

}
