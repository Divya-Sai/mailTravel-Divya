$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:features/mailTravelBooking.feature");
formatter.feature({
  "name": "Book a trip to India on Mail Travel website",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Book a trip to India",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on the Mail Travel \"https://www.mailtravel.co.uk/\" website",
  "keyword": "Given "
});
formatter.match({
  "location": "mailTravelStepDefinitions.mailTravelSteps.i_am_on_the_Mail_Travel_website(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify the title of the  page is  \"Home Page | Mail Travel\"",
  "keyword": "And "
});
formatter.match({
  "location": "mailTravelStepDefinitions.mailTravelSteps.verifyTheTitleOfThePageIs(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I accept all cookies",
  "keyword": "When "
});
formatter.match({
  "location": "mailTravelStepDefinitions.mailTravelSteps.i_accept_all_cookies()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search for \"India \" in the search bar",
  "keyword": "And "
});
formatter.match({
  "location": "mailTravelStepDefinitions.mailTravelSteps.i_search_for_in_the_search_bar(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify the title of the  page is  \"India | Mail Travel\"",
  "keyword": "And "
});
formatter.match({
  "location": "mailTravelStepDefinitions.mailTravelSteps.verifyTheTitleOfThePageIs(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on BOOK ONLINE button",
  "keyword": "And "
});
formatter.match({
  "location": "mailTravelStepDefinitions.mailTravelSteps.iClickOnBOOKONLINEButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see the Please select your departure date text",
  "keyword": "Then "
});
formatter.match({
  "location": "mailTravelStepDefinitions.mailTravelSteps.iShouldSeeThePleaseSelectYourDepartureDateText()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select the next available date for 1 adults",
  "keyword": "And "
});
formatter.match({
  "location": "mailTravelStepDefinitions.mailTravelSteps.i_select_the_next_available_date_for_adults(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I validate the price",
  "keyword": "And "
});
formatter.match({
  "location": "mailTravelStepDefinitions.mailTravelSteps.i_validate_the_price_for_adults()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on dates radio button",
  "keyword": "Then "
});
formatter.match({
  "location": "mailTravelStepDefinitions.mailTravelSteps.iClickOnDatesRadioButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I make note of the departure airport",
  "keyword": "And "
});
formatter.match({
  "location": "mailTravelStepDefinitions.mailTravelSteps.i_make_note_of_the_departure_airport()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on BOOK ONLINE button at bottom",
  "keyword": "And "
});
formatter.match({
  "location": "mailTravelStepDefinitions.mailTravelSteps.iClickOnBOOKONLINEButtonAtBottom()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify the title of the  page is  \"Now Booking India | Mail Travel\"",
  "keyword": "And "
});
formatter.match({
  "location": "mailTravelStepDefinitions.mailTravelSteps.verifyTheTitleOfThePageIs(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expand the \"Date,Departure \u0026 Passengers\" section",
  "keyword": "And "
});
formatter.match({
  "location": "mailTravelStepDefinitions.mailTravelSteps.iExpandTheSection(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify the details populated are valid adults \"2\", departure airport \"London Heathrow (LHR)\" and departure date \"Thu, 12 Oct 2023\"",
  "keyword": "And "
});
formatter.match({
  "location": "mailTravelStepDefinitions.mailTravelSteps.iVerifyTheDetailsPopulatedAreValidAdultsDepartureAirportAndDepartureDate(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select the number required as 1 for two people in the Accommodation section",
  "keyword": "And "
});
formatter.match({
  "location": "mailTravelStepDefinitions.mailTravelSteps.i_select_the_number_required_as_for_people_in_the_Accommodation_section(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on SELECT YOUR ROOMS AND CONTINUE",
  "keyword": "And "
});
formatter.match({
  "location": "mailTravelStepDefinitions.mailTravelSteps.iClickOnSELECTYOURROOMSANDCONTINUE()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill the Passenger details for first Adult as \"Mr\",firstName as \"Sai\",lastName as \"Sai\",DOB as 10 3 5",
  "keyword": "And "
});
formatter.match({
  "location": "mailTravelStepDefinitions.mailTravelSteps.iFillThePassengerDetailsForFirstAdultAsFirstNameAsLastNameAsDOBAs(java.lang.String,java.lang.String,java.lang.String,int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill the Passenger details for second Adult as \"Mrs\",firstName as \"Divya\",lastName as \"Sai\",DOB as 12 3 7",
  "keyword": "And "
});
formatter.match({
  "location": "mailTravelStepDefinitions.mailTravelSteps.iFillThePassengerDetailsForSecondAdultAsFirstNameAsLastNameAsDOBAs(java.lang.String,java.lang.String,java.lang.String,int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill the Contact details as \"123456789\",\"987654321\",\"divya.sai@gmail.com\",\"adrrs one\",\"Address2\",\"London\",\"TW3 1AS\"",
  "keyword": "And "
});
formatter.match({
  "location": "mailTravelStepDefinitions.mailTravelSteps.iFillTheContactDetails(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select country as \"GB\"",
  "keyword": "And "
});
formatter.match({
  "location": "mailTravelStepDefinitions.mailTravelSteps.iSelectCountryAs(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Select hear about us from \"4\"",
  "keyword": "And "
});
formatter.match({
  "location": "mailTravelStepDefinitions.mailTravelSteps.iSelectHearAboutUsFrom(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on CONTINUE button",
  "keyword": "And "
});
formatter.match({
  "location": "mailTravelStepDefinitions.mailTravelSteps.iClickOnCONTINUEButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should verify the Confirm Details + Book page",
  "keyword": "Then "
});
formatter.match({
  "location": "mailTravelStepDefinitions.mailTravelSteps.i_should_verify_the_Confirm_Details_Book_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify the title of the  page is  \"Payment Details\"",
  "keyword": "And "
});
formatter.match({
  "location": "mailTravelStepDefinitions.mailTravelSteps.verifyTheTitleOfThePageIs(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify the Book Now button is enabled.",
  "keyword": "And "
});
formatter.match({
  "location": "mailTravelStepDefinitions.mailTravelSteps.i_verify_the_Book_Now_button_is_enabled()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});