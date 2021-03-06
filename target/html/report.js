$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("PgObjSimpFeature.feature");
formatter.feature({
  "id": "implementing-page-object-model-in-cow-\u0026-gate-site",
  "description": "as a user \nI want to populate Register page \nthen it should navigate to registration succesfull page",
  "name": "Implementing Page Object Model in Cow \u0026 Gate Site",
  "keyword": "Feature",
  "line": 1
});
formatter.background({
  "description": "",
  "name": "",
  "keyword": "Background",
  "line": 6,
  "type": "background"
});
formatter.step({
  "name": "I am in Cow \u0026 Gate Home Page",
  "keyword": "Given ",
  "line": 7
});
formatter.match({
  "location": "SPgObjCommonPage.I_am_in_Cow_Gate_Home_Page()"
});
formatter.result({
  "duration": 26469076000,
  "status": "passed"
});
formatter.scenario({
  "id": "implementing-page-object-model-in-cow-\u0026-gate-site;populating-the-registration-form",
  "description": "",
  "name": "Populating the registration form",
  "keyword": "Scenario",
  "line": 9,
  "type": "scenario"
});
formatter.step({
  "name": "I click on \"Join Our Club\" link",
  "keyword": "When ",
  "line": 11
});
formatter.step({
  "name": "I populate the data in registration page",
  "keyword": "And ",
  "line": 12,
  "rows": [
    {
      "cells": [
        "data"
      ],
      "line": 13
    },
    {
      "cells": [
        "wxy-vwx-NE45AN-1-1-2015-yes-wxy@gmail.com-khjjjjjj-ABCDEF075"
      ],
      "line": 14
    }
  ]
});
formatter.step({
  "name": "click on JoinTheClub link",
  "keyword": "And ",
  "line": 16
});
formatter.step({
  "name": "I should navigate to registration sucessfull page",
  "keyword": "Then ",
  "line": 17
});
formatter.match({
  "arguments": [
    {
      "val": "Join Our Club",
      "offset": 12
    }
  ],
  "location": "SPgObjCommonPage.I_click_on_link(String)"
});
formatter.result({
  "duration": 320376000,
  "status": "passed"
});
formatter.match({
  "location": "SPgObjCommonPage.I_populate_the_data_in_registration_page(DataTable)"
});
formatter.result({
  "duration": 5348332000,
  "status": "passed"
});
formatter.match({
  "location": "SPgObjCommonPage.click_on_JoinTheClub_link()"
});
formatter.result({
  "duration": 113753000,
  "status": "passed"
});
formatter.match({
  "location": "SPgObjCommonPage.I_should_navigate_to_registration_sucessfull_page()"
});
formatter.result({
  "duration": 1350449000,
  "status": "passed"
});
});