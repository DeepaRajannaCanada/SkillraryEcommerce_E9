package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPAge {
	@FindBy(xpath="//i[@class='fa fa-bars']")
	private WebElement plusIcon;
	
	@FindBy(xpath="//button[text()=' Add to Cart']")
	private WebElement addtocart;
	
	public AddToCartPAge(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getPlusIcon() {
		return plusIcon;
	}
	public void addCart()
	{
		addtocart.click();
	}
	

}
