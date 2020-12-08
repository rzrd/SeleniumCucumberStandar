package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import utilities.Base;
import utilities.ClassHelp;
import utilities.Data;

public class SwitchToPage extends Base {

	public SwitchToPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	Data data = new Data();
	String mainUrl = ClassHelp.getEnv("url");

	By switchToAnchor = By.xpath("//a[@href='SwitchTo.html'][contains(.,'SwitchTo')]");
	By alertAnchor = By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/ul/li[1]");
	By showAlertButton = By.xpath("//button[contains(.,'click the button to display an')]");
//	By Field = By.xpath("");

	public void navigateToSwitchTo() throws InterruptedException {
		Actions action = new Actions(driver);
		WebElement switchToHover = driver.findElement(switchToAnchor);
		action.moveToElement(switchToHover).perform();

		action.moveToElement(driver.findElement(alertAnchor)).perform();

		String webtablePageUrl = mainUrl + "Alerts.html";
		driver.get(webtablePageUrl);
		waitPageLoadUrl(webtablePageUrl);
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, webtablePageUrl);
	}

	public void showAlert() throws InterruptedException {
		click(showAlertButton);
	}

	public void clickAlert() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 3000);
		wait.until(ExpectedConditions.alertIsPresent());

		String expectedAlertMessage = "I am an alert box!";
		String actualAlertMessage = driver.switchTo().alert().getText();
		Assert.assertEquals(actualAlertMessage, expectedAlertMessage);

		driver.switchTo().alert().accept();
	}
}
