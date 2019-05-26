$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("scenario.feature");
formatter.feature({
  "line": 1,
  "name": "Test functionality that user is logged in and successfully able to add the product to cart",
  "description": "",
  "id": "test-functionality-that-user-is-logged-in-and-successfully-able-to-add-the-product-to-cart",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Validate successful login with correct credentials",
  "description": "",
  "id": "test-functionality-that-user-is-logged-in-and-successfully-able-to-add-the-product-to-cart;validate-successful-login-with-correct-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enters correct username and password",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "login successful",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.user_is_on_login_page()"
});
formatter.result({
  "duration": 14948572900,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.user_enters_correct_username_and_password()"
});
formatter.result({
  "duration": 2735883200,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.login_successful()"
});
formatter.result({
  "duration": 3632938100,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Validate successful addition to cart",
  "description": "",
  "id": "test-functionality-that-user-is-logged-in-and-successfully-able-to-add-the-product-to-cart;validate-successful-addition-to-cart",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "User is logged in and searching item",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "user clicks add to cart",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "product is added to cart",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.user_is_logged_in_and_searching_item()"
});
formatter.result({
  "duration": 5427377400,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.user_clicks_add_to_cart()"
});
formatter.result({
  "duration": 1581164300,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.product_is_added_to_cart()"
});
formatter.result({
  "duration": 4026113700,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Validate logout",
  "description": "",
  "id": "test-functionality-that-user-is-logged-in-and-successfully-able-to-add-the-product-to-cart;validate-logout",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 16,
  "name": "User is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "user clicks logout button",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "user is logged out",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.user_is_on_Home_Page()"
});
formatter.result({
  "duration": 48670700,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.user_clicks_logout_button()"
});
formatter.result({
  "duration": 162360200,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.user_is_logged_out()"
});
formatter.result({
  "duration": 3230767300,
  "status": "passed"
});
});