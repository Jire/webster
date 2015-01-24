package webster;

public abstract class WebsterCostume implements Webster, Runnable {

	private final Webster webster;

	protected WebsterCostume(Webster webster) {
		this.webster = webster;
	}

	@Override
	public void visit(String url) {
		webster.visit(url);
	}

	@Override
	public final Element find(By by) {
		return webster.find(by);
	}

	@Override
	public final Elements findAll(By by) {
		return webster.findAll(by);
	}

	@Override
	public final void quit() {
		webster.quit();
	}

	@Override
	public final void close() {
		webster.close();
	}

	@Override
	public final String title() {
		return webster.title();
	}

	@Override
	public final String url() {
		return webster.url();
	}

	@Override
	public final String source() {
		return webster.source();
	}

	@Override
	public final Wait waitFor(long seconds) {
		return webster.waitFor(seconds);
	}

	@Override
	public final Selector select(By by) {
		return webster.select(by);
	}

}