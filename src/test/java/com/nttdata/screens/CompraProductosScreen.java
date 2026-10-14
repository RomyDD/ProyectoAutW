
package com.nttdata.screens;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
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
    public void volverALaGaleria() {
        driver().navigate().back();
    }
}
