package stepDefinitions;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.DragDropPage;
import pageObject.RegisterPage;
import pageObject.SwitchToPage;
import pageObject.WebTablePage;
import utilities.Base;
import utilities.ClassHelp;
import utilities.Data;

public class NRItestDef {
	WebDriver driver;
	Base base = new Base();
	Data data = new Data();
	RegisterPage register = new RegisterPage(driver);
	WebTablePage webtable = new WebTablePage(driver);
	SwitchToPage switchTo = new SwitchToPage(driver);
	DragDropPage dragDrop = new DragDropPage(driver);

	@Given("Initiate browser")
	public void initiate_browser() throws Throwable {
		data.setIsHeadless(ClassHelp.getEnv("isHeadless"));
		data.setCloseBrowserEveryScenario(ClassHelp.getEnv("closeBrowser"));

		base = new Base();
		driver = base.openBrowser(ClassHelp.getEnv("browser"));
		driver.manage().window().setSize(new Dimension(1366, 768));
		System.out.println("Driver set: " + driver);
		driver.manage().window().maximize();
	}

	@Given("Open \"([^\"]*)\" URL on any browser")
	public void open_url_on_any_browser(String url) throws Throwable {
		data.setUrl("http://" + url);
		System.out.println("URL set:" + data.getUrl());
		register.goToHomepage();
	}

	@When("Click on Skip Sign in button")
	public void click_on_skip_sign_in_button() throws Throwable {
		register.clickSkipSignIn();
	}

	@When("Navigate to register page")
	public void navigate_to_register_page() throws Throwable {
		register.navigateToRegisterPage();
	}

	@When("Fill all the fields")
	public void fill_all_the_fields() throws Throwable {
		register.fillAllTheField();
	}

	@When("Click on submit button")
	public void click_on_submit_button() throws Throwable {
		register.clickSubmit();
	}

	@When("Navigate to webtable menu")
	public void navigate_to_webtable_menu() throws Throwable {
		webtable.navigateToWebtablePage();
	}

	@When("Edit, delete a record from webtable")
	public void edit_delete_a_record_from_webtable() throws Throwable {
		webtable.editRecord();
		webtable.deleteRecord();
	}

	@When("Navigate to SwitchTo")
	public void navigate_to_switch_to() throws Throwable {
		switchTo.navigateToSwitchTo();
	}

	@When("Click the button to display the alertbox")
	public void click() throws Throwable {
		switchTo.showAlert();
	}

	@When("Click on alert")
	public void click_on_alert() throws Throwable {
		switchTo.clickAlert();
	}

	@When("Navigate to Interactions->Drag and Drop->static")
	public void navigate_to_interactions_drag_and_drop_static() throws Throwable {
		dragDrop.navigateToDragDrop();
	}

	@When("Drag selenium logo")
	public void drag_selenium_logo() throws Throwable {
		dragDrop.dragDropPic();
	}

	@Then("Exit the test")
	public void exit_the_test() throws Throwable {
		System.out.println("Test finished. Thank you.");
	}
}
