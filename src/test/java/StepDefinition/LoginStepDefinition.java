package StepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;


public class LoginStepDefinition {
    WebDriver driver;

    @Given("open the browser")
    public void open_the_Browser()
    {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
    }
    @When("open the Amazon url")
    public void open_the_amazon_url()
    {
        driver.get("https://www.amazon.ca/");
    }
    @And("verify the Homepage Title")
    public void verify_the_Homepage_Title()
    {
        String ActualTitle=driver.getTitle();
        String ExpectedTitle="Amazon.ca: Low Prices – Fast Shipping – Millions of Items";
        Assert.assertEquals(ExpectedTitle,ActualTitle);
        System.out.println("Title is True");

    }
    @Then("user click on signin button")
public void user_click_on_signin_button()
    {
WebElement signin=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
signin.click();
    }
@Then("user click on create amazon account")
    public void user_click_on_create_amazon_account()
{
WebElement CreateAmazonAcc=driver.findElement(By.id("createAccountSubmit"));
CreateAmazonAcc.click();
}
@Then("verify amazon registration page")
    public void  verify_amazon_registration_page()
{
String ActualTitle=driver.getTitle();
String ExpectedTitle="Amazon Registration";
    Assert.assertEquals(ExpectedTitle,ActualTitle);
System.out.println("Registration Page title is True");
}
@And("user enter all registration details")
    public void user_enter_all_registration_details() throws InterruptedException {
    Thread.sleep(2000);
driver.findElement(By.id("ap_customer_name")).sendKeys("abc");;
driver.findElement(By.id("ap_email")).sendKeys("abc@gmail.com");
driver.findElement(By.id("ap_password")).sendKeys("abc12345");
driver.findElement(By.id("ap_password_check")).sendKeys("abc12345");
driver.findElement(By.id("continue")).click();
}

@Then("back to homepage")
public void back_to_homepage()
{
 driver.navigate().to("https://www.amazon.ca");
 driver.quit();
}
}