$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 2,
  "name": "Amazon Login feature Test",
  "description": "",
  "id": "amazon-login-feature-test",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@loginn"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "User be able to signin successfully",
  "description": "",
  "id": "amazon-login-feature-test;user-be-able-to-signin-successfully",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "Launch Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Go to home page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Click on signin button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "put Username as \"\u003cUsername\u003e\" and password as \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Click on Submit button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "login should successfull",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "amazon-login-feature-test;user-be-able-to-signin-successfully;",
  "rows": [
    {
      "cells": [
        "Username",
        "password"
      ],
      "line": 13,
      "id": "amazon-login-feature-test;user-be-able-to-signin-successfully;;1"
    },
    {
      "cells": [
        "login_practice@yahoo.com",
        "Sony1983"
      ],
      "line": 14,
      "id": "amazon-login-feature-test;user-be-able-to-signin-successfully;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "User be able to signin successfully",
  "description": "",
  "id": "amazon-login-feature-test;user-be-able-to-signin-successfully;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@loginn"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Launch Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Go to home page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Click on signin button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "put Username as \"login_practice@yahoo.com\" and password as \"Sony1983\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Click on Submit button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "login should successfull",
  "keyword": "Then "
});
formatter.match({
  "location": "SignIn.launch_Browser()"
});
formatter.result({
  "duration": 1887438539,
  "error_message": "org.openqa.selenium.SessionNotCreatedException: session not created: Chrome version must be between 70 and 73\n  (Driver info: chromedriver\u003d73.0.3683.20 (8e2b610813e167eee3619ac4ce6e42e3ec622017),platform\u003dWindows NT 10.0.17134 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 867 milliseconds\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027DESKTOP-9445UGT\u0027, ip: \u0027192.168.1.173\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_201\u0027\nDriver info: driver.version: ChromeDriver\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.JsonWireProtocolResponse.lambda$new$0(JsonWireProtocolResponse.java:53)\r\n\tat org.openqa.selenium.remote.JsonWireProtocolResponse.lambda$getResponseFunction$2(JsonWireProtocolResponse.java:91)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.lambda$createSession$0(ProtocolHandshake.java:122)\r\n\tat java.util.stream.ReferencePipeline$3$1.accept(Unknown Source)\r\n\tat java.util.Spliterators$ArraySpliterator.tryAdvance(Unknown Source)\r\n\tat java.util.stream.ReferencePipeline.forEachWithCancel(Unknown Source)\r\n\tat java.util.stream.AbstractPipeline.copyIntoWithCancel(Unknown Source)\r\n\tat java.util.stream.AbstractPipeline.copyInto(Unknown Source)\r\n\tat java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)\r\n\tat java.util.stream.FindOps$FindOp.evaluateSequential(Unknown Source)\r\n\tat java.util.stream.AbstractPipeline.evaluate(Unknown Source)\r\n\tat java.util.stream.ReferencePipeline.findFirst(Unknown Source)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:125)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:73)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:136)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:212)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:130)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:181)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:168)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:123)\r\n\tat com.tt.common.Common.getBrowser(Common.java:22)\r\n\tat com.tt.stepdef.SignIn.launch_Browser(SignIn.java:22)\r\n\tat ✽.Given Launch Browser(Login.feature:5)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "SignIn.go_to_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SignIn.click_on_signin_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "login_practice@yahoo.com",
      "offset": 17
    },
    {
      "val": "Sony1983",
      "offset": 60
    }
  ],
  "location": "SignIn.put_Username_as_and_password_as(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SignIn.click_on_Submit_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SignIn.login_should_successfull()"
});
formatter.result({
  "status": "skipped"
});
});