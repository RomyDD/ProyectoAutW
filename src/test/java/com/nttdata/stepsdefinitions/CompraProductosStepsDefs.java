
package com.nttdata.stepsdefinitions;

import com.nttdata.steps.CompraProductosSteps;
import com.nttdata.support.ScreenshotAttacher;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;

import com.nttdata.driver.AppCapabilities;
import com.nttdata.driver.AppiumDriverManager;

import static org.junit.Assert.assertTrue;

public class CompraProductosStepsDefs {

    private final CompraProductosSteps compraProductosSteps = new CompraProductosSteps();

    @When("agrego {int} del siguiente producto {string}")
    public void agregarProducto(int unidades, String nombreProducto) {
        compraProductosSteps.seleccionarProducto(nombreProducto);

        if (unidades == 2) {
            compraProductosSteps.aumentarCantidad();
        }

        compraProductosSteps.agregarAlCarrito();
        compraProductosSteps.volverALaGaleria();

    }

    @Given("estoy en la aplicación de SauceLabs")
    public void estoyEnLaAplicacion() {
        AppCapabilities configuracion = AppCapabilities.from("carrito.properties");
        AppiumDriverManager.getInstance().startApp(configuracion);
    }

    @And("valido que carguen correctamente los productos en la galería")
    public void validarGaleria() {
        assertTrue(
                "No se encontro la galeria de productos: el acceso a la galeria de productos no fue exitoso",
                compraProductosSteps.estaEnGaleriaExitoso()
        );
    }
    @Then("valido el carrito de compra actualice correctamente")
    public void validarCarrito() {
        compraProductosSteps.verCarrito();
        compraProductosSteps.volverALaGaleria();
    }

}
