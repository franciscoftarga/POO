package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorCias {
	private ArrayList<CiaAerea> empresas;
	
	public GerenciadorCias() {
		empresas = new ArrayList<>();
	}

	public void adicionar(CiaAerea cia){
		empresas.add(cia);
	}

	public void remover(CiaAerea cia){
		empresas.remove(cia);
	}
	public void listarTodas(){
		System.out.println("Companhias aereas cadastradas: " + empresas.size() + "\n");
		for(CiaAerea c: empresas){
			System.out.println(getIndexCia(c) + " - Código: " + c.getCodigo() + " - Descrição: " + c.getNome());
		}
	}
	public int getIndexCia(CiaAerea cia){
		return empresas.indexOf(cia);
	}

	public CiaAerea buscarPorCodigo(String cod){
        CiaAerea ciaEncontrada = new CiaAerea();
        for(CiaAerea a : empresas){
            if(a.getCodigo().equals(cod)==true){
                ciaEncontrada = a;
            }       
        }
        return ciaEncontrada;
    }   

	public CiaAerea buscarPorNome(String nome){
        CiaAerea ciaEncontrada = new CiaAerea();
        for(CiaAerea a : empresas){
            if(a.getCodigo().equals(nome)==true){
                ciaEncontrada = a;
            }       
        }
        return ciaEncontrada;
    }   
}
