$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com/atlassian/confluence/page_creation.feature");
formatter.feature({
  "line": 2,
  "name": "Create a new confluence page",
  "description": "As a Atlassian user\r\nI want to be able to create new confluence pages\r\nSo that my information is published in my space",
  "id": "create-a-new-confluence-page",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@confluence"
    }
  ]
});
formatter.before({
  "duration": 55436985029,
  "status": "passed"
});
formatter.background({
  "line": 7,
  "name": "A confluence user is logged in",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "I am logged in Atlassian cloud",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefs.i_am_logged_in_Atlassian_cloud()"
});
formatter.result({
  "duration": 54124990507,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "New confluence page",
  "description": "",
  "id": "create-a-new-confluence-page;new-confluence-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "I click on the button create page",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I set a unique page title",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I type some text on the body",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click on the button publish",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "The page is created sucessfully",
  "keyword": "Then "
});
formatter.match({
  "location": "PageCreationStepDefs.i_click_on_the_button_create_page()"
});
formatter.result({
  "duration": 457687534,
  "status": "passed"
});
formatter.match({
  "location": "PageCreationStepDefs.i_set_a_unique_page_title()"
});
formatter.result({
  "duration": 15512294858,
  "status": "passed"
});
formatter.match({
  "location": "PageCreationStepDefs.i_type_some_text_on_the_body()"
});
formatter.result({
  "duration": 47210,
  "status": "passed"
});
formatter.match({
  "location": "PageCreationStepDefs.i_click_on_the_button_publish()"
});
formatter.result({
  "duration": 225554273,
  "status": "passed"
});
formatter.match({
  "location": "PageCreationStepDefs.the_page_is_created_sucessfully()"
});
formatter.result({
  "duration": 11488076251,
  "status": "passed"
});
formatter.uri("com/atlassian/confluence/page_restrictions.feature");
formatter.feature({
  "line": 2,
  "name": "Set  Restrictions on an existing confluence page.",
  "description": "As a Atlassian user\r\nI want to be able to manage restrictions per user.\r\nSo that I have control of what is published in my space.",
  "id": "set--restrictions-on-an-existing-confluence-page.",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@confluence"
    }
  ]
});
formatter.before({
  "duration": 17396912153,
  "status": "passed"
});
formatter.background({
  "line": 7,
  "name": "A confluence user is logged in",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "I am logged in Atlassian cloud",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefs.i_am_logged_in_Atlassian_cloud()"
});
formatter.result({
  "duration": 20973333054,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Set restriction to \"only edit\"",
  "description": "",
  "id": "set--restrictions-on-an-existing-confluence-page.;set-restriction-to-\"only-edit\"",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "a page exists",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I open the options for the page",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I set the restriction to only edit",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "The restriction is applied to the page",
  "keyword": "Then "
});
formatter.match({
  "location": "PageRestrictionsStepDefs.a_page_exists()"
});
formatter.result({
  "duration": 17314638268,
  "status": "passed"
});
formatter.match({
  "location": "PageRestrictionsStepDefs.i_open_the_options_for_the_page()"
});
formatter.result({
  "duration": 2788657506,
  "status": "passed"
});
formatter.match({
  "location": "PageRestrictionsStepDefs.i_set_the_restriction_to_only_edit()"
});
formatter.result({
  "duration": 8858770978,
  "status": "passed"
});
formatter.match({
  "location": "PageRestrictionsStepDefs.the_restriction_is_applied_to_the_page()"
});
formatter.result({
  "duration": 171054095,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 18,
  "name": "Set restriction \"Viewing and editing restricted\" to certain users",
  "description": "",
  "id": "set--restrictions-on-an-existing-confluence-page.;set-restriction-\"viewing-and-editing-restricted\"-to-certain-users",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 19,
  "name": "a page exists",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "I open the options for the page",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "I set the restriction to Viewing and editing restricted",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I type the user \"\u003cuser\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I select the permission to \"\u003cpermission\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "The restriction is applied to the page",
  "keyword": "Then "
});
formatter.examples({
  "line": 26,
  "name": "",
  "description": "",
  "id": "set--restrictions-on-an-existing-confluence-page.;set-restriction-\"viewing-and-editing-restricted\"-to-certain-users;",
  "rows": [
    {
      "cells": [
        "user",
        "permission"
      ],
      "line": 27,
      "id": "set--restrictions-on-an-existing-confluence-page.;set-restriction-\"viewing-and-editing-restricted\"-to-certain-users;;1"
    },
    {
      "cells": [
        "Aleja",
        "view"
      ],
      "line": 28,
      "id": "set--restrictions-on-an-existing-confluence-page.;set-restriction-\"viewing-and-editing-restricted\"-to-certain-users;;2"
    },
    {
      "cells": [
        "Blair",
        "edit"
      ],
      "line": 29,
      "id": "set--restrictions-on-an-existing-confluence-page.;set-restriction-\"viewing-and-editing-restricted\"-to-certain-users;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 6097223779,
  "status": "passed"
});
formatter.background({
  "line": 7,
  "name": "A confluence user is logged in",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "I am logged in Atlassian cloud",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefs.i_am_logged_in_Atlassian_cloud()"
});
formatter.result({
  "duration": 42895992795,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "Set restriction \"Viewing and editing restricted\" to certain users",
  "description": "",
  "id": "set--restrictions-on-an-existing-confluence-page.;set-restriction-\"viewing-and-editing-restricted\"-to-certain-users;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@confluence"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "a page exists",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "I open the options for the page",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "I set the restriction to Viewing and editing restricted",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I type the user \"Aleja\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I select the permission to \"view\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "The restriction is applied to the page",
  "keyword": "Then "
});
formatter.match({
  "location": "PageRestrictionsStepDefs.a_page_exists()"
});
formatter.result({
  "duration": 17082418388,
  "status": "passed"
});
formatter.match({
  "location": "PageRestrictionsStepDefs.i_open_the_options_for_the_page()"
});
formatter.result({
  "duration": 347562355,
  "status": "passed"
});
formatter.match({
  "location": "PageRestrictionsStepDefs.i_set_the_restriction_to()"
});
formatter.result({
  "duration": 7510427815,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Aleja",
      "offset": 17
    }
  ],
  "location": "PageRestrictionsStepDefs.i_type_the_user(String)"
});
formatter.result({
  "duration": 3367724206,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "view",
      "offset": 28
    }
  ],
  "location": "PageRestrictionsStepDefs.i_select_the_permission_to(String)"
});
formatter.result({
  "duration": 531352001,
  "status": "passed"
});
formatter.match({
  "location": "PageRestrictionsStepDefs.the_restriction_is_applied_to_the_page()"
});
formatter.result({
  "duration": 107886616,
  "status": "passed"
});
formatter.before({
  "duration": 14216804047,
  "status": "passed"
});
formatter.background({
  "line": 7,
  "name": "A confluence user is logged in",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "I am logged in Atlassian cloud",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefs.i_am_logged_in_Atlassian_cloud()"
});
formatter.result({
  "duration": 21600604613,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "Set restriction \"Viewing and editing restricted\" to certain users",
  "description": "",
  "id": "set--restrictions-on-an-existing-confluence-page.;set-restriction-\"viewing-and-editing-restricted\"-to-certain-users;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@confluence"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "a page exists",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "I open the options for the page",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "I set the restriction to Viewing and editing restricted",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I type the user \"Blair\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I select the permission to \"edit\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "The restriction is applied to the page",
  "keyword": "Then "
});
formatter.match({
  "location": "PageRestrictionsStepDefs.a_page_exists()"
});
formatter.result({
  "duration": 29364190864,
  "status": "passed"
});
formatter.match({
  "location": "PageRestrictionsStepDefs.i_open_the_options_for_the_page()"
});
formatter.result({
  "duration": 294049477,
  "status": "passed"
});
formatter.match({
  "location": "PageRestrictionsStepDefs.i_set_the_restriction_to()"
});
formatter.result({
  "duration": 14704956245,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Blair",
      "offset": 17
    }
  ],
  "location": "PageRestrictionsStepDefs.i_type_the_user(String)"
});
formatter.result({
  "duration": 8232419394,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "edit",
      "offset": 28
    }
  ],
  "location": "PageRestrictionsStepDefs.i_select_the_permission_to(String)"
});
formatter.result({
  "duration": 417531324,
  "status": "passed"
});
formatter.match({
  "location": "PageRestrictionsStepDefs.the_restriction_is_applied_to_the_page()"
});
formatter.result({
  "duration": 377984324,
  "status": "passed"
});
});