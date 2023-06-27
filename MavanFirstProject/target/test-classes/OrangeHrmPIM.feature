Feature: Test PIM functionality of OrangeHRM application
Background: 
    Given user already in OrangeHRM login page
    And user login successfully with valid data
    And click PIM
Scenario Outline: Verify PIM creation
    When clicks on Add button 
    And user enters FirstName as <FirstName> in FirstName filed
    And user enters LastName as <LastName> in LastName filed
    And clears Employee id filed and enters Employeeid as <EmpId> in Employee id filed
    And clicks on Save button
    Then user should verify PIM is created with Employeeid as <EmpId>
    And close the browser
    
    Examples: 
    | FirstName       | LastName       | EmpId       |
    | Radha           | Potdar         | 7070        |
    
Scenario Outline: Verify PIM modification
    When user selectes checkbox of PIM 
    And clicks on edit logo
    And clicks on Job
    And selects Job Title as <JobTitle> from list
    And clicks on Save button
    Then user should verify PIM is modified with Job Title as <JobTitle> 
    And close the browser
    
    Examples: 
    | FirstName       | LastName       | EmpId       | JobTitle          |
    | Radha           | Potdar         | 7070        | QA Engineer       |
    
Scenario Outline: Verify PIM deletion
    When user selectes checkbox of PIM
    And clicks on delete logo
    And user will get a popup to comfirm deletion, select Yes,Delete
    Then user should verify PIM is deleted with Employeeid as <EmpId>
    And close the browser
    
    Examples: 
    | FirstName       | LastName       | EmpId       | JobTitle          |
    | Radha           | Potdar         | 7070        | QA Engineer       |