package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		//caminho das features
		features = "src/test/resources/feature/",
		//caminho dos steps
		glue = "tests",
		//tag para indicar qual teste será executado
		tags = "@executa and not @nExecuta",
		//pretty para deixar o console igual a execução do cucumber | html para gerar evidencia 
		plugin = { "pretty", "html:target/report.html" },
		//não executar o teste, validar se foi incluso algum novo bdd,
		//FALSE
		dryRun = false,
		monochrome = true
		
		
		
		
		
		
		)

public class Executa {

}
