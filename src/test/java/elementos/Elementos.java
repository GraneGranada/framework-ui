package elementos;

import org.openqa.selenium.By;

public class Elementos {
	
	//elementos Web
	
	private By pesquisar = By.name("q");
	private By e2etreinamentos = By.xpath("//*[@id=\"_ckPgYozVLbW45OUP0ZGOwAk46\"]/div[1]/div[2]/div[1]/div/div[2]/h2/span");
    private By inovacao = By.xpath("//*[@id=\"_eEPgYsGRMYqM5OUPnaGmoAQ62\"]/div[2]/div/div/div/div[2]/h2/span");
    private By felicidade = By.xpath("//*[@id=\"_gEPgYof1CZ2V5OUPpaau2AQ116\"]/div[2]/div/div/div/div[2]/h2/span");
    
	//métodos publicos para acessar dos elementos
	
	public By getPesquisar() {
		return pesquisar;
	}

	public By getE2etreinamentos() {
		return e2etreinamentos;
	}

	public By getInovacao() {
		return inovacao;
	}

	public By getFelicidade() {
		return felicidade;
	}
	
	
	
	

}
