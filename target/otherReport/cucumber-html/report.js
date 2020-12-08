$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("NRItest.feature");
formatter.feature({
  "line": 2,
  "name": "NRI Test",
  "description": "Testing for NRI screening QA position",
  "id": "nri-test",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@NRITest"
    }
  ]
});
formatter.before({
  "duration": 4979509,
  "status": "passed"
});
formatter.before({
  "duration": 153989,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "Initiate browser",
  "keyword": "Given "
});
formatter.match({
  "location": "NRItestDef.initiate_browser()"
});
formatter.result({
  "duration": 1932771368,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Test NRi",
  "description": "",
  "id": "nri-test;test-nri",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@Test1"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "Open \"demo.automationtesting.in\" URL on any browser",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "Click on Skip Sign in button",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Navigate to register page",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Fill all the fields",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Click on submit button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Navigate to webtable menu",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Edit, delete a record from webtable",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Navigate to SwitchTo",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Click the button to display the alertbox",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Click on alert",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Navigate to Interactions-\u003eDrag and Drop-\u003estatic",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Drag selenium logo",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Exit the test",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "demo.automationtesting.in",
      "offset": 6
    }
  ],
  "location": "NRItestDef.open_url_on_any_browser(String)"
});
formatter.result({
  "duration": 2565405845,
  "status": "passed"
});
formatter.match({
  "location": "NRItestDef.click_on_skip_sign_in_button()"
});
formatter.result({
  "duration": 3542739366,
  "status": "passed"
});
formatter.match({
  "location": "NRItestDef.navigate_to_register_page()"
});
formatter.result({
  "duration": 3040342003,
  "status": "passed"
});
formatter.match({
  "location": "NRItestDef.fill_all_the_fields()"
});
formatter.result({
  "duration": 2399931028,
  "status": "passed"
});
formatter.match({
  "location": "NRItestDef.click_on_submit_button()"
});
formatter.result({
  "duration": 147542880,
  "status": "passed"
});
formatter.match({
  "location": "NRItestDef.navigate_to_webtable_menu()"
});
formatter.result({
  "duration": 4403105629,
  "status": "passed"
});
formatter.match({
  "location": "NRItestDef.edit_delete_a_record_from_webtable()"
});
formatter.result({
  "duration": 923941586,
  "status": "passed"
});
formatter.match({
  "location": "NRItestDef.navigate_to_switch_to()"
});
formatter.result({
  "duration": 2613739024,
  "status": "passed"
});
formatter.match({
  "location": "NRItestDef.click()"
});
formatter.result({
  "duration": 304241675,
  "status": "passed"
});
formatter.match({
  "location": "NRItestDef.click_on_alert()"
});
formatter.result({
  "duration": 26060780,
  "status": "passed"
});
formatter.match({
  "location": "NRItestDef.navigate_to_interactions_drag_and_drop_static()"
});
formatter.result({
  "duration": 1847303997,
  "status": "passed"
});
formatter.match({
  "location": "NRItestDef.drag_selenium_logo()"
});
formatter.result({
  "duration": 321058040,
  "error_message": "java.lang.AssertionError: expected [true] but found [false]\n\tat org.testng.Assert.fail(Assert.java:94)\n\tat org.testng.Assert.failNotEquals(Assert.java:513)\n\tat org.testng.Assert.assertTrue(Assert.java:42)\n\tat org.testng.Assert.assertTrue(Assert.java:52)\n\tat pageObject.DragDropPage.dragDropPic(DragDropPage.java:55)\n\tat stepDefinitions.NRItestDef.drag_selenium_logo(NRItestDef.java:98)\n\tat ✽.And Drag selenium logo(NRItest.feature:21)\n",
  "status": "failed"
});
formatter.match({
  "location": "NRItestDef.exit_the_test()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 253450491,
  "status": "passed"
});
});