package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import framework.webPages.DarkSkyHomePage;
import org.apache.tika.utils.DateUtils;
import org.joda.time.Hours;
import org.testng.Assert;

import java.util.Date;
import java.util.List;

public class DarkSkTimeSD {
    DarkSkyHomePage darkSkyHomePage = new DarkSkyHomePage();
    @Given ("^I am on DarkSky Home Page$")
    public void iAmOnDarkSkyHomePage() {
    }

//    @Then ("^I verify timeline is displayed with two hours incremented$")
//    public void iVerifyTimelineIsDisplayedWithTwoHoursIncremented (){
//        public void verifyTimeLineIncrementedBy(int timeInterval) {
//            List<String> hours =darkSkyHomePage.getHours();
//            List<String>hoursFromSystem = DateUtil.getTimeLineIncremented(timeInterval,hours.size());
//            System.out.println(hours);
//            System.out.println(hoursFromSystem);
//            Assert.assertEquals(hours,hoursFromSystem,"TimeLine is not incremented by"+ timeInterval);
//
//        }

        }


//}
