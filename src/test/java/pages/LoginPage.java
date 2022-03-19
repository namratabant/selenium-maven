package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import testcases.BaseClass;

public class LoginPage {
	
	 ExtentTest test = BaseClass.test;
	
	WebDriver driver = BaseClass.driver;
	
	
//========Web Element================================
	@FindBy(linkText = "Log in")
	WebElement LoginLink;
	
	@FindBy(name = "user_login")
    WebElement UserName;

	@FindBy(id = "password")
    WebElement Password;

	@FindBy(name= "btn_login")
    WebElement LoginBtn;

	@FindBy(className = "rememberMe" )
    WebElement RememberMe;
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
//=====================Functions=========================
	public void LoginFunction(String UserNameVal,String PasswordVal) {
        
		LoginLink.click(); 
		test.log(LogStatus.PASS, "Click on Login Link","login link clicked successfully");
		
		UserName.sendKeys(UserNameVal);
		test.log(LogStatus.PASS,"Enter UserName","Name Entered successfully");
		
		Password.sendKeys(PasswordVal);
		test.log(LogStatus.PASS,"","Password Entered successfully");
		
		RememberMe.click();
		test.log(LogStatus.PASS,"Click on Remember Me"," clicked successfully");
		
		LoginBtn.click();
		test.log(LogStatus.PASS,"Click on Login button","login button clicked successfully");
		
	}
	public void UICheck() {
	// UI =user interface
			Assert.assertTrue(UserName.isDisplayed());
	}
	
	}