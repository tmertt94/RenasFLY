Feature: SignUp functionality
  @smoke1
  Scenario: Successful SignUp and User Created message
    Given the user is on the SignUp page
    When they enter valid values for First Name, Last Name, Email, Phone, Password, Password Repeat, and Gender
    And they click the Sign Up button
    Then they should see a "User Created" banner message with a green background color
  @Smoke
  Scenario: Successful Login and Redirection with UI
    Given the user is on the Login page
    When the user enters valid email address and password
    And the user clicks on Login button
    Then the user should be redirected to the Search Flight page
