Feature: Auomated E2E

 @wip
Scenario: Verify google search result
  Given user is on google home page
  When I search for "most visited place in delhi" in search field
  And  I click on the link in google search result page
  Then I should navigate to search result page


