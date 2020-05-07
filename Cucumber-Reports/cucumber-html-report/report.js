$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("MovieDB.feature");
formatter.feature({
  "line": 2,
  "name": "MovieDB Mainscreen",
  "description": "",
  "id": "moviedb-mainscreen",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Mainscreen"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "User navigates to movie details screen from main movies list.",
  "description": "",
  "id": "moviedb-mainscreen;user-navigates-to-movie-details-screen-from-main-movies-list.",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@MovieDetail"
    },
    {
      "line": 4,
      "name": "@Smoketest"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user navigates to the movie main screen",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I click on \"Movie_id\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user navigates to the details screen",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user tap on back button",
  "keyword": "And "
});
formatter.match({
  "location": "MovieDB_Step.user_navigates_to_the_movie_main_screen()"
});
formatter.result({
  "duration": 11768985800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Movie_id",
      "offset": 12
    }
  ],
  "location": "MovieDB_Step.i_click_on(String)"
});
formatter.result({
  "duration": 609957700,
  "status": "passed"
});
formatter.match({
  "location": "MovieDB_Step.user_navigates_to_the_details_screen()"
});
formatter.result({
  "duration": 1702090500,
  "status": "passed"
});
formatter.match({
  "location": "MovieDB_Step.user_tap_on_back_button()"
});
formatter.result({
  "duration": 176129900,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "User search movies filtered by name.",
  "description": "",
  "id": "moviedb-mainscreen;user-search-movies-filtered-by-name.",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@Search"
    },
    {
      "line": 13,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "I enter \"Search_id\" as \"2020\"",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "user validate valid search",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "I enter \"Search_id\" as \"\u0026\u0026\u0026\u0026\"",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "user validate invalid search",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "user tap on back button",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Search_id",
      "offset": 9
    },
    {
      "val": "2020",
      "offset": 24
    }
  ],
  "location": "MovieDB_Step.i_enter_as(String,String)"
});
formatter.result({
  "duration": 1332748900,
  "status": "passed"
});
formatter.match({
  "location": "MovieDB_Step.user_validate_valid_search()"
});
formatter.result({
  "duration": 2014677700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Search_id",
      "offset": 9
    },
    {
      "val": "\u0026\u0026\u0026\u0026",
      "offset": 24
    }
  ],
  "location": "MovieDB_Step.i_enter_as(String,String)"
});
formatter.result({
  "duration": 376874700,
  "status": "passed"
});
formatter.match({
  "location": "MovieDB_Step.user_validate_invalid_search()"
});
formatter.result({
  "duration": 1540726100,
  "status": "passed"
});
formatter.match({
  "location": "MovieDB_Step.user_tap_on_back_button()"
});
formatter.result({
  "duration": 128239000,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "User navigates to menu options",
  "description": "",
  "id": "moviedb-mainscreen;user-navigates-to-menu-options",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 22,
      "name": "@MoreOptions"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "I click on \"Option_xpath\"",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I click on \"About_xpath\"",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "verify user navigates to the About screen",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "user tap on back button",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "user close the application",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Option_xpath",
      "offset": 12
    }
  ],
  "location": "MovieDB_Step.i_click_on(String)"
});
formatter.result({
  "duration": 1003691600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "About_xpath",
      "offset": 12
    }
  ],
  "location": "MovieDB_Step.i_click_on(String)"
});
formatter.result({
  "duration": 1432942400,
  "status": "passed"
});
formatter.match({
  "location": "MovieDB_Step.verify_user_navigates_to_the_About_screen()"
});
formatter.result({
  "duration": 1424394600,
  "status": "passed"
});
formatter.match({
  "location": "MovieDB_Step.user_tap_on_back_button()"
});
formatter.result({
  "duration": 128872400,
  "status": "passed"
});
formatter.match({
  "location": "MovieDB_Step.I_want_to_Close()"
});
formatter.result({
  "duration": 1894333500,
  "status": "passed"
});
});