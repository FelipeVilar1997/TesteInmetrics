Selenium WebDriver + Cucumber JVM + Page Object + BDD
=================

Desafio Web proposto pela Inmetrics
Para iniciar, foi necessário a instalação das bibliotecas JAVA JDK e JRE e uma IDE(eclipse)

Foi criado um projeto do tipo Maven e adicionado as seguintes dependencias no arquivo pom, referente ao Cucumber, Junit e Selenium WebDrive.
```xml
	<dependencies>
		<dependency>
			<groupId>info.cukes</groupId>
			<artifactId>cucumber-java</artifactId>
			<version>1.2.0</version>
			<scope>test</scope>
		</dependency>

		<dependency>
			<groupId>info.cukes</groupId>
			<artifactId>cucumber-junit</artifactId>
			<version>1.2.0</version>
		</dependency>

		<dependency>
			<groupId>junit</groupId>
			<artifactId>junit</artifactId>
			<version>4.12</version>
			<scope>test</scope>
		</dependency>

		<dependency>
			<groupId>org.seleniumhq.selenium</groupId>
			<artifactId>selenium-java</artifactId>
			<version>4.0.0-alpha-1</version>
		</dependency>
```
Foram implementados os métodos

### Feature 
Contendo os cenários e casos de testes escritos em BDD

### Steps 
Implementação dos cenários de testes 

### Action 
Lógica da aplicação e validações 

### Main 
Contem a classe de Teste (Runner) do projeto

### Main/util
Contem o chromedriver que faz a comunicação com o Browser

Executar os testes
=================
Para execução dos testes, é necessário executar a o Runner "desafioWebsiteTest" na classe Main 
```
package main;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/", tags = "@ct01",  
		glue = {"steps"}, monochrome = true, dryRun = false)


public class desafioWebsiteTest {
	
}

