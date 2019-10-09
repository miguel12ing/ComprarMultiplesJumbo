package com.choucair.formacion.pageobjects;


import cucumber.api.java.cs.A;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

@DefaultUrl("https://www.tiendasjumbo.co/supermercado/despensa/")

public class CompraMultipleJumboPage extends PageObject {

   /* @FindBy (xpath = "//span[contains(text(),'CATEGORÍAS')]")
    WebElementFacade btnCategoria;

    @FindBy (xpath = "//body/div/div/div/ul/li[1]/span[1]/a[1]/span[1]")
    WebElementFacade catSupermercado;

    @FindBy (xpath = "//span[contains(text(),'Despensa')]")
    WebElementFacade catDespensa;

    @FindBy (css = "li.despensa li")
    List<WebElementFacade> allBtnCategorias;

    @FindBy (xpath = "(//button[@data-productid]//span[@class='product-add-to-cart__text'][contains(.,'Comprar')])[1]")
    WebElementFacade btnComprar;

    //@FindBy(xpath = "//p[@id='title-recoge-en-tienda']")
    //WebElementFacade btnRecogerEnTienda;

   // @FindBy(css = "div [class='delivery-method-cont-text'] span[style]")
    //WebElementFacade btnMetodoEntrega;

    @FindBy(xpath = "//div[@class='delivery-header-wrapper']//div[@class='setup-delivery-container']")
    WebElementFacade btnMetodoEntrega;

    @FindBy(css = "svg g#Recoge_en_tienda")
    WebElementFacade btnRecogerEnTienda;

    @FindBy(xpath = "//*[@id='select-department-container']/child::span")
    WebElementFacade contenedorDepartamento;

    @FindBy(xpath = "//span[@class='select2-results']//ul//li[text()='Antioquia']")
    WebElementFacade lisDepartamento;

    @FindBy(xpath = "//*[@id='select-city-container']/child::span")
    WebElementFacade contenedorCuidad;

    @FindBy(xpath = "//span[@class='select2-results']//ul//li[text()='Medellín']")
    WebElementFacade listCuidad;

    @FindBy(xpath = "//*[@id='select-recoge-en-tienda-container']/child::span")
    WebElementFacade contenedorTienda;

    @FindBy(xpath = "//span[@class='select2-results']//ul//li[text()='Tienda Las Vegas']")
    WebElementFacade listaTienda;

    @FindBy(xpath = "//button[@id='confirmation__store__selection']//span[contains(text(),'Confirmar')]")
    WebElementFacade clickEnConfirmar;




    public void seleccionarMetodoDeEntrega() {
        btnMetodoEntrega.click();
        waitFor(5).seconds();
        btnRecogerEnTienda.click();

    }

    public void escogerDepartamentoEntrega() {

        Actions actdepart = new Actions(getDriver());
        waitFor(contenedorDepartamento).waitUntilEnabled();
        actdepart.moveToElement(contenedorDepartamento).click().perform();
        actdepart.moveToElement(lisDepartamento).click().perform();

    }

    public void escogerCuidadEntrega() {

        Actions actCuidad = new Actions(getDriver());
        waitFor(contenedorCuidad).waitUntilEnabled();
        actCuidad.moveToElement(contenedorCuidad).click().perform();
        actCuidad.moveToElement(listCuidad).click().perform();

    }

    public void seleccionarTiendaEntrega() {
        Actions actTienda = new Actions(getDriver());
        waitFor(contenedorTienda).waitUntilEnabled();
        actTienda.moveToElement(contenedorTienda).click().perform();
        actTienda.moveToElement(listaTienda).click().perform();

    }

     public void confirmarFormulario(){
        clickEnConfirmar.click();
        waitFor(15).seconds();

    }

    public void seleccionarCategoria (){

        JavascriptExecutor js = (JavascriptExecutor) getDriver();

        List<WebElement> divs = getDriver().findElements(By.cssSelector("li.despensa li"));
        int allBtnsSelecionarCategoriaInit = divs.size();
        //int allBtnsSelecionarCategoriaInit = allBtnCategorias.size();
        System.out.println("==================" +allBtnsSelecionarCategoriaInit+"========================");
        for (int i = 13; i <= allBtnsSelecionarCategoriaInit; i++) {

            Actions act = new Actions(getDriver());
            act.moveToElement(btnCategoria).perform();
            act.moveToElement(catSupermercado).perform();
            act.moveToElement(catDespensa).perform();

           // if ( (i == 14) || (i == 15) || (i == 16)) {

              //  WebElement Element = getDriver().findElement(By.cssSelector("li.despensa li:nth-of-type(16) a"));
                //js.executeScript("window.scrollBy(0,50)");
                $("li.despensa li:nth-of-type("+i+") a").waitUntilClickable().click();
                waitFor(7).seconds();
                waitFor(btnComprar).isCurrentlyVisible();
                btnComprar.click();
                waitFor(5).seconds();

            //}*/
    @FindBy(xpath = "//h5[contains(text(),'Subcategorias')]")
    WebElementFacade btnsubCategorias;

    public void seleccionarCategoria (){
        Actions act = new Actions(getDriver());
        act.moveToElement(btnsubCategorias).click().perform();

        for (int i = 1; i <= 15; i++) {

            $("fieldset[class='open'] a:nth-of-type("+i+")").waitUntilClickable().click();
        }
        }
    }
//}


    //WebElement element = driver.findElement(By.xpath("//center/input[1]"));
