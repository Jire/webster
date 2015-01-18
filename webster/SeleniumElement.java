package webster;

import java.util.ArrayList;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

final class SeleniumElement implements Element {

	static Element get(WebElement element) {
		return new SeleniumElement(element);
	}

	private final WebElement element;

	private SeleniumElement(WebElement element) {
		this.element = element;
	}

	@Override
	public Element find(By by) {
		return get(element.findElement(by.by()));
	}

	@Override
	public Elements findAll(By by) {
		Elements elements = Elements.get(new ArrayList<>());
		element.findElements(by.by()).stream()
				.forEach(e -> elements.add(SeleniumElement.get(e)));
		return elements;
	}

	@Override
	public Dimension size() {
		org.openqa.selenium.Dimension dimension = element.getSize();
		return Dimension.of(dimension.getWidth(), dimension.getHeight());
	}

	@Override
	public Position position() {
		Point point = element.getLocation();
		return Position.of(point.getX(), point.getY());
	}

	@Override
	public boolean displayed() {
		return element.isDisplayed();
	}

	@Override
	public boolean enabled() {
		return element.isEnabled();
	}

	@Override
	public boolean selected() {
		return element.isSelected();
	}

	@Override
	public void click() {
		element.click();
	}

	@Override
	public void submit() {
		element.submit();
	}

	@Override
	public void clear() {
		element.clear();
	}

	@Override
	public void type(String payload) {
		element.sendKeys(payload);
	}

	@Override
	public String tag() {
		return element.getTagName();
	}

	@Override
	public String text() {
		return element.getText();
	}

	@Override
	public String attributeOf(String name) {
		return element.getAttribute(name);
	}

	@Override
	public String cssValueOf(String name) {
		return element.getCssValue(name);
	}

}