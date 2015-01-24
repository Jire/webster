package webster;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public final class Websters {

	public static Webster selenium(WebDriver driver) {
		return SeleniumWebster.get(driver);
	}

	public static Webster basic() {
		return selenium(new HtmlUnitDriver());
	}

	public static Webster chrome() {
		return selenium(new ChromeDriver());
	}

	public static Webster firefox() {
		return selenium(new FirefoxDriver());
	}

	public static Webster phantom() {
		return selenium(new PhantomJSDriver());
	}
	
}