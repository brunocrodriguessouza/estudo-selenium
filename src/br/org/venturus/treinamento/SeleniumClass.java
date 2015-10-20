package br.org.venturus.treinamento;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumClass {

	public static void main(String[] args) {
		WebDriver driver;

		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.extra.com.br");

		driver.findElement(By.id("lnkCadastreSe")).click();

		WebElement rbNaoCadastrado = driver.findElement(By
				.id(("rbNaoCadastrado")));
		rbNaoCadastrado.click();

		WebElement btnClienteLogin = driver.findElement(By
				.id(("btnClienteLogin")));
		btnClienteLogin.click();
		
		WebElement txtNomeCompleto = driver.findElement(By.id(("NomeCompleto")));
		txtNomeCompleto.sendKeys("Afonso Dolorido da Costa");
		
		WebElement txtCpf = driver.findElement(By.id(("Cpf")));
		txtCpf.sendKeys("02145142185");
		
		WebElement telefone1 = driver.findElement(By.id(("TipoFone1")));
		Select comboTelefone1 = new Select(telefone1);
		comboTelefone1.selectByVisibleText("Residencial");
		
		WebElement telefone1DDDPF = driver.findElement(By.id(("Telefone1DDDPF")));
		telefone1DDDPF.sendKeys("19");
		
		WebElement telefone1PF = driver.findElement(By.id(("Telefone1PF")));
		telefone1PF.sendKeys("32219526");
		
		WebElement telefone2 = driver.findElement(By.id(("TipoFone2")));
		Select comboTelefone2 = new Select(telefone2);
		comboTelefone2.selectByVisibleText("Celular");
		
		WebElement telefone2DDDPF = driver.findElement(By.id(("Telefone2DDDPF")));
		telefone2DDDPF.sendKeys("19");
		
		WebElement telefone2PF = driver.findElement(By.id(("Telefone2PF")));
		telefone2PF.sendKeys("993376169");
		
		
		WebElement dataNascimentoDia = driver.findElement(By.id(("DataNascimentoDia")));
		dataNascimentoDia.sendKeys("08");
		
		WebElement dataNascimentoMes = driver.findElement(By.id(("DataNascimentoMes")));
		dataNascimentoMes.sendKeys("08");
		
		WebElement dataNascimentoAno = driver.findElement(By.id(("DataNascimentoAno")));
		dataNascimentoAno.sendKeys("1984");
		
		WebElement listSexo = driver.findElement(By
				.cssSelector(".sexM"));
		
		listSexo.click();
		
//		Select rbMasculino = new Select(listSexo);
//		rbMasculino.selectByVisibleText("Masculino");
		
//		
//		for (WebElement webElement : listSexo) {
//			if(webElement.getAttribute("value").equals("M")){
//				Select rbMasculino = new Select(webElement);
//			}
//		}
		
		
//		rbMasculino.selectByVisibleText("Celular");
		
		
		
		
		
		
		
		
		
		
//		02145142185
		
//		driver.close();
	}

}
