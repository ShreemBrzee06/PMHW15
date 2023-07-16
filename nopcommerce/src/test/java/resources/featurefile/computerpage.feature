Feature: Check Computer Page
@Sanity
  Scenario: Test name verifyProductArrangeInAlphaBaticalOrder
  Given user is on HomePage
  And I mousehoover on computers
  And Click on Desktop
  And Select Sort By position Name: Z to A


@smoke
 Scenario: As a user Test name verifyProductAddedToShoppingCartSuccessFully
  Given user is on HomePage
  And I mousehoover on computers
  And I Click on Desktop
  And I Select Sort By position "Name: A to Z"
  And I click on Add To Cart
  And I verify the Text "Build your own computer"
  And I Select "2.2 GHz Intel Pentium Dual-Core E2200"
  And I Select "8GB [+$60.00]" RAM using Select class.
  And I Select HDD radio button
  And I Select OS radio Vista Premium
  And I check Two Check boxes Microsoft Office and Total Commander
  And I click on ADD TO CARD Button.
  And I Verify the Message "The product has been added to your shopping cart" on Top green Bar
  And I after that close the bar clicking on the cross button.
  Then I click on MouseHover on Shopping cart and Click on GO TO CART button.
  And I Verify the message "Shopping cart"
  And I change the Qty to "2" and Click on Update shopping cart
  And I click on checkbox I agree with the terms of service
  And I click on CHECKOUT
  #And I verify the Text "Welcome, Please Sign In!"
  And I click on CHECKOUT AS GUEST Tab
  And I fill the firstname
  And I fill the lastname
  And I fill the emailAddress
  And I select the country dropdown menu as "United States"
  And I select the state as "Indiana"
  And I enter city name as "Test City"
  And I enter Address one line"Test Street"
  And I enter zip postal code"PE14 5DD"
  And I enter Phone number"0133462656232"
  And I click on CONTINUE button after filling all mandatory fields
  And I click on Radio Button 'Next Day Air'
  And I click on CONTINUE btn
  And Select Radio Button Credit Card
  And Select Master card From Select credit card dropdown"Master card"
 And click on continue button after selecting master card
 And I enter cardHolder name "Ganesha Shiv"
 And I enter My card number as"1254 2555 55"
 And I enter expire month "11"
 And I enter expire year as "2027"
 And I enter cardCode is "555"
 And click on Paymentinfo save
 And I  Verify Payment Method is "Credit Card"
# And I Verify Shipping Method is "Next Day Air"
# And I Verify Total is “$2,950.00”
 And I Click on CONFIRM
 And I verify the Text "Thank You"
And I Verify the message "Your order has been successfully processed!"
#  And I click on CONTINUE button after verifying success message
#  Then I Verify the text "Welcome to our store"