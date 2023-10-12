package Scripts;

import org.testng.annotations.Test;

import GenericLibrary.BaseClass;
import POM.DemoSkillraryPage;
import POM.SkillraryHomePage;
import POM.DownloadInvoicePage;

public class TestCase2 extends BaseClass{
	@Test
	public void tc2()
	{
		SkillraryHomePage s= new SkillraryHomePage(driver);
		s.gearsButton();
		s.skillrarydemoappWebElement();
		utiles.childBrowser(driver);
		DemoSkillraryPage ds=new DemoSkillraryPage(driver);
		ds.feedbackButton();
		DownloadInvoicePage di=new DownloadInvoicePage(driver);
		di.downloadInvoiceWebElement();
	}

}
