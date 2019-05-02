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
  "duration": 2126549514,
  "status": "passed"
});
formatter.match({
  "location": "SignIn.go_to_home_page()"
});
formatter.result({
  "duration": 2230615368,
  "status": "passed"
});
formatter.match({
  "location": "SignIn.click_on_signin_button()"
});
formatter.result({
  "duration": 640062919,
  "status": "passed"
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
  "duration": 249555982,
  "status": "passed"
});
formatter.match({
  "location": "SignIn.click_on_Submit_button()"
});
formatter.result({
  "duration": 32105343581,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//input[@id\u003d\u0027signInSubmit\u0027]\"}\n  (Session info: chrome\u003d73.0.3683.103)\n  (Driver info: chromedriver\u003d73.0.3683.20 (8e2b610813e167eee3619ac4ce6e42e3ec622017),platform\u003dWindows NT 10.0.17134 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027DESKTOP-9445UGT\u0027, ip: \u0027192.168.1.173\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_201\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 73.0.3683.20 (8e2b610813e16..., userDataDir: C:\\Users\\farha\\AppData\\Loca...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:51367}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), rotatable: false, setWindowRect: true, strictFileInteractability: false, takesHeapSnapshot: true, takesScreenshot: true, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unexpectedAlertBehaviour: ignore, unhandledPromptBehavior: ignore, version: 73.0.3683.103, webStorageEnabled: true}\nSession ID: 43f4945194a36dd081ffc8241129db4d\n*** Element info: {Using\u003dxpath, value\u003d//input[@id\u003d\u0027signInSubmit\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:322)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:424)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:314)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy18.getText(Unknown Source)\r\n\tat com.tt.stepdef.SignIn.click_on_Submit_button(SignIn.java:49)\r\n\tat ✽.And Click on Submit button(Login.feature:9)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "SignIn.login_should_successfull()"
});
formatter.result({
  "status": "skipped"
});
});