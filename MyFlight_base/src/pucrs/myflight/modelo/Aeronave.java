package pucrs.myflight.modelo;

public class Aeronave {
	private String codigo;
	private String descricao;
	
	public Aeronave(String codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public Aeronave(){}
	
	public String getCodigo() {
		return codigo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public String toString(){
		return " Código: " + codigo + " Descrição: " + descricao;
	}
}
