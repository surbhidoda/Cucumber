$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("scenario.feature");
formatter.feature({
  "line": 1,
  "name": "Test multiple Login",
  "description": "",
  "id": "test-multiple-login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Validate multiple login logout",
  "description": "",
  "id": "test-multiple-login;validate-multiple-login-logout",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enters multiple username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 6
    },
    {
      "cells": [
        "surbhi.doda@gmail.com",
        "Success@2019"
      ],
      "line": 7
    },
    {
      "cells": [
        "lovkaushik22@gmail.com",
        "Surbhi@1986"
      ],
      "line": 8
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "login is successful",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.user_is_on_login_page()"
});
formatter.result({
  "duration": 16583181200,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.user_enters_multiple_username_and_password(DataTable)"
});
formatter.result({
  "duration": 13494065800,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.login_is_successful()"
});
formatter.result({
  "duration": 25600,
  "status": "passed"
});
});