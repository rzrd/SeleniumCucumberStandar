package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utilities.Base;
import utilities.ClassHelp;
import utilities.Data;

public class DragDropPage extends Base {

	public DragDropPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	Data data = new Data();
	String mainUrl = ClassHelp.getEnv("url");

	By interactionsMenu = By.xpath("//a[@href='Interactions.html'][contains(.,'Interactions')]");
	By dragDropMenu = By.xpath("//a[@data-toggle='dropdown'][contains(.,'Drag and Drop')]");
	By staticMenu = By.xpath("//a[@href='Static.html'][contains(.,'Static')]");
	By seleniumPic = By.xpath("//img[@src='selenium.png']");
	By dropArea = By.xpath("//*[@id='droparea']");
	By picOnDropArea = By.xpath("//div[@id='droparea']/img[@src='selenium.png']");

	public void navigateToDragDrop() throws InterruptedException {
		Actions action = new Actions(driver);
		WebElement interactionsHover = driver.findElement(interactionsMenu);
		action.moveToElement(interactionsHover).perform();

		WebElement dragDropHover = driver.findElement(dragDropMenu);
		action.moveToElement(dragDropHover).perform();

		WebElement staticHover = driver.findElement(staticMenu);
		action.moveToElement(staticHover).perform();

		String staticPageUrl = mainUrl + "Static.html";
		driver.get(staticPageUrl);
		waitPageLoadUrl(staticPageUrl);
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, staticPageUrl);
	}

	public void dragDropPic() throws InterruptedException {
		Actions action = new Actions(driver);
		WebElement picElement = driver.findElement(seleniumPic);
		WebElement dropAreaElement = driver.findElement(dropArea);
		action.dragAndDrop(picElement, dropAreaElement).build().perform();

		boolean isPicDropped = driver.findElements(picOnDropArea).size() != 0;
		Assert.assertTrue(isPicDropped);
	}
}
