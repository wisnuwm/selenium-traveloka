Feature: Test Demo QA Mobbi
  Scenario: Add web tables and validate the result
    Given Click elements button
    And Click web tables
    When Click add button
    And Input first name "Mobbi"
    And Input last name "Munawar"
    And Input email "mobbi@wisnu.com"
    And Input age 25
    And Input salary 10
    And Input departement "Test Dept"
    And CLick submit button
    And Search with keyword "Mobbi"
    Then Validate table result and displayed firt name "Mobbi"