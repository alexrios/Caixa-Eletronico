package test;

import java.util.HashMap;

public class CaixaEletronico {
	
	private final Integer[] CEDULAS = { 100, 50, 20, 10 };

	public HashMap<String, Integer> sacar(int valorSaque) {
		HashMap<String, Integer> cedulasSacadas = new HashMap<String, Integer>();
		
		for (Integer valorCedula : CEDULAS) {
			if(valorSaque >= valorCedula){
				int quantidadeScada = valorSaque / valorCedula;
				cedulasSacadas.put(String.valueOf(valorCedula), quantidadeScada);
				valorSaque = valorSaque % valorCedula;
			}
		}
		return cedulasSacadas;
	}
}