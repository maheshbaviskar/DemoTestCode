Feature: to Test the jsp page
 
 
  Scenario Outline: Search Name on Web Page
    Given Go To Url <URL>
    When Enter the below <Name>
    Then Same name should be displayed <Name>
    
    Examples:
    |URL|Name|
    |http://localhost:8081/DemoWebPage/|mahesh|
    |http://localhost:8081/DemoWebPage/|name|
    