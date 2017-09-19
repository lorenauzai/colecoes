package br.com.db1.colecoe;

import java.util.Arrays;

public class ExemploArray {

	public String[] getNomes() {
		String[] alunosTurmaDB1Start = new String[3];
		alunosTurmaDB1Start[0] = "alexander";
		alunosTurmaDB1Start[1] = "silas";
		alunosTurmaDB1Start[2] = "elielson";

		return null;
	}

	public Integer[] ordenaNumeros(Integer[] numeros) {
		Arrays.sort(numeros);
		return numeros;
	}

	public Integer[] ordenaNumeros3(Integer[] numeros) {
		Integer[] numerosOrdenados = new Integer[numeros.length];

		for (Integer i = 0; i < numeros.length; i++) {
			if (i == 0) {
				numerosOrdenados[i] = numeros[i];
			} else {
				if (numerosOrdenados[i - 1] > numeros[i]) {
					Integer valorMaior = numerosOrdenados[i - 1];
					numerosOrdenados[i - 1] = numeros[i];
					numerosOrdenados[i] = valorMaior;
				}
			}
		}
		return numerosOrdenados;
	}

}
