package steps;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import action.desafioWebSiteAction;
import action.desafioWebSiteCarreiras;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class desafioWebSiteStep {

	public WebDriver driver;
	desafioWebSiteAction action = new desafioWebSiteAction();
	desafioWebSiteCarreiras carreiras = new desafioWebSiteCarreiras();

	@Before
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "src/main/java/util/chromeDriver/chromedriver.exe");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Dado("^que o usuario esteja no site da inmetrics$")
	public void que_o_usuario_esteja_no_site_da_inmetrics() throws Throwable {
		driver = new ChromeDriver();
		assertTrue(action.validaPagina(driver));

	}

	@Quando("^o usuario navegar pela pagina$")
	public void o_usuario_navegar_pela_pagina() throws Throwable {
		action.navegaPagina(driver);
	}

	@Quando("^clicar no botao confira nossas vagas$")
	public void clicar_no_botao_confira_nossas_vagas() throws Throwable {
		action.acessaCarreiras(driver);
	}

	@Entao("^ira apresentar as vagas disponiveis$")
	public void ira_apresentar_as_vagas_disponiveis() throws Throwable {
		assertTrue(carreiras.validaPagina(driver));
		carreiras.acessaVagas(driver);
		carreiras.selecionaVaga(driver);
		carreiras.selecionaLocal(driver);
		carreiras.selecionaLocal(driver);
	}

	@After
	public void exit() {
		driver.quit();
	}	
}
