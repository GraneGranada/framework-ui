package pages;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos {

	WebDriver driver;

	public void abrirNavegador(String site) {

		System.setProperty("webdriver.chrome.driver", "./Drivers./chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(site);
		driver.manage().window().maximize();

	}

	
	public void escrever(String texto, By elemento) {
		
		driver.findElement(elemento).sendKeys(texto);
		
	}
	
	public void submit(By elemento) {
		
		driver.findElement(elemento).submit();
				
	}
	
	public void fecharNavegador() {

	driver.quit();

}
	public void validarTexto(String textoEsperado, By elemento)  {
		
		String texto = driver.findElement(By.xpath("//span[text()='" + textoEsperado + "']")).getText();
		assertEquals(textoEsperado, texto);
		
		//String texto = driver.findElement(elemento).getText();
		//assertEquals(textoEsperado, texto);
		
		
	}

}
