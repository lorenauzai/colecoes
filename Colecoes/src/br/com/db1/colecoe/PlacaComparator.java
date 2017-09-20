package br.com.db1.colecoe;

import java.util.Comparator;

public class PlacaComparator implements Comparator<Carros>{

	@Override
	public int compare(Carros carro, Carros outroCarro) {
		return carro.getPlaca()
				.compareTo(outroCarro.getPlaca());
	}

}
