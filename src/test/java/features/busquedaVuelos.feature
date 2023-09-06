Feature: inicio de sesión
  como cliente quiero ingresar a aplicación CEC

  Scenario: Busqueda de vuelos de ida y regreso exitoso
    Given el usuario esta en la pagina de latam "https://www.latamairlines.com/co/es"
    And diligenca campos "Ingresa origen", "Ingresa destino", "Ida fecha", "Vuelta fecha"
    When selecciona boton "Buscar"
    Then se visualiaza la información de vuelos disponibles para las fechas especificadas
