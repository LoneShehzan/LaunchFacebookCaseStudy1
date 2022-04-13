package LaunchFB;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class PracticeTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver",
				"F:\\DXC Selenium Automation Class\\LaunchFacebookByMsEdge\\MicrosoftEdgeJars\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.quit();

	}

}
