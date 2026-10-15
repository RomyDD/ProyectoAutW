
package com.nttdata.steps;

import com.nttdata.screens.CompraProductosScreen;

public class CompraProductosSteps {

    private final CompraProductosScreen screen = new CompraProductosScreen();


    public void seleccionarProducto(String nombreProducto) {
        System.out.println("[CompraProductosSteps] seleccionarProducto -> " + nombreProducto);
        screen.seleccionarProducto(nombreProducto);
    }

    public void aumentarCantidad() {
        System.out.println("[CompraProductosSteps] aumentarCantidad");
        screen.aumentarCantidad();
    }

    public void agregarAlCarrito() {
        System.out.println("[CompraProductosSteps] agregarAlCarrito");
        screen.agregarAlCarrito();
    }

    public void verCarrito() {
        System.out.println("[CompraProductosSteps] ver Carrito");
        screen.verCarrito();
    }
    public void volverALaGaleria() {
        screen.volverALaGaleria();
    }

    public boolean estaEnGaleriaExitoso() {
        System.out.println("[SauceLabsLoginSteps] loginFueExitoso: validando resultado...");
        return screen.estaEnGaleriaDeProductos();
    }
}
