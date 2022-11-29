package stepsdefinitions;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import Steps.DemoSteps;
import org.junit.Assert;

public class IngresoStepDefinitions {

    @Steps
    DemoSteps demoSteps;

    @Dado("el usuario ingresa al navegador y abre la pagina demo")
    public void elUsuarioIngresaAlNavegadorYAbreLaPaginaDemo() {
        demoSteps.abrirNavegador();
    }
    @Entonces("el usuario da clic en el boton Sign up de la esquina superior derecha")
    public void elUsuarioDaClicEnElBotonSignUpDeLaEsquinaSuperiorDerecha() {
        demoSteps.seleccionarSignUp();
    }
    @Y("diligencia los campos de registro")
    public void diligenciaLosCamposDeRegistro() {
        demoSteps.digitarUsername();
        demoSteps.digitarEmail();
        demoSteps.digitarPassword();
    }
    @Y("da clic en el boton Sign up")
    public void daClicEnElBotonSignUp() {
        demoSteps.seleccionarRegistrase();
    }

    @Entonces("el usuario se loguea")
    public void elUsuarioSeLoguea() {
        demoSteps.seleccionarLogin();
    }
    @Y("diligencia los campos de login")
    public void diligenciaLosCamposDeLogin() {
        demoSteps.digitarEmail();
        demoSteps.digitarPassword();
        demoSteps.seleccionarLogueo();
    }

    @Entonces("da clic en New article")
    public void daClicEnNewArticle() throws InterruptedException {
        demoSteps.validarUsername();
        demoSteps.seleccionarNewArticle();
    }
    @Y("diligencia los campos del articulo")
    public void diligenciaLosCamposDelArticulo() {
        demoSteps.digitarTitle();
        demoSteps.digitarAbout();
        demoSteps.digitarArticle();
    }

    @Y("da clic en Publish Article")
    public void daClicEnPublishArticle() {
        demoSteps.seleccionarPublish();
    }
    @Entonces("se valida la creacion del articulo")
    public void seValidaLaCreacionDelArticulo() throws InterruptedException {
        demoSteps.seleccionarHome();
        demoSteps.validarArticle();
        Thread.sleep(3000);
    }
}
