
package com.nttdata.stepsdefinitions;

import com.nttdata.steps.CompraProductosSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;

import com.nttdata.driver.AppCapabilities;
import com.nttdata.driver.AppiumDriverManager;

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
        // Implementaremos la validación de la galería
        // en el siguiente paso.
    }



    @Then("valido el carrito de compra actualice correctamente")
    public void validarCarrito() {
        // Aquí implementaremos la validación del carrito.
    }

}
