Feature: Update my profile information

  Scenario Outline: Update profile

    Given enter the wappe official page
    And login with username and password
      | user        | password     |
      | miguel      | ayudadiosito |
      | gomez123ss  | yanopuedof   |
      | automation  | backend15    |
      | holadiosito | soyyodenuevo |
    When we click the personal information button
    And change the '<firstName>', '<lastName>', '<dateOfBirth>', '<country>', <sexo>
    Then we save the changes Tu información se guardó correctamente
    Examples:
      | firstName   | lastName     | dateOfBirth  | country          | sexo        |
      | "Cabio"     | "Mcgarrette" | "14/02/2000" | "Colombia"       | "Masculino" |
      | "Elizabeth" | "Cruz"       | "23/02/1995" | "Estados Unidos" | "Femenino"  |
      | "Michel"    | "Razo"       | "23/02/1980" | "Argentina"      | "Femenino"  |