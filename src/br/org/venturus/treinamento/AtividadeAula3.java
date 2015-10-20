package br.org.venturus.treinamento;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AtividadeAula3 {
	public static void main(String[] args) {
		executarExercicio1();
		executarExercicio2();
		executarExercicio3();
	}

	private static void executarExercicio1() {
		WebDriver driver = abrirFirefoxMaximizado();

		abrirPagina(driver, "http://bit.ly/1PCqsds");

		imprimirTituloDaPagina(driver);

		imprimirUrlDaPagina(driver);

		ObterCodigoDaPagina(driver);

		fecharFirefox(driver);
	}

	private static void executarExercicio2() {
		WebDriver driver = abrirFirefoxMaximizado();

		abrirPagina(driver, "http://bit.ly/1PCqsds");

		driver.findElement(
				By.partialLinkText("Venturus | Centro de Inovação Tecnológica"))
				.click();
		
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}

		fecharFirefox(driver);
	}

	private static void executarExercicio3() {
		WebDriver driver = abrirFirefoxMaximizado();

		abrirPagina(driver, "http://bit.ly/1PCqsds");

		imprimirTituloDaPagina(driver);

		driver.findElement(
				By.partialLinkText("Venturus | Centro de Inovação Tecnológica"))
				.click();

		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());

		fecharFirefox(driver);
	}

	private static WebDriver abrirFirefoxMaximizado() {
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		return driver;
	}

	private static void abrirPagina(WebDriver driver, String endereco) {
		driver.get(endereco);
	}

	private static void fecharFirefox(WebDriver driver) {
		driver.quit();
	}

	private static void ObterCodigoDaPagina(WebDriver driver) {
		System.out.println(driver.getPageSource().toString());
	}

	private static void imprimirUrlDaPagina(WebDriver driver) {
		System.out.println(driver.getCurrentUrl());
	}

	private static void imprimirTituloDaPagina(WebDriver driver) {
		System.out.println(driver.getTitle());
	}

}
