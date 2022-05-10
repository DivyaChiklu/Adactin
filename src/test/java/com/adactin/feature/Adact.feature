Feature: Booking Hotel In Adactin Application

@SmokeTest
Scenario: To Check Successful Login Functionality
Given user launch The Application
When user Enter The Username In Username Field
And user Enter The Password In Password Field
Then Click The Login Button And It Navigates To Search Hotel Page

@SanityTest
Scenario: To Verify The Search Hotel Functionality
When user Select Location
And user Select Hotel
And user Select Room Type
And user Select Number Of Rooms
And user Enter The CheckIn Date
And user Enter The CheckOut Date
And user Select Adult Per Room
Then Click Search Button to Select Hotel Page

@SanityTest
Scenario: Select The Hotel From The Search
When user click The Radio Button 
Then Click Search Button to Book the Hotel

@SanityTest
Scenario: Verify The Booking With Payment Details
When user Enter The First Name
And user Enter The Last name
And user Enter the Address
And user Enter The Credit Card No
And user Select Card Type
And user Select Card Expiry Month And Year
And user Enter CVV Pin
Then Click The Book Now Button

 


