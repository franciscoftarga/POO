package pucrs.myflight.modelo;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class GerenciadorVoos {

    private ArrayList<Voo> voos;
    public void adicionar(Voo v){
        voos.add(v);
    }

    public GerenciadorVoos(){
        voos = new ArrayList<Voo>();
    }
    public void remover(Voo voo){
        voos.remove(voo);
    }
    public void listarTodos(){
        System.out.println("Voos cadastrados: " + voos.size() + "\n");
        for(Voo v : voos){
            System.out.println(getIndexRota(v) + " - Rota: " + v.getRota().getOrigem().getNome() + "-" +
                    v.getRota().getDestino().getNome() + " - Data/Hora: " + v.getDatahora() + " - Status: "  + v.getStatus()
                    + " - Duração : "  + v.getDuracao());
        }
    }
    public int getIndexRota(Voo voo){
        return voos.indexOf(voo);
    }

    public ArrayList<Voo> buscarData(LocalDateTime d) {
        ArrayList<Voo> voosEncontrados = new ArrayList<>();
        for (Voo v : voos) {
            if (v.getDatahora() == d) {
                voosEncontrados.add(v);
            }
        }
        return voosEncontrados;
    }

}
