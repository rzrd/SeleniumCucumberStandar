package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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

public class WebTablePage extends Base {

	public WebTablePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	Data data = new Data();
	String mainUrl = ClassHelp.getEnv("url");

	By editButton = By.xpath("//button[@class='btn btn-xs btn-custom']");
	By firstRow = By.xpath("/html/body/section/div[1]/div/div[3]/div[1]/div[1]/div[2]/div/div[1]");
	By emailField = By.xpath("(//input[@type='text'])[1]");
	By cancelButton = By.xpath("//button[@class='btn btn-danger']");
	By trashButton = By.xpath("//del-click/button[@class='btn btn-danger btn-xs']");
	By deleteButton = By.xpath("//li/button[@class='btn btn-danger btn-xs']");
	By newEmail = By.xpath("(//div[@class='ui-grid-cell-contents ng-binding ng-scope'])[1]");

	public void navigateToWebtablePage() throws InterruptedException {
		String webtablePageUrl = mainUrl + "WebTable.html";
		driver.get(webtablePageUrl);
		waitPageLoadUrl(webtablePageUrl);
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, webtablePageUrl);
	}

	public void editRecord() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(firstRow)));
		WebElement firstRowElement = driver.findElement(firstRow);

		Actions action = new Actions(driver);
		WebElement editButtonElement = firstRowElement.findElement(editButton);
		action.doubleClick(editButtonElement).perform();

		String emailForAssertion = readValue(emailField);
		data.setEmail(emailForAssertion);

		WebElement editEmailElement = firstRowElement.findElement(emailField);
		editEmailElement.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		editEmailElement.sendKeys("email@baru.com");

		firstRowElement.findElement(cancelButton).click();
	}

	public void deleteRecord() throws InterruptedException {
		Actions action = new Actions(driver);
		WebElement firstRowElement = driver.findElement(firstRow);
		WebElement trashButtonElement = firstRowElement.findElement(trashButton);
		action.contextClick(trashButtonElement).perform();

		WebElement deleteButtonElement = firstRowElement.findElement(deleteButton);
		deleteButtonElement.click();
		WebDriverWait wait = new WebDriverWait(driver, 3000);
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();

		// check if record already deleted
		String actualEmail = data.getEmail();
		String expectedEmail = driver.findElement(newEmail).getText();
		Assert.assertNotEquals(actualEmail, expectedEmail);
	}
}
