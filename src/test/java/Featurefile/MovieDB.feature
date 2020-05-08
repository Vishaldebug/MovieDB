@Mainscreen
Feature: MovieDB Mainscreen

@MovieDetailScreen @Smoketest
Scenario: User navigates to movie details screen from main movies list.

  Given user navigates to the movie main screen
  And I click on "Movie"
  Then user verify navigation to the details screen by text "DESCRIPTION"
  And user taps on back button 


@Search @RegressionTest
Scenario: User search movies filtered by name.

   When I enter "Searchtext_box" as "2020"
   Then user validates valid search
   When I enter "Searchtext_box" as "&&&&"
   Then user validates invalid search by message "No movies found for this query"
   And user taps on back button 
   
@MoreOptions
Scenario: User navigates to menu options 

    And I click on "Option_button"
    And I click on "About_button"
    Then user verify navigation to the About screen by text "ABOUT"
    And user taps on back button 
    And user closed the application
    
  
    

   
  