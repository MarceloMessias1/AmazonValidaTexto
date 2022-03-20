package metodos;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import elementos.ElementosWeb;

public class MetodosDeTestes {

	WebDriver driver;

	/**
	 * Metodo para abrir o Navegador Chrome ou Firefox driver dos navegadores estão
	 * no projeto
	 * 
	 * @autor Marcelo Messias
	 * @param navegador
	 */

	public void abriNavegador(String navegador) {

		if (navegador.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();

		} else if (navegador.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			driver = new FirefoxDriver();

		} else {

			System.err.println("Opção indisponível digitar Chrome ou Firefox");
		}

		driver.manage().window().maximize();

		driver.get("https://www.amazon.com.br");
	}

	/**
	 * Metodo para escrever uma string
	 * 
	 * @author Marcelo Messias
	 * @param elemento
	 * @param texto
	 */

	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);

	}

	/**
	 * Metodo para clicar em um elemento usando a class By
	 * 
	 * @author Marcelo Messias
	 * 
	 * @param elemento
	 * @param click
	 */
	public void clicar(By elemento) {
		driver.findElement(elemento).click();
	}

	public void checkbox(By elemento) {
		driver.findElement(elemento).click();

	}

	public String validaTexto(By elemento) {
		return driver.findElement(elemento).getText();
	}

	public void fecharNavegador() {
		driver.quit();

	}

}