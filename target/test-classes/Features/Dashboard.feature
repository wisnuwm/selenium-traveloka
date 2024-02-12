Feature: Dashboard products
  @Test
  Scenario Outline: As valid user i was able to Filter the products
    Given Login with username "<username>" and password "<password>"
    When Filter products to "<filter>"
    Then The filter selected was "<filter>"
  Examples:
    |username|password|filter|
    |standard_user|secret_sauce|Name (A to Z)       |
#    |standard_user|secret_sauce|Name (Z to A)       |
#    |standard_user|secret_sauce|Price (low to high) |
#    |standard_user|secret_sauce|Price (high to low) |
  @Test
  Scenario Outline: The default filter value was A to Z
    Given Login with username "<username>" and password "<password>"
    And Filter products to "<filter>"
    When Refresh the page
    Then The filter selected was "Name (A to Z)"
    Examples:
      |username|password|filter|
      |standard_user|secret_sauce|Name (A to Z)       |
      |standard_user|secret_sauce|Name (Z to A)       |
      |standard_user|secret_sauce|Price (low to high) |
      |standard_user|secret_sauce|Price (high to low) |