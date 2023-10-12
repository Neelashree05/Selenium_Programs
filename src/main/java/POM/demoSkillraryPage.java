package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class demoSkillraryPage {

	//declaration
	@FindBy(xpath ="//a[text()='COURSE']")
	private WebElement coursebtn;

	@FindBy(xpath="//select[@name='addresstype']")
	private WebElement searchdp;

	@FindBy(xpath="//a[text()='FEEDBACK']")
	private WebElement feedbackbtn;

	//initialization
	public demoSkillraryPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	//utilization
	public WebElement getCoursebtn()
	{
		return coursebtn;
	}

	public WebElement getSearchDd()
	{
		return searchdp;
	}
	public void feedbackButton()
	{
		feedbackbtn.click();
	}
}
