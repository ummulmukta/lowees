import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.common.CrosBrowsserBase;

public class CrossBrowserImplement extends CrosBrowsserBase {
	WebDriver driver;
	
	@Test
	public void testone() {
		driver=getBrowser("firefox",driver);
		
		
		
		
	}
}
