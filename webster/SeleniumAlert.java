package webster;

final class SeleniumAlert implements Alert {

	static SeleniumAlert get(org.openqa.selenium.Alert alert) {
		return new SeleniumAlert(alert);
	}

	private final org.openqa.selenium.Alert alert;

	private SeleniumAlert(org.openqa.selenium.Alert alert) {
		this.alert = alert;
	}

	@Override
	public void accept() {
		alert.accept();
	}

	@Override
	public void dismiss() {
		alert.dismiss();
	}

	@Override
	public void type(String payload) {
		alert.sendKeys(payload);
	}

	@Override
	public String text() {
		return alert.getText();
	}

}