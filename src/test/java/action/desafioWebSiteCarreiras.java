package action;

import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class desafioWebSiteCarreiras {

	public WebDriver driver;
	Random random = new Random();

	public boolean validaPagina(WebDriver driver) throws InterruptedException {
		boolean validado = false;
		if (driver.getTitle().equals("Inmetrics")) {
			validado = true;
			System.out.println("Usuario na pagina correta");
		} else {
			System.out.println("Pagina incorreta");	
		}
		return validado;

	}
	
	public void acessaVagas(WebDriver driver) throws Exception {
		try {
			driver.findElement(By.id("menu-jobs")).click();
		} catch (Exception e) {
			throw new Exception("Botão não localizado");
		}
	}
	
	public void selecionaVaga(WebDriver driver) throws Exception {
		Thread.sleep(5000);
		try {
			Select listaTipoVaga = new Select(driver.findElement(By.id("filter-type")));
			listaTipoVaga.selectByIndex(random.nextInt(3));
		} catch (Exception e) {
			throw new Exception("Erro ao escolher uma vaga");
		}
	}

	public void selecionaLocal(WebDriver driver) throws Exception {
		try {
			Select listaLocal = new Select(driver.findElement(By.id("filter-workplace")));
			listaLocal.selectByIndex(random.nextInt(5));

		} catch (Exception e) {
			throw new Exception("Erro ao selecionar o local de Trabalho");
		}
	}
	
	public void selecionaArea(WebDriver driver) throws Exception {
		try {
			Select listaArea = new Select(driver.findElement(By.id("filter-department")));
			listaArea.selectByIndex(random.nextInt(14));
		} catch (Exception e) {
			throw new Exception("Erro ao selecionar o local de Trabalho");
		}
	}

}

