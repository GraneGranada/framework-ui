package pages;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.AssertionFailedError;

public class Metodos {

	WebDriver driver;

	public void abrirNavegador(String site, String passo) throws IOException {
		
		try {

		System.setProperty("webdriver.chrome.driver", "./Drivers./chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(site);
		driver.manage().window().maximize();
		}catch (Exception e) {
			Assert.fail(LocalDateTime.now() + "---erro ao tentar " + passo);
	        screenshotError(passo);
			
		}
	}

	private void screenshotError(String passo) {
		// TODO Auto-generated method stub
		
	}

	//try =tente fazer alguma coisa
	//catch = dado que não é possivel fazer caia na exceção 
	
	
	
	public void escrever(String texto, By elemento, String passo) throws IOException{
		
		try {
		
		driver.findElement(elemento).sendKeys(texto);
		
		}catch (Exception e) {
			System.out.println("--- error ao tentar executar o passo ---" + passo  + "" + LocalDateTime.now());
			screenShot("error/" + passo);
		}
		
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
		
		//teste 
	}
	public void screenShot(String nome) throws IOException {
		
        TakesScreenshot scrShot = ((TakesScreenshot) driver);		
		File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./src/evidencias/" +nome+ ".png" );
		FileUtils.copyFile(srcFile, destFile);
	}
	

}
