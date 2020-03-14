$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("darkSkyRegister.feature");
formatter.feature({
  "line": 1,
  "name": "DarkSkyRegister feature",
  "description": "",
  "id": "darkskyregister-feature",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "I am on dark sky page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 7,
  "name": "Verify invalid signup error message",
  "description": "",
  "id": "darkskyregister-feature;verify-invalid-signup-error-message",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@Register-1"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I am on darksky Register Page",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I click on register button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I verify I am on register page by asserting Register header",
  "keyword": "Then "
});
formatter.match({
  "location": "DarkSkySD.iAmOnDarkSkyHomePage()"
});
formatter.result({
  "duration": 340293986,
  "error_message": "java.lang.NullPointerException\n\tat java.util.Objects.requireNonNull(Objects.java:203)\n\tat org.openqa.selenium.support.ui.FluentWait.\u003cinit\u003e(FluentWait.java:115)\n\tat org.openqa.selenium.support.ui.FluentWait.\u003cinit\u003e(FluentWait.java:106)\n\tat org.openqa.selenium.support.ui.FluentWait.\u003cinit\u003e(FluentWait.java:96)\n\tat framework.webPages.BasePage.webAction(BasePage.java:20)\n\tat framework.webPages.BasePage.setValue(BasePage.java:43)\n\tat framework.webPages.DarkSkyHomePage.enterAddress(DarkSkyHomePage.java:10)\n\tat stepdefinition.DarkSkySD.iAmOnDarkSkyHomePage(DarkSkySD.java:17)\n\tat ✽.When I am on darksky Register Page(darkSkyRegister.feature:8)\n",
  "status": "failed"
});
formatter.match({
  "location": "DarkSkySD.clickOnRegisterButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DarkSkySD.verifyRegisterHeader()"
});
formatter.result({
  "status": "skipped"
});
});