package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import java.time.Duration;

public class bookingSteps {
 WebDriver driver;


 @Before
 public void setUp() {
  WebDriverManager.chromedriver().setup();
  ChromeOptions options = new ChromeOptions();
  options.addArguments("disable-notifications");
  driver = new ChromeDriver(options);
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 }

 @After
 public void tearDown() throws InterruptedException {
  if (driver != null) {
   Thread.sleep(2000);

   driver.quit();
  }
 }

 @Given("I am on the spicejet homepage")
 public void i_am_on_the_spicejet_homepage() {
  driver.get("https://www.spicejet.com/");
 }

// @Given("I am on the spicejet homepage")
// public void i_am_on_the_spicejet_homepage() {
//  WebDriverManager.chromedriver().setup();
//  ChromeOptions options = new ChromeOptions();
//  options.addArguments("--remote-allow-origins=*");
//  driver = new ChromeDriver(options);
//  driver.manage().window().maximize();
//  driver.get("https://www.spicejet.com/");
////  WebDriverManager.chromedriver().setup();
////  ChromeOptions options = new ChromeOptions();
////  options.addArguments("disable-notifications");
////  driver = new ChromeDriver(options);
////  driver.manage().window().maximize();
////  driver.get("https://www.spicejet.com/");
//  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
////        WebDriver driver=new ChromeDriver();
////        driver.manage().window().maximize();
////        driver.get("https://www.spicejet.com/");
// }
    @When("I enter origin")
    public void i_enter_origin() throws InterruptedException {
     driver.findElement(By.xpath("//div[text()='round trip']")).click();
     Thread.sleep(2000);
     driver.findElement(By.xpath("//div[text()='From']")).click();
     Thread.sleep(2000);
     driver.findElement(By.xpath("//div[text()='Aurangabad']")).click();
     Thread.sleep(2000);
    }
    @When("I enter the destination")
    public void i_enter_the_destination() throws InterruptedException {
     driver.findElement(By.xpath("//div[text()='To']")).click();
     Thread.sleep(5000);
     driver.findElement(By.xpath("//div[text()='To']//parent::div/following-sibling::div/input")).sendKeys("Chennai");
     Thread.sleep(2000);
    }
 @When("I select the depature date")
 public void i_select_the_depature_date() throws InterruptedException {
  driver.findElement(By.xpath("//div[text()='Departure Date']"));
  // wait.until(ExpectedConditions.elementToBeClickable(departureDate)).click();

  ////div[text()='Departure Date']//following-sibling::div//*[name()='svg']
  Thread.sleep(2000);
   driver.findElement(By.xpath("(.//div[@class='css-1dbjc4n r-6koalj r-18u37iz r-d0pm55'])[3]/div[4]"));
 // wait.until(ExpectedConditions.elementToBeClickable(date)).click();
  Thread.sleep(2000);
 }

 @When("I select the return date")
 public void i_select_the_return_date() throws InterruptedException {
  driver.findElement(By.xpath("//div[text()='Return Date']")).click();
  ///div[text()='Return Date']//following-sibling::div//*[name()='svg']
  Thread.sleep(2000);
  driver.findElement(By.xpath("(.//div[@class='css-1dbjc4n r-6koalj r-18u37iz r-d0pm55'])[8]/div[6]")).click();
  Thread.sleep(2000);

 }

 @When("I select the number of passengers")
 public void i_select_the_number_of_passengers() throws InterruptedException {
  driver.findElement(By.xpath("//div[text()='Passengers']")).click();
  Thread.sleep(2000);
  driver.findElement(By.xpath("//div[@class='r-1awozwy r-19m6qjp r-y47klf r-1loqt21 r-eu3ka r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr r-1aockid css-1dbjc4n']")).click();
  Thread.sleep(2000);

 }

 @When("I select the currency")
 public void i_select_the_currency() throws InterruptedException {
  driver.findElement(By.xpath("//div[text()='Currency']")).click();
  Thread.sleep(2000);
  driver.findElement(By.xpath("//div[text()='USD']")).click();
  Thread.sleep(2000);

 }

 @Then("I click on the search flight button")
 public void i_click_on_the_search_flight_button() throws InterruptedException {
  driver.findElement(By.xpath("//div[text()='Search Flight']")).click();
  Thread.sleep(2000);
 }
}

