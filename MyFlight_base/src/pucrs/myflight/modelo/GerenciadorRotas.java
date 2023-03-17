package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorRotas {
    private ArrayList<Rota> rotas;
    public void adicionar(Rota rota){
        rotas.add(rota);
    }

    public void remover(Rota rota){
        rotas.remove(rota);
    }
    public void listarTodas(){
        System.out.println("Rotas cadastradas: " + rotas.size() + "\n");
        for(Rota r : rotas){
            System.out.println(getIndexRota(r) + " - Cia Aérea: " + r.getCia().getNome() + " - Aeronave: "
                    + r.getAeronave().getDescricao() + " - Destino: " + r.getOrigem().getNome() + " - Destino: " +
                    r.getDestino().getNome());
        }
    }
    public int getIndexRota(Rota rota){
        return rotas.indexOf(rota);
    }


}
