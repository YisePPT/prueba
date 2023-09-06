package stepDefinition;

import PageObjects.GenerarUtilidades;
import PageObjects.Setup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class BuscarVuelo {

    WebDriver robot01;
    Setup buscarVuelo;

    GenerarUtilidades generarutilidades = new GenerarUtilidades();

    @Given("el usuario esta en la pagina de latam {string}")
    public void elUsuarioEstaEnLaPaginaDeLatam(String link) {
        // Write code here that turns the phrase above into concrete actions
        generarutilidades.setupHook();
        robot01 = generarutilidades.driver;
        buscarVuelo= new Setup(robot01);
        robot01.get(link);
//robot01.manage().window().maximize();
    }
    @Given("diligenca campos {string}, {string}, {string}, {string}")
    public void diligencaCampos(String string, String string2, String string3, String string4) {
        buscarVuelo.fitrosVuelos();
    }
    @When("selecciona boton {string}")
    public void seleccionaBoton(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("se visualiaza la información de vuelos disponibles para las fechas especificadas")
    public void seVisualiazaLaInformaciónDeVuelosDisponiblesParaLasFechasEspecificadas() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
