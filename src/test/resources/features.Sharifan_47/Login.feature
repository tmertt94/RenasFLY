Feature:  Login functionality

  @Smoke2
  Scenario: Successful Login and Redirection with UI
    Given the user is on the Login page
    When the user enters valid email address and password
    And the user clicks on Login button
    Then the user should be redirected to the Search Flight page

  #Scenario: Login Form Fields and Error Handling
   # Given the user is on the Login page
    #When the user enters wrong email address and password
   #And the user clicks on Login button
  #Then the user should see an error message "Wrong Email Or Password" in red

    #Api test cases
   #Scenario: Successful login with valid credentials
   # Given I have valid login credentials
    #When I send a POST request to "{BaseURL}/api/auth/login" with the login credentials
   # Then the response status code should be 200

  #Scenario: Login with both incorrect email and password
   # Given I have both an incorrect email and password
   # When I send a POST request to "{BaseURL}/api/auth/login" with the incorrect email and password
    #Then the response status code should be 401