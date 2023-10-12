package POM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {
	//declaration
	//https://demoapp.skillrary.com/product.php?product=java
	@FindBy(xpath =("//i[@class='fa fa-plus']")) //plus symbol address
	private WebElement plusIcon;

	//address of add to cart
	@FindBy(xpath = ("//button[@ondblclick='addtocart()']"))
	private WebElement addtocartbtn;

	//initialization
	public AddToCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getPlusIcon() { //its a double click operation so used getter method
		return plusIcon;
	}

	public void addtoCart()
	{
		addtocartbtn.click();
	}
}
