@testTwo
Feature: Test Background Feature
Description: The purpose of this feature is to test the Background keyword
 
Background: User is Logged In
 Given I navigate to the login page
 When I enter username
 And I enter password
 Then I should be logged in sucessfully
 @Tone
Scenario: Search a product and add the first product to the User basket
 Given User search from All
 When Select Alexa Skills
 Then Select shoud be successful
 @ttwo
Scenario: Navigate to a product and add the same to the Cart
 Given User navigate for Lenovo Laptop
 When Add the laptop to the Cart
 Then User basket should display with added item
