package Steps;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterPageSteps {
	static WebDriver driver;

	@Given("user is on register page")
	public void user_is_on_register_page() {
		// 1.connect to the actual browser.
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\praf0\\OneDrive\\Desktop\\Automation Testing 21Oct2023\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		// 2. up casting
		driver = new ChromeDriver();

		// 3. maximize
		driver.manage().window().maximize();

		// 4. implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// 5. page load time out
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

		// 6. delete all cookies
		driver.manage().deleteAllCookies();
		// 7. open a url
		driver.get("https://demo.guru99.com/test/newtours/register.php");
	}

	@When("user enter valid firstname, lastname, phone and email")
	public void user_enter_valid_firstname_lastname_phone_and_email() {
		// find first name text box and enter value

		driver.findElement(By.name("firstName")).sendKeys("Anita");
		// find last name text box and enter value

		driver.findElement(By.name("lastName")).sendKeys("Gole");
		// find phone text box and enter value

		driver.findElement(By.name("phone")).sendKeys("90909090");
		// find email text box and enter value

		driver.findElement(By.name("userName")).sendKeys("anita@gmail.com");

	}

	@When("user enter valid address, city, state,postol code and select country")
	public void user_enter_valid_address_city_state_postol_code_and_select_country() {
		// find address text box and enter value

		driver.findElement(By.name("address1")).sendKeys("Pune");
		// find city text box and enter value

		driver.findElement(By.name("city")).sendKeys("Pune");
		// find state text box and enter value

		driver.findElement(By.name("state")).sendKeys("MH");

		// find postal code text box and enter value

		driver.findElement(By.name("postalCode")).sendKeys("112211");

		// find country drop down and select INDIA value

		WebElement selWb = driver.findElement(By.name("country"));
		Select sel = new Select(selWb);
		sel.selectByVisibleText("INDIA");

	}

	@When("user enter valid username, password, confirm password and click on submit button")
	public void user_enter_valid_username_password_confirm_password_and_click_on_submit_button() {

		// find username text box and enter value

		driver.findElement(By.name("email")).sendKeys("anita@gmail.com");
		// find password text box and enter value

		driver.findElement(By.name("password")).sendKeys("Anita@123");
		// find confirm password text box and enter value
		driver.findElement(By.name("confirmPassword")).sendKeys("Anita@123");
		// find submit button and click on it
		driver.findElement(By.name("submit")).click();
	}

	@Then("user is on register success page and validate success page url")
	public void user_is_on_register_success_page_and_validate_success_page_url() {
		// verify register success page url
		String actualUrl = driver.getCurrentUrl();
		boolean a = actualUrl.contains("sucess");

		Assert.assertEquals(a, true);
	}

	@When("user click on sign up link")
	public void user_click_on_sign_up_link() throws InterruptedException {
		// find Sign up and click on it

		driver.findElement(By.xpath("//a[text()=' sign-in ']")).click();
		Thread.sleep(4000);

	}

	@When("user enter valid username , password and click on Submit button")
	public void user_enter_valid_username_password_and_click_on_submit_button() {
		// find username text box and enter value
		driver.findElement(By.name("userName")).sendKeys("anita@gmail.com");
		// find password text box and enter value
		driver.findElement(By.name("password")).sendKeys("Anita@123");

		// find submitt button and click on it
		driver.findElement(By.name("submit")).click();

	}

	@Then("user is on login successfully page and validate url")
	public void user_is_on_login_successfully_page_and_validate_url() {
		//capture url and validate it
		String actualurl = driver.getCurrentUrl();
		boolean a = actualurl.contains("login_sucess");
		Assert.assertTrue(a);
	}

	@Then("user validate successfully keyword in login Success page")
	public void user_validate_successfully_keyword_in_login_success_page() {
		//capture success message and validate it
		String a = driver.findElement(By.xpath("//h3[text()='Login Successfully']")).getText();

		Assert.assertEquals(a, "Login Successfully");

	}

}
