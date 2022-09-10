Feature: Place an order
  As AQ Automation
  I want to place an order
  To finalize the purchase

  Background: Enter the website and enter with username and password
    Given enter the wappe official page
    And login with username and password
      | user           | password      |
      | elhackerman    | sirenoman     |
      | pedropicapapas | conunpico22   |
      | cicloforeach   | condicional22 |
      | eleligido1402  | agradecido09  |

  Scenario: Place an order
    Given I want to place an order with the discount coupon
    And place another order without the coupon
    Then you can finish with the purchase Tu pedido ha sido confirmado, te mantendremos informado ante nuevas novedades
