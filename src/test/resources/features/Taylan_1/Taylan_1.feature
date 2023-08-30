Feature: My Profile Page



  @Regression_1
  Scenario: My Profile Page shows the details which are configured at the SignUp Page
    Given the user signUp to the app with random Name, Surname, Telephone Number, and Gender equals Male with API Request
    And the end-user landing to login page
    When The end-user opens My Profile page
    Then the card-body shows the correct information under the profile picture

  @Regression_1
  Scenario: Update User's Details at the My Profile Page
    Given the user signUp to the app with random Name, Surname, Telephone Number, and Gender equals Male with API Request
    And the end-user landing to login page
    When The end-user opens My Profile page
    And Update the previous details with the random email , number and "FEMALE"
    Then the card-body shows the correct information under the profile picture
