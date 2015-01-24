package webster;

public interface Webster extends ElementFinder {

	void visit(String url);

	void quit();

	void close();

	String title();

	String url();

	String source();

	Alert alert();

	Wait waitFor(long seconds);

	Selector select(By by);

}