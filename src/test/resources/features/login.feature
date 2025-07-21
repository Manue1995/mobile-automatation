Feature: Validación de Login

  Background: Validar inicio de sesion con credenciales validas e invalidas

    Given que el usuario abre la aplicación

  @Test1
  Scenario: 1 - Login exitoso

    When el usuario ingresa credenciales validas
    Then debería ver el mensaje "Products"


  @Test2
  Scenario: 2 - Intento de login con Usuario Bloqueado

    When ingresa "UsuarioBloqueado" y "contraseña"
    Then debería ver el mensaje "Locked Out"

