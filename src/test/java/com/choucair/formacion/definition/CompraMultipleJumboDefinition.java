package com.choucair.formacion.definition;

import com.choucair.formacion.steps.CompraMultipleJumboStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class CompraMultipleJumboDefinition {

    @Steps
    CompraMultipleJumboStep compraMultipleJumboStep;

    @Given("^que me encuentro en el sitio de jumbo$")
    public void que_me_encuentro_en_el_sitio_de_jumbo()  {

        compraMultipleJumboStep.abrirExplorador();
    }

    @When("^seleciono productos por categorias$")
    public void seleciono_productos_por_categorias() {

        compraMultipleJumboStep.configuracionDeUbicacion();
        compraMultipleJumboStep.seleccionDeProductosPorCategoria();
    }

    @Then("^realizo la compra$")
    public void realizo_la_compra()  {
    }

    @Then("^valido compras contra el carrito$")
    public void valido_compras_contra_el_carrito() {
    }

}
