package webster;

public final class By {

	static By get(org.openqa.selenium.By by) {
		return new By(by);
	}

	private final org.openqa.selenium.By by;

	private By(org.openqa.selenium.By by) {
		this.by = by;
	}

	org.openqa.selenium.By by() {
		return by;
	}

	@Override
	public String toString() {
		return by.toString();
	}

	public static By id(String id) {
		return get(org.openqa.selenium.By.id(id));
	}

	public static By name(String name) {
		return get(org.openqa.selenium.By.name(name));
	}

	public static By tag(String tag) {
		return get(org.openqa.selenium.By.tagName(tag));
	}

	public static By linkText(String text) {
		return get(org.openqa.selenium.By.linkText(text));
	}

	public static By cssClass(String cssClass) {
		return get(org.openqa.selenium.By.cssSelector(cssClass));
	}

	public static By cssSelector(String cssSelector) {
		return get(org.openqa.selenium.By.cssSelector(cssSelector));
	}

	public static By xpath(String xpath) {
		return get(org.openqa.selenium.By.xpath(xpath));
	}

}