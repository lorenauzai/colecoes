package br.com.db1.colecoe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploColecao {

	private List<String> nomesDB1Start = new ArrayList<>();

	public void adicionarNomes(String nome) {
		nomesDB1Start.add(nome);
	}

	public void removerNomes(String nome) {
		nomesDB1Start.remove(nome);
	}

	public Boolean estaNaLista(String nome) {
		return nomesDB1Start.contains(nome);
	}

	public void percorrerList(){
		Iterator lista = nomesDB1Start.iterator();
		while (lista.hasNext()){
			System.out.println(lista.next());
		}
	}

	public Integer tamanhoLista() {
		return nomesDB1Start.size();
	}
	
	public List<String> getLista(){
		return nomesDB1Start;
	}

	public List<String> getListaOrdenada() {
		Collections.sort(nomesDB1Start);
		return nomesDB1Start;
	}
	
}
