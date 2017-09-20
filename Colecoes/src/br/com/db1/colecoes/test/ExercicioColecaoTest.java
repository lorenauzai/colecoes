package br.com.db1.colecoes.test;

import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.db1.colecoe.ExercicioColecao;

public class ExercicioColecaoTest {

	private ExercicioColecao colecao;

	@Before
	public void iniciar() {
		colecao = new ExercicioColecao();
	}

	@Test
	public void getVogaiTest() {
		Set<String> vogais = colecao.getVogais("Fusca");
		Assert.assertTrue(vogais.size() == 2);
		Assert.assertFalse(vogais.contains("F"));
		Assert.assertTrue(vogais.contains("u"));
		Assert.assertFalse(vogais.contains("s"));
		Assert.assertFalse(vogais.contains("c"));
		Assert.assertTrue(vogais.contains("a"));

	}

	@Test
	public void getConsoantesTest() {
		Set<String> consoantes = colecao.getConsoantes("Fusca");
		Assert.assertTrue(consoantes.size() == 3);
		Assert.assertTrue(consoantes.contains("f"));
		Assert.assertFalse(consoantes.contains("u"));
		Assert.assertTrue(consoantes.contains("s"));
		Assert.assertTrue(consoantes.contains("c"));
		Assert.assertFalse(consoantes.contains("a"));

	}

	@Test
	public void removerTeceiraPoicaoTest() {
		List<Integer> posicao = colecao.removerTerceiraPosicao(2);
		Assert.assertTrue(posicao.size() == 9);
	}

	@Test
	public void multiplosDeTresTest() {
		List<Integer> posicoes = colecao.multiplosDeTres(3);
		Assert.assertTrue(posicoes.contains(5));
		Assert.assertTrue(posicoes.contains(8));
	}

	@Test
	public void multiplosDeDoisTest() {
		List<Integer> valores = colecao.multiplosDeDois(2);
		Assert.assertTrue(valores.contains(4));
		Assert.assertTrue(valores.contains(6));
		Assert.assertTrue(valores.contains(8));
		Assert.assertTrue(valores.contains(10));
	}

	@Test
	public void copiarValoresTest() {
		Set<String> valores = colecao.copiarValores();	
			Assert.assertTrue(valores.contains("banana"));
			Assert.assertTrue(valores.contains("maca"));
			Assert.assertTrue(valores.contains("pera"));
			Assert.assertTrue(valores.contains("jabuticaba"));
			Assert.assertTrue(valores.contains("ameixa"));
			Assert.assertTrue(valores.contains("uva"));
			Assert.assertTrue(valores.contains("laranja"));
			Assert.assertTrue(valores.contains("limão"));
			Assert.assertTrue(valores.contains("tomate"));
			Assert.assertTrue(valores.contains("melancia"));
	}

	@Test
	public void compararDuasListTest() {
		List<String> valores = colecao.compararDuasList();
		List<String> valoresComparacao = colecao.compararDuasList2();
		Assert.assertTrue(valores.equals(valoresComparacao));
	}
	
	@Test
	public void compararDoisSetTest() {
		Set<String> listaSet1 = colecao.compararDoisSet();
		Set<String> listaSet2 = colecao.compararDoisSet2();
		Assert.assertTrue(listaSet1.equals(listaSet2));
	}
	
	

}
