package Runners;


import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;

@CucumberOptions(features = {"src/test/resources/features/"},
snippets= SnippetType.CAMELCASE,
tags = "@Regresion",
glue = {"Definitions"})
@RunWith(CucumberWithSerenity.class)
public class CrearUsuarioRunner {
 
}