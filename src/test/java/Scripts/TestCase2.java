package Scripts;

import org.testng.annotations.Test;

import POM.DownloadInvoicePage;
import POM.SkillraryHomepage;
import POM.demoSkillraryPage;
import genericLibrary.Baseclass;

public class TestCase2 extends Baseclass{
	
	@Test
	public void tc2() throws Throwable
	{
		SkillraryHomepage s = new SkillraryHomepage(driver);
		s.gearsbtn();
		s.demoapp();
		utilities.childBrowser(driver);
		demoSkillraryPage ds = new demoSkillraryPage(driver);
		ds.feedbackButton();
		Thread.sleep(3000);
		DownloadInvoicePage dI= new DownloadInvoicePage(driver);
	//	Thread.sleep(3000);
		dI.downloadInvoiceWebElement();
		}

}
