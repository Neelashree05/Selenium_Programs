package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {
	//https://demoapp.skillrary.com/category.php?category=testing
	//Declaration
	@FindBy(xpath = "(//i[@class='fa fa-facebook'])[2]")
	private  WebElement fbIcon;

	//initialization
	public TestingPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	//Declaration
	public void FbWebElement()
	{
		
		fbIcon.click();
	}
	public WebElement getFBIcon()
	{
		return fbIcon; 
	}
}
