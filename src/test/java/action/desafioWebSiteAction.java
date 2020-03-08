package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class desafioWebSiteAction {

	public WebDriver driver;

	public void acessarSite(WebDriver driver) {

	}

	public boolean validaPagina(WebDriver driver) throws InterruptedException {
		boolean validado = false;
		driver.manage().window().maximize();
		driver.get("https://www.inmetrics.com.br");
		if (driver.getTitle().contains("Home - Inmetrics")) {
			validado = true;
			System.out.println("Usuario na pagina correta");
		} else {
			System.out.println("Pagina incorreta");
		}
		return validado;
	}

	public void navegaPagina(WebDriver driver) throws Exception {
		try {
			driver.findElement(By.id("linkcarreiras")).click();
		} catch (Exception e) {
			throw new Exception("Erro ao navegar pela página");
		}
	}

	public void acessaCarreiras(WebDriver driver) throws Exception {
		Thread.sleep(5000);
		try {
			driver.findElement(By.linkText("confira nossas vagas")).click();
		} catch (Exception e) {
			throw new Exception("Erro ao abrir a página de carreiras");
		}
	}
}
