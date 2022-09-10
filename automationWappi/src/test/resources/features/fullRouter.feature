Feature: Complete route
  As AQ Automation
  I want to do the whole route
  To complete the requirements

  Background:

  Scenario Outline: Update profile

    Given enter the wappe official page
    And login with username and password
      | user           | password      |
      | elhackerman    | sirenoman     |
      | pedropicapapas | conunpico22   |
      | cicloforeach   | condicional22 |
      | eleligido1402  | agradecido09  |
    Given I want to place an order with the discount coupon
    And place another order without the coupon
    Then you can finish with the purchase Tu pedido ha sido confirmado, te mantendremos informado ante nuevas novedades

    When we click the personal information button
    And change the '<firstName>', '<lastName>', '<dateOfBirth>', '<country>', <sexo>
    Then we save the changes Tu información se guardó correctamente

    Examples:
      | firstName   | lastName     | dateOfBirth  | country          | sexo        |
      | "Elizabeth" | "Cruz"       | "23/02/1995" | "Estados Unidos" | "Femenino"  |
