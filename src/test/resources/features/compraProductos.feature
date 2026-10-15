
# language: es
Característica: Validación del carrito de compras

  @CompraProductosCarrito
  Esquema del escenario: Agregar producto al carrito
    Dado estoy en la aplicación de SauceLabs
    Y valido que carguen correctamente los productos en la galería
    Cuando agrego <UNIDADES> del siguiente producto "<PRODUCTO>"
    Entonces valido el carrito de compra actualice correctamente
    #Y cierro el aplicativo "saucelabs"
    Ejemplos:
      | PRODUCTO                 | UNIDADES |
      | Sauce Labs Backpack      | 1        |
      | Sauce Labs Bolt T-Shirt  | 1        |
      | Sauce Labs Fleece Jacket | 2        |
 #     | Sauce Labs Bike Light    | 2        | En apk Este producto tiene error al ingresar
