package br.com.db1.colecoe;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.Assert;

public class ExercicioColecao {

	List<String> vogais = new ArrayList<>();
	List<String> consoantes = new ArrayList<>();
	List<Integer> valoresNumericos = new ArrayList<>();

	List<String> valores = new ArrayList<>();
	
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

	public Set<String> getConsoantes(String nomeParametro) {
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

	public List<Integer> removerTerceiraPosicao(List<Integer> valores) {
		valores.remove(2);
		return valores;
	}

	public List<Integer> getNumerosPares(List<Integer> valores) {
		List<Integer> valoresMultiplosDeDois = new ArrayList<>();
		Iterator<Integer> it = valores.iterator();
		while (it.hasNext()){
			Integer valor = it.next();

			if (valor > 0 && valor % 2 == 0){
				valoresMultiplosDeDois.add(valor);
			}
		}
		return valoresMultiplosDeDois;
	}

	
	

}
