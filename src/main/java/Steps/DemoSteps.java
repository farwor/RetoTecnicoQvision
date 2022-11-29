package Steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import pageObject.PageDemo;
import utils.Article;
import utils.LeerExcel;
import utils.Login;

import java.util.List;

public class DemoSteps {

    private String url = "https://demo.realworld.io/#/";
    PageDemo pageDemo = new PageDemo();
    LeerExcel leerExcel = new LeerExcel();
    List<Login> loginList = leerExcel.obtenerLogin();
    List<Article> articleList = leerExcel.obtenerArticle();

    @Step
    public void abrirNavegador() {
        pageDemo.openUrl(url);
    }

    @Step
    public void seleccionarSignUp() {
        pageDemo.getDriver().findElement(pageDemo.getBotonRegistro()).click();
    }

    @Step
    public void digitarUsername() {
        pageDemo.getDriver().findElement(pageDemo.getInputUsername()).sendKeys(loginList.get(0).getUsername());
    }

    @Step
    public void digitarEmail() {
        pageDemo.getDriver().findElement(pageDemo.getInputEmail()).sendKeys(loginList.get(0).getEmail());
    }

    @Step
    public void digitarPassword() {
        pageDemo.getDriver().findElement(pageDemo.getInputPassword()).sendKeys(loginList.get(0).getPassword());
    }

    @Step
    public void seleccionarRegistrase() {
        pageDemo.getDriver().findElement(pageDemo.getBotonRegistrarse()).click();
    }

    @Step
    public void seleccionarLogin() {
        pageDemo.getDriver().findElement(pageDemo.getBotonLogin()).click();
    }
    @Step
    public void seleccionarLogueo() {
        pageDemo.getDriver().findElement(pageDemo.getBotonLogueo()).click();
    }
    @Step
    public void validarUsername() throws InterruptedException {
        // Validacion del nombre de usuario
        String userName = "michaelFer";
        Thread.sleep(3000);
        Assert.assertTrue(pageDemo.getDriver().findElement(pageDemo.getTextoPerfil()).isDisplayed());
    }

    @Step
    public void seleccionarNewArticle() {
        pageDemo.getDriver().findElement(pageDemo.getBotonNewArticle()).click();
    }
    @Step
    public void digitarTitle() {
        pageDemo.getDriver().findElement(pageDemo.getInputArticleTitle()).sendKeys(articleList.get(0).getTitle());
    }

    @Step
    public void digitarAbout() {
        pageDemo.getDriver().findElement(pageDemo.getInputAbout()).sendKeys(articleList.get(0).getAbout());
    }

    @Step
    public void digitarArticle() {
        pageDemo.getDriver().findElement(pageDemo.getInputArticle()).sendKeys(articleList.get(0).getArticle());
    }
    @Step
    public void seleccionarPublish() {
        pageDemo.getDriver().findElement(pageDemo.getBotonPublish()).click();
    }

    @Step
    public void seleccionarHome() {
        pageDemo.getDriver().findElement(pageDemo.getBotonHome()).click();
    }

    @Step
    public void validarArticle() {
        // Validacion del articulo creado
        String title = "Lorem Ipsum Title";
        Assert.assertEquals(title,pageDemo.getDriver().findElement(pageDemo.getTextoTitulo()).getText());
    }
}
