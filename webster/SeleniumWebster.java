package webster;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;

final class SeleniumWebster implements Webster {

	static SeleniumWebster get(WebDriver driver) {
		return new SeleniumWebster(driver);
	}

	private final WebDriver driver;

	private SeleniumWebster(WebDriver driver) {
		this.driver = driver;
	}

	@Override
	public void visit(String url) {
		driver.get(url);
	}

	@Override
	public void quit() {
		driver.quit();
	}

	@Override
	public void close() {
		driver.close();
	}

	@Override
	public Element find(By by) {
		return SeleniumElement.get(driver.findElement(by.by()));
	}

	@Override
	public Elements findAll(By by) {
		Elements elements = Elements.get(new ArrayList<>());
		driver.findElements(by.by()).stream()
				.forEach(e -> elements.add(SeleniumElement.get(e)));
		return elements;
	}

	@Override
	public String title() {
		return driver.getTitle();
	}

	@Override
	public String url() {
		return driver.getCurrentUrl();
	}

	@Override
	public String source() {
		return driver.getPageSource();
	}

}