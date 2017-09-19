package br.com.db1.colecoe;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ExercicioColecao {

	List<String> vogais = new ArrayList<>();
	List<String> consoantes = new ArrayList<>();
	List<Integer> valoresNumericos = new ArrayList<>();

	public ExercicioColecao() {
		vogais.add("a");
		vogais.add("e");
		vogais.add("i");
		vogais.add("o");
		vogais.add("u");

		consoantes.add("b");
		consoantes.add("c");
		consoantes.add("d");
		consoantes.add("f");
		consoantes.add("g");
		consoantes.add("h");
		consoantes.add("j");
		consoantes.add("k");
		consoantes.add("l");
		consoantes.add("m");
		consoantes.add("n");
		consoantes.add("p");
		consoantes.add("q");
		consoantes.add("r");
		consoantes.add("s");
		consoantes.add("t");
		consoantes.add("v");
		consoantes.add("w");
		consoantes.add("x");
		consoantes.add("y");
		consoantes.add("z");
		
		valoresNumericos.add(1);
		valoresNumericos.add(2);
		valoresNumericos.add(3);
		valoresNumericos.add(4);
		valoresNumericos.add(5);
		valoresNumericos.add(6);
		valoresNumericos.add(7);
		valoresNumericos.add(8);
		valoresNumericos.add(9);
		valoresNumericos.add(10);
	}

	public Set<String> getVogais(String nomeParametro) {
		nomeParametro = nomeParametro.toLowerCase();
		Set<String> vogaisEncontradas = new HashSet<>();

		for (Integer x = 0; x < nomeParametro.length(); x++) {
			String letras = nomeParametro.substring(x, x + 1);
			if (vogais.contains(letras)) {
				vogaisEncontradas.add(letras);
			}
		}

		return vogaisEncontradas;
	}

	public Set<String> getConsoantes(String nomeParametro) { //erro
		nomeParametro = nomeParametro.toLowerCase();
		Set<String> consoantesEncontradas = new HashSet<>();

		for (Integer x = 0; x < nomeParametro.length(); x++) {
			String letras = nomeParametro.substring(x, x + 1);
			if (consoantes.contains(letras)) {
				consoantesEncontradas.add(letras);
			}
		}

		return consoantesEncontradas;
	}

	public Set<Integer> removerTerceiraPosicao(Integer posicao) {
		valoresNumericos.remove(3);
		
		return ;
	}
	
	

}
