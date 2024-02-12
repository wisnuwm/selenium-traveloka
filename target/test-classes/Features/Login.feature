Feature: Login to saucedemo
#  @Test
#  Scenario Outline: Login valid to saucedemo
#    Given Login with username "<username>" and password "<password>"
#    Examples:
#      | username                | password      |
#      | standard_user           | secret_sauce  |
#  @Test
#  Scenario: Login with valid account
#    Given Input valid username
#    And Input valid password
#    When Click login button
#    Then Should redirected to product lists
#    And Path URL was "/inventory.html"
#  @Test
#  Scenario: Login with unmatched username and password
#    Given Input invalid username
#    And Input invalid password
#    When Click login button
#    Then Show error message username and password not matched

#  Scenario: mitrais saucedemo scenario 1
#    Given Check login page is displayed
#    And Login with username "standard_user" and password "secret_sauce"
#    And Add one product to the cart
#    And Verify the products was added
#    And Checkout cart until finish
#    And Verify the checkout is finish/completed
#    And Logout
#    And Verify logout is completed


  @testMitrais
  Scenario Outline: Login with standard users
    Given Check login page is displayed
    When Input username "<username>"
    And Input password "<password>"
    And Click login button
    Then Product page was displayed
    Examples:
    |username|password|
    |standard_user|secret_sauce|
    |problem_user |secret_sauce|
  @testMitrais
  Scenario Outline: Verify the product was added
    Given Check login page is displayed
    And Input username "<username>"
    And Input password "<password>"
    And Click login button
    When Click add to cart backpack button
    Then The count of cart was increasing to "1"
    Examples:
      |username|password|
      |standard_user|secret_sauce|
      |problem_user |secret_sauce|
  @testMitrais
  Scenario Outline: Checkout cart until finished
    Given Check login page is displayed
    And Input username "<username>"
    And Input password "<password>"
    And Click login button
    When Click add to cart backpack button
    And Click cart button
    And Click checkout button
    And Input firstname "Wisnu"
    And Input lastname "QA"
    And Input zip code "12345"
    And Click continue button
    And Click finish button
    Then The title was "Checkout: Complete!"
    And Verified successfully checkout
    Examples:
      |username|password|
      |standard_user|secret_sauce|
      |problem_user |secret_sauce|
  @testMitrais
  Scenario Outline: Logout user
    Given Check login page is displayed
    And Input username "<username>"
    And Input password "<password>"
    And Click login button
    When Click burger menu
    And Click logout button
    Then Check login page is displayed
    Examples:
      |username|password|
      |standard_user|secret_sauce|
      |problem_user |secret_sauce|