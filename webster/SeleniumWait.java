package webster;

import static org.openqa.selenium.support.ui.ExpectedConditions.alertIsPresent;
import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;
import static webster.SeleniumWebster.driverOf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

final class SeleniumWait extends AbstractWait {

	static SeleniumWait get(Webster webster, long seconds) {
		return new SeleniumWait(webster, seconds);
	}

	private final WebDriverWait wait;

	private SeleniumWait(Webster webster, long seconds) {
		super(webster, seconds);
		this.wait = new WebDriverWait(driverOf(webster), seconds);
	}

	@Override
	public <R> R until(Condition<R> condition) {
		return wait.until(new ExpectedCondition<R>() {
			@Override
			public R apply(WebDriver driver) {
				return condition.satisfy(Websters.selenium(driver));
			}
		});
	}

	@Override
	public Element untilClickable(By by) {
		return SeleniumElement.get(wait.until(elementToBeClickable(by.by())));
	}

	@Override
	public Element untilVisible(By by) {
		return SeleniumElement.get(wait.until(visibilityOfElementLocated(by
				.by())));
	}

	@Override
	public Alert untilAlerted() {
		return SeleniumAlert.get(wait.until(alertIsPresent()));
	}

}