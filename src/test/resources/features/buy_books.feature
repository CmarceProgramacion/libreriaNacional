@All
Feature: Validate that through a created account the purchase of books is made on the National Library platform
  As a user of the platform
  I want to register on the platform of the national bookstore
  To be able to shop online

  Background: Access the main platform
    Given that I access the platform of the national bookstore


  @CaseOne
  Scenario Outline:Validate account creation
    When  I register to create the account
      | <email> | <name> | <lastName> | <documentType> | <DocumentNumber> | <CellPhone> | <phoneNumber> | <password> |
    Then I verify the creation of the account "<name>"
    Examples:
      | email                    | name   | lastName | documentType | DocumentNumber | CellPhone  | phoneNumber | password   |
      | Pruebas-1061@yopmail.com | sara47 | Pineda   | CC           | 123456         | 3000000001 | 7000000     | sara123456 |

  @CaseTwo
  Scenario Outline: Validate the purchase of books
    When I buy the books
      | <email> | <password> | <nameArticle> | <addressName> | <typeOfHousing> | <names> | <lastNames> | <phone> | <cellPhone> | <address> | <addressDescription> | <postalCode> | <country> | <department> | <city> |
    Then I verify the purchase of the books "<nameArticle>"
    Examples:
      | email                    | password   | nameArticle                                    | addressName    | typeOfHousing | names | lastNames | phone   | cellPhone  | address      | addressDescription | postalCode | country  | department | city   |
      | Pruebas-1061@yopmail.com | sara123456 | ANDROID MANUAL PRACTICO PARA TODOS LOS NIVELES | Casa de la tia | Apartamento   | Maria | Pineda    | 5000000 | 3000000001 | Kra 9 N 8-39 | Barrio villa emma  | 76500      | COLOMBIA | TOLIMA     | LIBANO |

