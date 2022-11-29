package pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class PageDemo extends PageObject {
    By botonHome = By.cssSelector("a[ui-sref='app.home']");
    By botonRegistro = By.cssSelector("a[ui-sref='app.register']");
    By botonLogin = By.cssSelector("a[ui-sref='app.login']");
    By botonNewArticle = By.cssSelector("a[ui-sref='app.editor']");
    By botonRegistrarse = By.xpath("//button[@class='btn btn-lg btn-primary pull-xs-right ng-binding']");
    By botonLogueo = By.xpath("//button[@class='btn btn-lg btn-primary pull-xs-right ng-binding']");
    By botonPublish = By.xpath("//button[@class='btn btn-lg pull-xs-right btn-primary']");
    By textoPerfil = By.xpath("//img[@class='user-pic']");

    By textoTitulo = By.xpath("//h1[@class='ng-binding']");
    By inputUsername = By.xpath("//input[contains(@placeholder, 'Username')]");
    By inputEmail= By.xpath("//input[contains(@placeholder, 'Email')]");
    By inputPassword= By.xpath("//input[contains(@placeholder, 'Password')]");
    By inputArticleTitle = By.xpath("//input[contains(@placeholder, 'Article Title')]");
   // By inputAbout = By.xpath("//input[contains(@placeholder, 'What\'s this article about?')]");
    By inputAbout = By.xpath("/html/body/div/div/div/div/div/div/form/fieldset/fieldset[2]/input");
    By inputArticle = By.xpath("//textarea[contains(@placeholder, 'Write your article (in markdown)')]");

    public By getInputUsername() {
        return inputUsername;
    }

    public By getInputEmail() {
        return inputEmail;
    }

    public By getInputPassword() {
        return inputPassword;
    }

    public By getBotonRegistro() {
        return botonRegistro;
    }

    public By getBotonRegistrarse() {
        return botonRegistrarse;
    }

    public By getBotonLogin() {
        return botonLogin;
    }

    public By getBotonLogueo() {
        return botonLogueo;
    }

    public By getBotonNewArticle() {
        return botonNewArticle;
    }

    public By getTextoPerfil() {
        return textoPerfil;
    }

    public By getInputArticleTitle() {
        return inputArticleTitle;
    }

    public By getInputAbout() {
        return inputAbout;
    }

    public By getInputArticle() {
        return inputArticle;
    }

    public By getBotonPublish() {
        return botonPublish;
    }

    public By getBotonHome() {
        return botonHome;
    }

    public By getTextoTitulo() {
        return textoTitulo;
    }
}
