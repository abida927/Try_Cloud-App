Feature: Upload File

  Background:
    Given  user is on the landing page

  @Upload_File
  Scenario Outline:
    When user enters "<username>" and "<password>"
    Then navigate to the "<module>"
    Then unload file

    Examples:

      | username | password    | module |
      | User27   | Userpass123 | Files  |
