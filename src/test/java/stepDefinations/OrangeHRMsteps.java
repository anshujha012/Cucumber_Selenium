package stepDefinations;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class OrangeHRMsteps {
    WebDriver driver;


    @Given("Open the chrome browser")
    public void open_the_chrome_browser() {
       System.setProperty("webdriver.chrome.driver", "/Users/gaurangsharma/IdeaProjects/Cucumber_selenium/chromedriver.exe");
       driver=new ChromeDriver();
        throw new cucumber.api.PendingException();
    }
    @When("open the OrangeHRM home page")
    public void open_the_OrangeHRM_home_page() {
        driver.get("https://opensource-demo.orangehrmlive.com/");
        throw new cucumber.api.PendingException();
    }

    @Then("Verify logo is present")
    public void verify_logo_is_present() {
       boolean status= driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img")).isDisplayed();
        Assert.assertEquals(true,status);

        throw new cucumber.api.PendingException();
    }

    @And("close browser")
    public void close_browser() {
         driver.quit();
        throw new cucumber.api.PendingException();
    }

}
