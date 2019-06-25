Feature: Add Employee
Background:
 Given I logged in
 And I click on PIM
 When I click on employee link
 
  @smoke @addEmployee
   Scenario Outline: 
    When I provide "<firstName>", "<lastName>", and "<location>"
    And I click on savebotton
    Then I see "<firstName>", "<lastName>"  is displayed
Examples:
|firstName|lastName|location|
|Adam|Yusifov|Apple|

 