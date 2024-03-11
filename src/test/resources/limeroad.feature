Feature: Limeroad E2E Testing

Background: Login with valid credentials
Given User able to view the home 
When User click the login btn
And User enter the mobile number as "<mobile>"

#@SmokeTest
#Scenario Outline: Login with valid credentials
#Given User able to view the home page
#When User click the login button
#And User enter the mobile number "<mobile>"
#And User click the next button
#And User enter the Otp <otpValue>
#Then User able to view the home page after successful login

#Examples: 
#| mobile | otpValue |
#| 132546346 | 452435 |
#| 9876549876 | 4543 |


@RegressionTest
Scenario: Search for kid's Tshirt
Given User able to view the home page
When User mousehover on Kids and click on T-shirt
Then User able to view all the related products

@Test
Scenario: Select a product
Given User able to view all the kids tshirts


#select a product
#payment for the product
