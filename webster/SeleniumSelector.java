package webster;

import org.openqa.selenium.support.ui.Select;

final class SeleniumSelector implements Selector {

	static SeleniumSelector get(Select select) {
		return new SeleniumSelector(select);
	}

	private final Select select;

	private SeleniumSelector(Select select) {
		this.select = select;
	}

	@Override
	public void byIndex(int index) {
		select.selectByIndex(index);
	}

	@Override
	public void byText(String text) {
		select.selectByVisibleText(text);
	}

	@Override
	public void byValue(String value) {
		select.selectByValue(value);
	}

	@Override
	public void deselectAll() {
		select.deselectAll();
	}

}