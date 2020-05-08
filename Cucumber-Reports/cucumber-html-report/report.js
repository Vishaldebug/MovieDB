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
      "name": "@MovieDetailScreen"
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
  "name": "I click on \"Movie\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user verify navigation to the details screen by text \"DESCRIPTION\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user taps on back button",
  "keyword": "And "
});
formatter.match({
  "location": "MovieDB_Step.user_navigates_to_the_movie_main_screen()"
});
formatter.result({
  "duration": 17868998000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Movie",
      "offset": 12
    }
  ],
  "location": "MovieDB_Step.i_click_on(String)"
});
formatter.result({
  "duration": 2740467600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "DESCRIPTION",
      "offset": 54
    }
  ],
  "location": "MovieDB_Step.user_navigates_to_the_details_screen_by_text(String)"
});
formatter.result({
  "duration": 394062400,
  "status": "passed"
});
formatter.match({
  "location": "MovieDB_Step.user_tap_on_back_button()"
});
formatter.result({
  "duration": 144194600,
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
  "name": "I enter \"Searchtext_box\" as \"2020\"",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "user validates valid search",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "I enter \"Searchtext_box\" as \"\u0026\u0026\u0026\u0026\"",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "user validates invalid search by message \"No movies found for this query\"",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "user taps on back button",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Searchtext_box",
      "offset": 9
    },
    {
      "val": "2020",
      "offset": 29
    }
  ],
  "location": "MovieDB_Step.i_enter_as(String,String)"
});
formatter.result({
  "duration": 3427710100,
  "status": "passed"
});
formatter.match({
  "location": "MovieDB_Step.user_validate_valid_search()"
});
formatter.result({
  "duration": 1985158500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Searchtext_box",
      "offset": 9
    },
    {
      "val": "\u0026\u0026\u0026\u0026",
      "offset": 29
    }
  ],
  "location": "MovieDB_Step.i_enter_as(String,String)"
});
formatter.result({
  "duration": 2126146500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "No movies found for this query",
      "offset": 42
    }
  ],
  "location": "MovieDB_Step.user_validate_invalid_search_by_message(String)"
});
formatter.result({
  "duration": 769180700,
  "status": "passed"
});
formatter.match({
  "location": "MovieDB_Step.user_tap_on_back_button()"
});
formatter.result({
  "duration": 129190000,
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
  "name": "I click on \"Option_button\"",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I click on \"About_button\"",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "user verify navigation to the About screen by text \"ABOUT\"",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "user taps on back button",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "user closed the application",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Option_button",
      "offset": 12
    }
  ],
  "location": "MovieDB_Step.i_click_on(String)"
});
formatter.result({
  "duration": 3007335600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "About_button",
      "offset": 12
    }
  ],
  "location": "MovieDB_Step.i_click_on(String)"
});
formatter.result({
  "duration": 3124056900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ABOUT",
      "offset": 52
    }
  ],
  "location": "MovieDB_Step.verify_user_navigates_to_the_About_screen_by_text(String)"
});
formatter.result({
  "duration": 496629400,
  "status": "passed"
});
formatter.match({
  "location": "MovieDB_Step.user_tap_on_back_button()"
});
formatter.result({
  "duration": 144820200,
  "status": "passed"
});
formatter.match({
  "location": "MovieDB_Step.I_want_to_Close()"
});
formatter.result({
  "duration": 2129276900,
  "status": "passed"
});
});