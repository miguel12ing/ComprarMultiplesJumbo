@CompraMultipleJumbo
Feature: Comprar productos en tiendas virtuales jumbo
  As
  comprar productos por categoria

  @CompraProductosjumbo
  Scenario: compras jumbo
    Given que me encuentro en el sitio de jumbo
    When seleciono productos por categorias
    Then realizo la compra
    And  valido compras contra el carrito