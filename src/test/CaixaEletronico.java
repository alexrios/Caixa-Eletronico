package test;

public class CaixaEletronico {

	public String sacar(int i) {
		
		String retorno = "";
		
		int[] nota = {10, 20, 50, 100};

		for (int x=3; x>=0; x--){
		
			if (i / nota[x] >= 1){
				retorno += ", " + Integer.valueOf( i / nota[x] ) + " - " + nota[x];
				i = i % nota[x];
			}
		}
		
		return retorno.replaceFirst(", ",  "");
				
	}

}
