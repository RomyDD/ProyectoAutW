
package com.nttdata.screens;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.nttdata.screens.AppConfigScreen.getDriver;

public class CompraProductosScreen extends BaseScreen {

    // Localizadores
    private final By botonAgregar = By.id("com.saucelabs.mydemoapp.android:id/cartBt");
    private final By botonAumentarCantidad = By.id("com.saucelabs.mydemoapp.android:id/plusIV");

    private final By tituloCarrito = By.id("com.saucelabs.mydemoapp.android:id/productTV");

    private final By botonCarrito = By.id("com.saucelabs.mydemoapp.android:id/cartIV");


    public void seleccionarProducto(String nombreProducto) {
        By producto = By.xpath("//android.widget.ImageView[@content-desc='" + nombreProducto + "']");
        waitForVisible(producto).click();
    }

    public void aumentarCantidad() {
        waitForVisible(botonAumentarCantidad).click();
    }

    public void agregarAlCarrito() {
        waitForVisible(botonAgregar).click();
    }

    public void verCarrito() {
        //waitForVisible(botonCarrito).click();

        System.out.println("Ingresando al carrito de compras");

        //By botonCarrito = By.id("com.saucelabs.mydemoapp.android:id/cartIV");

        waitForVisible(botonCarrito).click();
    }


    public void volverALaGaleria() {
        driver().navigate().back();
    }


    public boolean estaEnGaleriaDeProductos() {
        System.out.println("[SauceLabsLoginScreen] Validando que se llego a galeria de productos...");

        WebDriverWait wait = new WebDriverWait(driver(), TIMEOUT);

        WebElement titulo = wait.until(ExpectedConditions.presenceOfElementLocated(tituloCarrito));
        boolean visible = titulo.isDisplayed();

        System.out.println("[SauceLabsLoginScreen] Pantalla de galeria de productos visible: " + visible);
        return visible;
    }
}
