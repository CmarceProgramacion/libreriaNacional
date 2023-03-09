@All
Feature: Validate that through a created account the purchase of books is made on the National Library platform
  As a user of the platform
  I want to register on the platform of the national bookstore
  To be able to shop online

  Background: Access the main platform
    Given that I access the platform of the national bookstore

  @CaseOne
  Scenario:Validate account creation
    When  I register to create the account
    Then I verify the creation of the account


  @CaseTwo
  Scenario: Validate the purchase of books
    When I buy the books
    Then I verify the purchase of the books


