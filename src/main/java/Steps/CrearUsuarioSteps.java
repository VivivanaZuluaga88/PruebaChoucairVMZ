package Steps;

import java.util.List;
import Pages.CrearUsuarioPage;
import net.serenitybdd.core.pages.PageObject;

public class CrearUsuarioSteps extends PageObject {
    CrearUsuarioPage crearUsuarioPage;
    
	 public void abrirPagina()
	    {
		 crearUsuarioPage.open();
	    }
	 
	 public void crearUsuario(List<String> arg1)
	    {
		 crearUsuarioPage.ingresarMail(arg1);
		 crearUsuarioPage.llenarFormulario(arg1);
	    }
	 
	 
	 
	 public void verificarResultadoUsuario(List<String> arg1)
	    {
		 crearUsuarioPage.verificarResultado(arg1);
	    }
	 
	 
	 
	 public void IngresoMailParaElRegistro(String arg1)
	    {
		 crearUsuarioPage.ingresarMailExiste(arg1);
	    }
	 
	 
	 
	 public void verificarResultadoMailExiste(String arg1)
	    {
		 crearUsuarioPage.verificarResultadoMail(arg1);
	    }
}