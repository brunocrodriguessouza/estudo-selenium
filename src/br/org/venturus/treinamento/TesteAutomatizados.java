package br.org.venturus.treinamento;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TesteAutomatizados {
	public static void main(String[] args) {
		String bla;
		// abre o firefox
		WebDriver driver  = new FirefoxDriver();
		
		//Acessa o site do google
		driver.get("http://www.google.com.br");
		
        WebElement query = driver.findElement(By.name("q"));
        query.sendKeys("Venturus");
		
		driver.close();
	}

}
