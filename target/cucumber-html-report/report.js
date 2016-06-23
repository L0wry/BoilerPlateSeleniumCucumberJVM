$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("test.feature");
formatter.feature({
  "line": 1,
  "name": "Page Navigation",
  "description": "    In order use the internet\n    As a user\n    I want to be able to navigate around a site",
  "id": "page-navigation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "Verify a user is able to navigate to the about page",
  "description": "",
  "id": "page-navigation;verify-a-user-is-able-to-navigate-to-the-about-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I am on the homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I click on \u0027about\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I am taken to the about page",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});