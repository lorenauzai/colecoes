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
	public void iniciar(){
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
	public void removerTeceiraPoicaoTest(){
		List<Integer> posicao = colecao.removerTerceiraPosicao(2);
		Assert.assertTrue(posicao.size() == 9);
	}
	
	@Test
	public void multiplosDeTres() {
		List<Integer> posicoes = colecao.multiplosDeTres(3);
		Assert.assertTrue();
	}
	
	
	
	
}
