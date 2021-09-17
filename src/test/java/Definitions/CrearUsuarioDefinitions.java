package Definitions;


import java.util.List;
import Steps.CrearUsuarioSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;


public class CrearUsuarioDefinitions{
    @Steps
    CrearUsuarioSteps crearUsuarioSteps;



@Given("^ingreso en la web automationpractice$")
public void ingresoEnLaWebAutomationpractice() {
	crearUsuarioSteps.abrirPagina();
}

@When("^diligencio la informacion del registro$")
public void diligencioLaInformacionDelRegistro(List<String> arg1) {
	crearUsuarioSteps.crearUsuario(arg1);
}

@Then("^verifico el resultado de la creacion$")
public void verificoElResultadoDeLaCreacion(List<String> arg1) {
	crearUsuarioSteps.verificarResultadoUsuario(arg1);
}


@When("^ingreso mail para el registro \"([^\"]*)\"$")
public void ingresoMailParaElRegistro(String arg1) {
	crearUsuarioSteps.IngresoMailParaElRegistro(arg1);
}

@Then("^verifico el resultado \"([^\"]*)\"$")
public void verificoElResultado(String arg1) {
	crearUsuarioSteps.verificarResultadoMailExiste(arg1);
}



}

