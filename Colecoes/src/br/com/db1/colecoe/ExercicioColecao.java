package br.com.db1.colecoe;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Assert;

public class ExercicioColecao {

	List<String> vogais = new ArrayList<>();
	List<String> consoantes = new ArrayList<>();
	List<Integer> valoresNumericos = new ArrayList<>();

	List<String> valores = new ArrayList<>();
	
	Produto produto = new Produto(98, "CELULAR", 1000.00);
	Produto produto2 = new Produto(50, "MONITOR", 200.00);
	Produto produto3 = new Produto(55, "CANECA", 50.00);
	
	List lista = new ArrayList<>();

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

		valores.add("banana");
		valores.add("maca");
		valores.add("pera");
		valores.add("jabuticaba");
		valores.add("ameixa");
		valores.add("uva");
		valores.add("laranja");
		valores.add("limão");
		valores.add("tomate");
		valores.add("melancia");
		
		
		lista.add(produto);
		lista.add(produto2);
		lista.add(produto3);
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

	public List<Integer> removerTerceiraPosicao(Integer posicao) {
		valoresNumericos.remove(posicao);

		return valoresNumericos;
	}

	public List<Integer> multiplosDeTres(Integer posicao) {

		for (Integer x = 0; x < 10; x++) {
			if (x % 3 == 0) {
				valoresNumericos.get(posicao);
			}
		}
		return valoresNumericos;
	}

	public List<Integer> multiplosDeDois(Integer valores) {
		for (Integer x = 0; x < 10; x++) {
			if (x % 2 == 0) {
				valoresNumericos.get(valores);
			}
		}
		return valoresNumericos;

	}

	public Set<String> copiarValores() {
		Set<String> valoresNovaLista = new HashSet<>(valores);
		return valoresNovaLista;
	}

	public List<String> compararDuasList() {
		return valores;
	}
	
	public List<String> compararDuasList2() {
		return valores;
	}

	public Set<String> compararDoisSet() {
		Set<String> valoresNovos = new HashSet<>(valores);
		return valoresNovos;
	}
	
	public Set<String> compararDoisSet2() {
		Set<String> valoresNovos = new HashSet<>(valores);
		return valoresNovos;
	}
	
	

}
