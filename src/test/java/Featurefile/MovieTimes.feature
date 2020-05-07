@Mainscreen
Feature: Movie Mainscreen

@MovieDetail @Smoketest
Scenario: User navigate to movie details screen from main movies list.

  Given user navigate to the movie main screen
  And I click on "Movie_id"
  Then user navigate to the details screen
  And user tap on back button 
  
@Search @RegressionTest
Scenario: User search movies filtered by name.

   When I enter "Search_id" as "2020"
   When I enter "Search_id" as "&&&&"
   Then user validate invalid search
   And user tap on back button 
   
@MoreOptions
Scenario: User navigate to all menu options 

    And I click on "Option_xpath"
    And I click on "Privacy_xpath"
    And user tap on back button 
    And I click on "Option_xpath"
    And I click on "Terms_xpath"
    And user tap on back button 
    And I click on "Option_xpath"
    And I click on "Settings_xpath"
    And user tap on back button 
    And I click on "Option_xpath"
    And I click on "About_xpath"
    And user tap on back button
  
    

   
  