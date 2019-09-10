@login
Feature: login

  Background:
    Given user is on the landing page


  Scenario Outline: User should able to login with valid credentials
    When user enters "<username>" and "<password>"
    Then homePage title should be "Files - Trycloud"

    Examples:

      | username | password    |
      | User27   | Userpass123 |
      | User86   | Userpass123 |

  @DDTLogin
  Scenario: User should able to login
    When  user log in
    Then homePage title should be "Files - Trycloud"
#      Then user log out