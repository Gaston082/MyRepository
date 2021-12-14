Feature: Probar la funcionalidad de google

Scenario: Buscar algo en google
    Given navego en google
    When busco algo
    And clickear en buscar
    Then tengo resultado

    