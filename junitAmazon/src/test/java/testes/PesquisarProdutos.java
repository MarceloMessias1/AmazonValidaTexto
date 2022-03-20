package testes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import elementos.ElementosWeb;
import metodos.MetodosDeTestes;

public class PesquisarProdutos {

	MetodosDeTestes metodos = new MetodosDeTestes();
	ElementosWeb elementos = new ElementosWeb();

	@Before
	public void setUp() throws Exception {
		metodos.abriNavegador("Chrome");

	}

	@After
	public void tearDown() throws Exception {
		metodos.fecharNavegador();

	}

	@Test
	public void testPesquisarProduto() {
		metodos.escrever(elementos.pesquisar, "notebook");
		metodos.clicar(elementos.lupaPesquisa);
		metodos.checkbox(elementos.checkbox);
		String validaText = metodos.validaTexto(elementos.validaTexto);
		System.out.println(validaText);
		assertEquals(validaText, "Aproveite a Semana do Consumidor Dell");

	}

}
