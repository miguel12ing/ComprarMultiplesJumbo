package com.choucair.formacion.steps;

import com.choucair.formacion.pageobjects.CompraMultipleJumboPage;
import net.thucydides.core.annotations.Step;


public class CompraMultipleJumboStep {
    CompraMultipleJumboPage compraMultipleJumboPage;

    @Step
    public void abrirExplorador() {

       compraMultipleJumboPage.open();

    }

    public void configuracionDeUbicacion() {

        //compraMultipleJumboPage.seleccionarMetodoDeEntrega();
        //compraMultipleJumboPage.escogerDepartamentoEntrega();
        //compraMultipleJumboPage.escogerCuidadEntrega();
        //compraMultipleJumboPage.seleccionarTiendaEntrega();
        //compraMultipleJumboPage.confirmarFormulario();


    }

    public void seleccionDeProductosPorCategoria() {
        compraMultipleJumboPage.seleccionarCategoria();
    }
}
