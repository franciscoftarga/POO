package pucrs.myflight.modelo;
import java.util.ArrayList;
public class GerenciadorAeronaves {
    private ArrayList<Aeronave>aeronaves;

    public GerenciadorAeronaves(){
        aeronaves = new ArrayList<>();
    }

    public void adicionar(Aeronave aeronave){
        aeronaves.add(aeronave);
    }

    public void remover(Aeronave aeronave){
        aeronaves.remove(aeronave);
    }
    public void listarTodas(){
        System.out.println("Aeronaves cadastradas: " + aeronaves.size() + "\n");
        for(Aeronave a : aeronaves){
            System.out.println(getIndexAeronave(a) + " - Código: " + a.getCodigo() + " - Descrição: " + a.getDescricao());
        }
    }
    public int getIndexAeronave(Aeronave aeronave){
        return aeronaves.indexOf(aeronave);
    }
    public Aeronave buscarPorCodigo(String cod){
        Aeronave aeronaveEncontrada = new Aeronave();
        for(Aeronave a : aeronaves){
            if(a.getCodigo().equals(cod)==true){
                aeronaveEncontrada = a;
            }       
        }
        return aeronaveEncontrada;
    }   
}
