Feature: SignUp functionality
  @Smoke1
  Scenario: Successful SignUp and User Created message
    Given the user is on the SignUp page
    When they enter valid values for First Name, Last Name, Email, Phone, Password, Password Repeat, and Gender
    And they click the Sign Up button
    Then they should see a "User Created" banner message with a green background color

  #Scenario: Verify SignUp with invalid inputs
   # Given the user is on the SignUp page
   # When they enter invalid or empty values for any field
   # And they click the Sign Up button
   # Then they should see the respective error messages for each invalid input
   # And the user should not be created

 # Scenario: Verify mandatory fields and show error messages
  #  Given the user is on the SignUp page
   # When they leave any mandatory field empty
   # And they click the Sign Up button
   # Then they should see an error message indicating the empty field

 # Scenario: Verify email format validation
   # Given the user is on the SignUp page
   # When they enter an invalid email format
    #And they click the Sign Up button
   # Then they should see an error message indicating the invalid email format

 # Scenario: Verify password mismatch validation
   # Given the user is on the SignUp page
  #  When they enter different values in the Password and Password Repeat fields
  #  And they click the Sign Up button
   # Then they should see an error message indicating the password mismatch

  #Scenario: Verify password special character validation
   # Given the user is on the SignUp page
   # When they enter a password containing special characters
    #And they click the Sign Up button
    #Then they should see an error message indicating that the password should not contain special characters

  #Scenario: Verify phone field validation
    #Given the user is on the SignUp page
   # When they enter non-numeric characters in the Phone field
    #And they click the Sign Up button
   # Then they should see an error message indicating that the phone number should only contain numerical values