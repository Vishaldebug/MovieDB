@Mainscreen
Feature: MovieDB Mainscreen

@MovieDetail @Smoketest
Scenario: User navigates to movie details screen from main movies list.

  Given user navigates to the movie main screen
  And I click on "Movie_id"
  Then user navigates to the details screen
  And user tap on back button 


@Search @RegressionTest
Scenario: User search movies filtered by name.

   When I enter "Search_id" as "2020"
   Then user validate valid search
   When I enter "Search_id" as "&&&&"
   Then user validate invalid search
   And user tap on back button 
   
@MoreOptions
Scenario: User navigates to menu options 

    And I click on "Option_xpath"
    And I click on "About_xpath"
    Then verify user navigates to the About screen
    And user tap on back button 
    And user close the application
    
  
    

   
  