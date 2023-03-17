package pucrs.myflight.consoleApp;

import pucrs.myflight.modelo.*;
import java.time.LocalDateTime;
import java.time.Duration;
import java.util.ArrayList;
public class App {
	public static void main(String[] args) {
		System.out.println("\nMyFlight project...\n");

		LocalDateTime datahora = LocalDateTime.of(2023, 10, 23, 03, 00);
		LocalDateTime datahora2 = LocalDateTime.of(2025, 12, 23, 05, 00);
		Duration duracao =  Duration.ofMinutes(120);

		GerenciadorAeronaves teste = new GerenciadorAeronaves();
		GerenciadorAeroportos teste2 = new GerenciadorAeroportos();
		GerenciadorVoos teste3 = new GerenciadorVoos();
		GerenciadorRotas teste4 = new GerenciadorRotas();
		GerenciadorCias teste5 = new GerenciadorCias();

		Geo geo = new Geo(223552.32, 223552.32);
		Geo geo2 = new Geo(323233.33, 323233.33);
		Aeronave aeronaveteste = new Aeronave("01","BoeingTeste1");
		Aeronave aeronaveteste2 = new Aeronave("02", "BoeingTeste2");
		Aeroporto aeroportoteste = new Aeroporto("01", "Santos Dumont", geo);
		Aeroporto aeroportoteste2 = new Aeroporto("02","Guarulhos", geo2);
		CiaAerea ciateste = new CiaAerea("01", "TAM");
		Rota rotateste = new Rota(ciateste, aeroportoteste, aeroportoteste2, aeronaveteste);
		Voo vooteste = new Voo(rotateste, datahora,duracao);
		Voo vooteste2 = new Voo(rotateste, datahora2, duracao);
		teste3.adicionar(vooteste);
		teste3.listarTodos();
		teste3.buscarData(datahora);



	}
}
