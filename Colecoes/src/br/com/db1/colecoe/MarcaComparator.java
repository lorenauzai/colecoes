package br.com.db1.colecoe;

import java.util.Comparator;

public class MarcaComparator implements Comparator<Carros>{

	@Override
	public int compare(Carros carro, Carros outroCarro) {
		return carro.getMarca()
				.compareTo(outroCarro.getMarca());
	}

}
