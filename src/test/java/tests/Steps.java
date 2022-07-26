package tests;

import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Metodos;

public class Steps {

	Metodos metodos = new Metodos();
	Elementos el = new Elementos();

	/*
	 * @Given("que eu esteja no {string}") public void que_eu_esteja_no(String site)
	 * { metodos.abrirNavegador(site, "acessando o site.");
	 * 
	 * }
	 * 
	 * @When("pesquisar o nome da escola") public void pesquisar_o_nome_da_escola()
	 * {
	 * 
	 * metodos.escrever("E2e Treinamentos", el.getPesquisar());
	 * metodos.submit(el.getPesquisar());
	 * 
	 * }
	 * 
	 * @Then("valido as informacoes") public void valido_as_informacoes() {
	 * 
	 * metodos.fecharNavegador(); }
	 * 
	 * }
	 */

	@Given("que eu esteja no {string}")
	public void que_eu_esteja_no(String site) {
		
		metodos.abrirNavegador(site);
	}

	@When("pesquisar {string}")
	public void pesquisar(String texto) {
		
		metodos.escrever(texto, el.getPesquisar());
		metodos.submit(el.getPesquisar());
	}


	@Then("valido nome {string}")
	public void valido_nome(String textoEsperado) {
	   metodos.validarTexto(textoEsperado, el.getE2etreinamentos());
	   metodos.fecharNavegador();
	}
}