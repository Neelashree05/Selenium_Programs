package Scripts;

import org.testng.annotations.Test;

import POM.SkillraryHomepage;
import POM.TestingPage;
import POM.demoSkillraryPage;
import genericLibrary.Baseclass;

public class Testcase1 extends Baseclass{
	
	
	@Test
	public void tc1() throws Throwable
	{
		SkillraryHomepage s= new SkillraryHomepage(driver);
		s.gearsbtn();
		s.demoapp();
		utilities.childBrowser(driver);
		demoSkillraryPage ds = new demoSkillraryPage(driver);
		utilities.dropDown(ds.getSearchDd(),pdata.getPropertydata("coursedd"));
		TestingPage tp = new TestingPage(driver);
	
		tp.getFBIcon();
	}
	
	

}
