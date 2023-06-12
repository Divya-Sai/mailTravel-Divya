Feature: Book a trip to India on Mail Travel website

  Scenario: Book a trip to India
    Given I am on the Mail Travel "https://www.mailtravel.co.uk/" website
    And Verify the title of the  page is  "Home Page | Mail Travel"
    When I accept all cookies
    And I search for "India " in the search bar
    And Verify the title of the  page is  "India | Mail Travel"
    And I click on BOOK ONLINE button
    Then I should see the Please select your departure date text
    And I select the next available date for 1 adults
    And I validate the price
    Then I click on dates radio button
    And I make note of the departure airport
    And I click on BOOK ONLINE button at bottom
    And Verify the title of the  page is  "Now Booking India | Mail Travel"
    And I expand the "Date,Departure & Passengers" section
    And I verify the details populated are valid adults "2", departure airport "London Heathrow (LHR)" and departure date "Thu, 12 Oct 2023"
    And I select the number required as 1 for two people in the Accommodation section
    And I click on SELECT YOUR ROOMS AND CONTINUE
   And I fill the Passenger details for first Adult as "Mr",firstName as "Sai",lastName as "Sai",DOB as 10 3 5
    And I fill the Passenger details for second Adult as "Mrs",firstName as "Divya",lastName as "Sai",DOB as 12 3 7
    And I fill the Contact details as "123456789","987654321","divya.sai@gmail.com","adrrs one","Address2","London","TW3 1AS"
    And I select country as "GB"
    And I Select hear about us from "4"
    And I click on CONTINUE button
    Then I should verify the Confirm Details + Book page
    And Verify the title of the  page is  "Payment Details"
    And I verify the Book Now button is enabled.
