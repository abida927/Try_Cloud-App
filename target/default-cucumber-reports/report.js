$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src\\test\\resourses\\features\\uploadFile.feature");
formatter.feature({
  "name": "Upload File",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Upload_File"
    }
  ]
});
formatter.step({
  "name": "user enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "navigate to the \"\u003cmodule\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "unload file",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "module"
      ]
    },
    {
      "cells": [
        "User27",
        "Userpass123",
        "Files"
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
  "name": "user is on the landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStep_Definition.user_is_on_the_landing_page()"
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
      "name": "@Upload_File"
    }
  ]
});
formatter.step({
  "name": "user enters \"User27\" and \"Userpass123\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStep_Definition.user_enters_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigate to the \"Files\"",
  "keyword": "Then "
});
formatter.match({
  "location": "UploadFileStep_Definition.navigate_to_the(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "unload file",
  "keyword": "Then "
});
formatter.match({
  "location": "UploadFileStep_Definition.unload_file()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});