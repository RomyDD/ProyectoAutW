
package com.nttdata.steps;

import com.nttdata.screens.CompraProductosScreen;

public class CompraProductosSteps {

    private final CompraProductosScreen screen =
            new CompraProductosScreen();

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

    public void volverALaGaleria() {
        screen.volverALaGaleria();
    }

}
