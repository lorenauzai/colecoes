package br.com.db1.colecoe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ExemploColecaoSet {

	private Set<String> nomesDB1Start = new HashSet<>();

	public void adicionarNomes(String nome) {
		nomesDB1Start.add(nome);
	}

	public void removerNomes(String nome) {
		nomesDB1Start.remove(nome);
	}

	public Boolean estaNaLista(String nome) {
		return nomesDB1Start.contains(nome);
	}

	public void percorrerList() {
		Iterator lista = nomesDB1Start.iterator();
		while (lista.hasNext()) {
			System.out.println(lista.next());
		}
	}

	public Integer tamanhoLista() {
		return nomesDB1Start.size();
	}

	public Set<String> getLista() {
		return nomesDB1Start;
	}

	public List<String> getListaOrdenada() {
		List<String> ordenados = new ArrayList<>();
		ordenados.addAll(nomesDB1Start);
		Collections.sort(ordenados);
		return ordenados;
	} // possivel gambiarra.

	public Set<String> getListaOrdenada2() {
		Set<String> ordenados = new TreeSet<>();
		ordenados.addAll(nomesDB1Start);
		return ordenados;
	}

}
