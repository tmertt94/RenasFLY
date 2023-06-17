Feature: SignUp and Login



  @smoke
Scenario: Sign-Up with UI
  Given User navigates to website and verify title as "React App"
  When User verify Home Page header title as "Search Flight"
  Then User clicks Sign Up button and verifies signup page header as "Sign Up"
  And User fills up signup form
  Then User clicks signUp button
  And User verify success message as "User Created"


    @smoke1
    Scenario: User able to login with valid credentials
      Given User navigates to website and verify title as "React App"
      When User verify Home Page header title as "Search Flight"
      Then User clicks Sign Up button and verifies signup page header as "Sign Up"
      And User fills up signup form
      Then User clicks signUp button
      And User verify success message as "User Created"
      Then User clicks login button on header
      And User enters email and password with valid credentials
      Then User clicks login button after added valid credentials
      And User verifies first name on header


      @smoke2
      Scenario: Verify SignUp with Database
        Given User navigates to website and verify title as "React App"
        When User verify Home Page header title as "Search Flight"
        Then User clicks Sign Up button and verifies signup page header as "Sign Up"
        And User fills up signup form
        Then User clicks signUp button
        And User verify success message as "User Created"
        Then Verify that user is created in Database


        @smoke3
        Scenario: SignUp with API
          Given User add request payload
          When User send the request
          Then User verifies status code as 201

          @smoke4
          Scenario: Login with API
            Given User add request payload
            When User send the request
            Then User verifies status code as 201
            And User add request payload for Login
            Then User sends the request for Login
            Then User verifies status code for Login as 200


            @smoke5
            Scenario: SignUp with API and login with UI
              Given User add request payload
              When User send the request
              Then User verifies status code as 201
              And User login with UI by given credentials from API


