package stepDefinitions;

import java.util.Properties;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.AddcustomerPage;
import pageObjects.LoginPage;
import pageObjects.SearchCustomerPage;

public class BaseClass {
	

	public static Properties prop;
	public String workingDir;
	public WebDriver driver;
	public LoginPage lp;
	public AddcustomerPage addCust;
	public SearchCustomerPage searchCust;
	public static Logger logger;
	public Properties configProp;
	


		    public static WebElement getExplicitWait(WebElement element, WebDriver driver) {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(element));
			return element1;
		    }

		    public boolean isElementPresent(WebElement element, WebDriver driver, long timeout) {
			try {
				WebDriverWait wait = new WebDriverWait(driver, timeout);
				element = wait.until(ExpectedConditions.visibilityOf(element));
				return true;
			} catch (Exception e) {
				return false;
			}
		}

			public WebDriver getDriver() {
				// TODO Auto-generated method stub
				return driver;
			}
		
	
	
	//Created for generating random string for Unique email
	public static String randomestring() {
		String generatedString1 = RandomStringUtils.randomAlphabetic(5);
		return (generatedString1);
	}
	}


