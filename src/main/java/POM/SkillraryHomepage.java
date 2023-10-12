package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryHomepage {
	//https://demoapp.skillrary.com/index.php
	//Declaration
	//address of gears webElement
	@FindBy(xpath = "//a[text()=' GEARS ']")
	private WebElement gearsbtn;

	//address of skillrary demo app
	@FindBy(xpath = "(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement demoapp;

	//address of search text field
	@FindBy(xpath = "(//input[@placeholder='Search for Courses'])[1]")
	private WebElement searchTf;

	//address of search icon
	@FindBy(xpath = "(//input[@value='go'])[1]")
	private WebElement searchIcon;

	//address of coockies
	@FindBy(xpath  = "//input[@value='go'])[1])")
	private WebElement coockies;

	//initialization
	public SkillraryHomepage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);	
	}
	//utilization

	public void gearsbtn() //buissness libararies is for click and send operation
	{
		gearsbtn.click();
	}

	public void demoapp()
	{
		demoapp.click();
	}
	public void searchtextFiled(String data)
	{
		searchTf.sendKeys(data);
	}
	public void searchIconWebElement()
	{
		searchIcon.click();
	}
	public void coockiesIcon()

	{
		coockies.click();
	}
}
