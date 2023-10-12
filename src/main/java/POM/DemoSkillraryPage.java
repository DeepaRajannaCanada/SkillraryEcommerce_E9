package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoSkillraryPage {
	@FindBy(xpath="//a[@id='course']")
	private WebElement coursebtn;

	
	@FindBy(name="addresstype")
	private WebElement selectDd;
	
	@FindBy(xpath="//a[text()='FEEDBACK']")
	private WebElement feedbackbtn;
	
	public DemoSkillraryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getCoursebtn() {
		return coursebtn;
	}

	public WebElement getSelectDd() {
		return selectDd;
	}
	
	public void feedbackButton()
	{
		feedbackbtn.click();
	}

	
	
	

}
