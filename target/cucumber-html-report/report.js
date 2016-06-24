$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("test.feature");
formatter.feature({
  "line": 1,
  "name": "Page Navigation",
  "description": "    In order use the internet\n    As a user\n    I want to be able to navigate around a site",
  "id": "page-navigation",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2920537803,
  "status": "passed"
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
formatter.match({
  "location": "HomepageSteps.i_am_on_the_homepage()"
});
formatter.result({
  "duration": 3650997453,
  "status": "passed"
});
formatter.match({
  "location": "HomepageSteps.i_click_on_about()"
});
formatter.result({
  "duration": 1379588890,
  "status": "passed"
});
formatter.match({
  "location": "HomepageSteps.i_am_taken_to_the_about_page()"
});
formatter.result({
  "duration": 100641420,
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[tru]e\u003e but was:\u003c[fals]e\u003e\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat step_definitions.HomepageSteps.i_am_taken_to_the_about_page(HomepageSteps.java:24)\n\tat ✽.Then I am taken to the about page(test.feature:9)\n",
  "status": "failed"
});
formatter.after({
  "duration": 180142376,
  "status": "passed"
});
});