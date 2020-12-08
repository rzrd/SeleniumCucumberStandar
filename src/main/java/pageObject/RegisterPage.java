package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import utilities.Base;
import utilities.ClassHelp;
import utilities.Data;

public class RegisterPage extends Base {
	
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	Data data = new Data();
	String mainUrl = ClassHelp.getEnv("url");
	By skipSignInButton	= By.xpath("//button[@type='button'][contains(.,'Skip Sign In')]");
	By firstnameField = By.xpath("//input[@placeholder='First Name']");
	By lastnameField = By.xpath("//input[@placeholder='Last Name']");
	By adressField = By.xpath("//textarea[@ng-model='Adress']");
	By emailField = By.xpath("//input[@type='email']");
	By phoneField = By.xpath("//input[@type='tel']");
	By genderRadioButton = By.xpath("(//input[contains(@value,'Male')])[1]");
	By hobbyCheckbox = By.xpath("(//input[@type='checkbox'])");
	By languageField = By.xpath("//div[@id='msdd']");
	By selectLanguage = By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li");
	By skillField = By.xpath("//select[@id='Skills']");
	By countryField = By.xpath("//select[@id='countries']");
	By country2Field = By.xpath("//span[@role='combobox']");
	By country2Li = By.xpath("//*[@id=\"select2-country-results\"]/li");
	By yearField = By.xpath("//select[@placeholder='Year']");
	By monthField = By.xpath("//select[@placeholder='Month']");
	By dayField = By.xpath("//select[@placeholder='Day']");
	By firstPassField = By.xpath("//input[@id='firstpassword']");
	By confirmPassField = By.xpath("//input[contains(@id,'secondpassword')]");
	By fotoUpload = By.xpath("//input[@id='imagesrc']");
	By submitButton = By.xpath("//button[@id='submitbtn']");
	
	public void goToHomepage() throws InterruptedException {
		String url = data.getUrl();
		driver.get(url);
		waitPageLoadUrl(url);
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, url);
	}
	
	public void clickSkipSignIn() throws InterruptedException {
		click(skipSignInButton);
	}
	
	public void navigateToRegisterPage() throws InterruptedException {
		String registerPageUrl = mainUrl + "Register.html";
		driver.get(registerPageUrl);
		waitPageLoadUrl(registerPageUrl);
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, registerPageUrl);
	}
	
	public void fillAllTheField() throws InterruptedException {
		String firstname = "namadepan";
		inputField(firstnameField,firstname);
		
		String lastname = "namabelakang";
		inputField(lastnameField,lastname);
		
		String address = "jalan buntu";
		inputField(adressField,address);
		
		String phone = ClassHelp.randomNum(1000000000, 2147483646);
		String email = phone + "@example.com";
		inputField(emailField,email);
		inputField(phoneField,phone);
		
		click(genderRadioButton);
		
		selectHobbies();
		
		Select selectSkill = new Select(driver.findElement(skillField));
		String skill = "Adobe Photoshop";
		selectSkill.selectByVisibleText(skill);
		
		Select selectCountry = new Select(driver.findElement(countryField));
		String country = "Austria";
		selectCountry.selectByVisibleText(country);
		
		selectCountry2();
		
		inputDate();
		
		String password = "1Password";
		inputField(firstPassField,password);
		
		String confirmPassword = "1Password";
		inputField(confirmPassField,confirmPassword);
		
		selectLanguage();
		
		uploadPhoto();
	}
	
	public void selectHobbies() throws InterruptedException {
		List<WebElement> hobbiesElement = driver.findElements(hobbyCheckbox);
		for(WebElement e : hobbiesElement) {
			e.click();
		}
	}
	
	public void selectLanguage() throws InterruptedException {
		String language = "Arabic";
		driver.findElement(languageField).click();
		List<WebElement> languageList = driver.findElements(selectLanguage);
		for (WebElement li : languageList) {
			WebElement a = li.findElement(By.tagName("a"));
			if (a.getAttribute("innerHTML").equalsIgnoreCase(language)) {
				li.click();
				break;
			}
		}
	}

	public void selectCountry2() throws InterruptedException {
		String country2 = "Japan";
		driver.findElement(country2Field).click();
		List<WebElement> countryList2 = driver.findElements(country2Li);
		for (WebElement li : countryList2) {
			if (li.getText().equalsIgnoreCase(country2)) {
				li.click();
				break;
			}
		}
	}
	
	public void inputDate() throws InterruptedException {
		Select selectYear = new Select(driver.findElement(yearField));
		String year = "1945";
		selectYear.selectByVisibleText(year);
		
		Select selectMonth = new Select(driver.findElement(monthField));
		String month = "August";
		selectMonth.selectByVisibleText(month);
		
		Select selectDay = new Select(driver.findElement(dayField));
		String day = "17";
		selectDay.selectByVisibleText(day);
	}
	
	public void uploadPhoto() throws InterruptedException {
		WebElement uploadElement = driver.findElement(fotoUpload);
		String pathFile = System.getProperty("user.dir")+"/src/test/resources/images.jpeg";
		uploadElement.sendKeys(pathFile);
	}
	
	public void clickSubmit() throws InterruptedException {
		click(submitButton);
	}
	
}
