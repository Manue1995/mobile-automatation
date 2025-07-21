Feature: Flujo de Compra de Producto

  Background: Añadir Producto y Comprar

    Given que el usuario abre la aplicación
    When el usuario ingresa credenciales validas

  @Test1
  Scenario: 1 - Añadir producto

    When el usuario selecciona un producto y lo agrega al carrito
    Then se debe visualizar el producto en el carrito

  @Test2
  Scenario: 2 - Compra exitosa de un producto

    When el usuario selecciona un producto y lo agrega al carrito
    And  completa los campos de nombre y dirección
    And  completa el metodo de pago
    Then debería visualizar un mensaje de confirmación de compra exitosa

  @Test3
  Scenario: 3 - Compra exitos por 3 clientes

    When el usuario realiza el proceso de compra varias veces
    Then debería visualizar un mensaje de confirmación de compra exitosa

