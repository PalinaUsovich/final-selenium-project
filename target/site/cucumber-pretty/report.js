$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("darkSkyRegister.feature");
formatter.feature({
  "line": 4,
  "name": "DarkSkyRegister feature",
  "description": "",
  "id": "darkskyregister-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@web"
    }
  ]
});
formatter.before({
  "duration": 5633724233,
  "status": "passed"
});
formatter.background({
  "line": 6,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "I am on the DarkSky Register page",
  "keyword": "Given "
});
formatter.match({
  "location": "DarkSkySD.iAmOnDarkSkyHomePage()"
});
formatter.result({
  "duration": 4914039632,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Verify invalid signup error message",
  "description": "",
  "id": "darkskyregister-feature;verify-invalid-signup-error-message",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@Register-1"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "I click on sign Up button",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I click on register button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I verify I am on register page by asserting Register header",
  "keyword": "Then "
});
formatter.match({
  "location": "DarkSkySD.iClickOnSignUpButton()"
});
formatter.result({
  "duration": 2150497312,
  "status": "passed"
});
formatter.match({
  "location": "DarkSkySD.clickOnRegisterButton()"
});
formatter.result({
  "duration": 2073802594,
  "status": "passed"
});
formatter.match({
  "location": "DarkSkySD.verifyRegisterHeader()"
});
formatter.result({
  "duration": 110189123,
  "status": "passed"
});
formatter.after({
  "duration": 151835141,
  "status": "passed"
});
});