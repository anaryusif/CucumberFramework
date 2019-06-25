$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/addEmployee.feature");
formatter.feature({
  "name": "Add Employee",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@addEmployee"
    }
  ]
});
formatter.step({
  "name": "I provide \"\u003cfirstName\u003e\", \"\u003clastName\u003e\", and \"\u003clocation\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "I click on savebotton",
  "keyword": "And "
});
formatter.step({
  "name": "I see \"\u003cfirstName\u003e\", \"\u003clastName\u003e\"  is displayed",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "firstName",
        "lastName",
        "location"
      ]
    },
    {
      "cells": [
        "Adam",
        "Yusifov",
        "Apple"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "AddEmployee.i_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on PIM",
  "keyword": "And "
});
formatter.match({
  "location": "AddEmployee.i_click_on_PIM()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on employee link",
  "keyword": "When "
});
formatter.match({
  "location": "AddEmployee.i_click_on_employee_link()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@addEmployee"
    }
  ]
});
formatter.step({
  "name": "I provide \"Adam\", \"Yusifov\", and \"Apple\"",
  "keyword": "When "
});
formatter.match({
  "location": "AddEmployee.i_provide_and(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on savebotton",
  "keyword": "And "
});
formatter.match({
  "location": "AddEmployee.i_click_on_savebotton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I see \"Adam\", \"Yusifov\"  is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "AddEmployee.i_see_is_displayed(String,String)"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[Adam Yusifov]\u003e but was:\u003c[Personal Details]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat com.rubex.steps.AddEmployee.i_see_is_displayed(AddEmployee.java:47)\r\n\tat ✽.I see \"Adam\", \"Yusifov\"  is displayed(file:src/test/resources/features/addEmployee.feature:11)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
});