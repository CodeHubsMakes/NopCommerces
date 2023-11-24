  
    
    
    Feature: Login
     Scenario: Successful Login with valid Credentials
    Given User Launch Chrome browser
    When User open URL "https://admin-demo.nopcommerce.com/login"
    And User enters Email as "admin@yourstore.com" and Password as "admin"
    And Click on lLogin
    Then Page Title Should be "Dashboard / nopCommerce administration"
    When User click on Log out link
    Then page Title should be "Your store .Login"
    And close browser
    
    
      
    
    Scenario Outline: Login Data Drivan
    Given User Launch Chrome browser
    When User open URL "https://admin-demo.nopcommerce.com/login"
    And User enters Email as "<email>" and Password as "<password>"
    And Click on lLogin
    Then Page Title Should be "Dashboard / nopCommerce administration"
    When User click on Log out link
    Then page Title should be "Your store .Login"
    And close browser
    
    
    Examples:
                |email| password|
                |admin@yourstore.com| admin |
                |admin1@yourstore.com| admin123 |
