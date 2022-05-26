Feature: Login functionality

Background: User successfully clicked on initial login window
When user open "chrome" browser with exe 
When user navigate to url 
When user cancel initial login window

@SmokeTest
Scenario: Login functionality by using valid credentials
When user navigate to login button
When user click on MyProfile
When user enters "8788753323" as username
When user enters "sujata537" as password
When user click on login button
Then application shows user profile to user







