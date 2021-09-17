package Pages;

import static org.junit.Assert.assertThat;

import java.util.List;

import org.hamcrest.CoreMatchers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://automationpractice.com/index.php")
public class CrearUsuarioPage extends PageObject
{

	@FindBy(xpath="//*[@id='header']/div[2]/div/div/nav/div[1]/a")
	public WebElement BTNREGISTRARSE;
	
	@FindBy(id="email_create")
	public WebElement TXTMAIL;
		
	@FindBy(id="SubmitCreate")
	public WebElement BTNCREARCUENTA;
	
	@FindBy(id="id_gender2")
	public WebElement CHMRS;
		
	@FindBy(id="customer_firstname")
	public WebElement TXTPRIMERNOMBRECUSTOM;
		
	@FindBy(id="customer_lastname")
	public WebElement TXTSEGUNDONOMBRECUSTOM;
	
	@FindBy(id="passwd")
	public WebElement TXTCLAVE;	
	
	@FindBy(id="days")
	public WebElement SLTNACIMIENTODIA;
		
	@FindBy(id="months")
	public WebElement SLTNACIMIENTOMES;
		
	@FindBy(id="years")
	public WebElement SLTNACIMIENTOAÑO;
	
	@FindBy(id="firstname")
	public WebElement TXTNOMBRES;
		
	@FindBy(id="lastname")
	public WebElement TXTAPELLIDOS;
		
	@FindBy(id="company")
	public WebElement TXTCOMPAÑIA;
		
	@FindBy(id="address1")
	public WebElement TXTDIRECCION;
	
	@FindBy(id="city")
	public WebElement TXTCIUDAD;
		
	@FindBy(id="id_state")
	public WebElement SLTESTADO;
		
	@FindBy(id="postcode")
	public WebElement TXTCODIGOPOSTAL;
		
	@FindBy(id="other")
	public WebElement ATXTINFORMACIONADICIONAL;
			
	@FindBy(id="phone_mobile")
	public WebElement TXTCELULAR;	
	
	@FindBy(id="submitAccount")
	public WebElement BTNFINALIZARCREARCUENTA;
	
	@FindBy(xpath="//*[@id='header']/div[2]/div/div/nav/div[1]/a/span")
	public WebElement LBLNOMBRE;	
	
	@FindBy(xpath="//div[@id='create_account_error']")
	public WebElement LBLUSUARIOEXISTE;	
	
	
	public void ingresarMail(List<String> arg1) {		
    	BTNREGISTRARSE.click();
    	TXTMAIL.sendKeys(arg1.get(0));
    	BTNCREARCUENTA.click();
	}
	
	public void llenarFormulario(List<String> arg1) {
		CHMRS.click();
		
		TXTPRIMERNOMBRECUSTOM.sendKeys(arg1.get(1));
		TXTSEGUNDONOMBRECUSTOM.sendKeys(arg1.get(2));
		TXTCLAVE.sendKeys(arg1.get(3));
		 Select lista = new Select(SLTNACIMIENTODIA);
		 lista.selectByValue(arg1.get(4));
		 lista = new Select(SLTNACIMIENTOMES);
		 lista.selectByValue(arg1.get(5));
		 lista = new Select(SLTNACIMIENTOAÑO);
		 lista.selectByValue(arg1.get(6));
		 Serenity.takeScreenshot();
		 TXTNOMBRES.sendKeys(arg1.get(1));
		 TXTAPELLIDOS.sendKeys(arg1.get(2));
		 TXTCOMPAÑIA.sendKeys(arg1.get(7));
		 TXTDIRECCION.sendKeys(arg1.get(8));
		 TXTCIUDAD.sendKeys(arg1.get(9));
		 lista = new Select(SLTESTADO);
		 lista.selectByValue(arg1.get(10));
		 Serenity.takeScreenshot();
		 
		 TXTCODIGOPOSTAL.sendKeys(arg1.get(11));
		 ATXTINFORMACIONADICIONAL.sendKeys(arg1.get(12));
		 TXTCELULAR.sendKeys(arg1.get(13));
		 
		 Serenity.takeScreenshot();
    	BTNFINALIZARCREARCUENTA.click();
	}
	
	public void verificarResultado(List<String> arg1) {		
		String NombreSesion = LBLNOMBRE.getText();
		String NombreCompleto=arg1.get(0)+" "+arg1.get(1);		
		 assertThat(NombreSesion, CoreMatchers.containsString(NombreCompleto)); 
	}
	
	public void ingresarMailExiste(String arg1) {		
    	BTNREGISTRARSE.click();
    	TXTMAIL.sendKeys(arg1);
    	BTNCREARCUENTA.click();
	}
	
	
	public void verificarResultadoMail(String arg1) {		
		String MensajeError = LBLUSUARIOEXISTE.getText();
		 assertThat(MensajeError.trim(), CoreMatchers.containsString(arg1.trim())); 
	}
	
	
	
}
