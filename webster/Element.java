package webster;

public interface Element extends ElementFinder {

	Dimension size();

	Position position();

	boolean displayed();

	boolean enabled();

	boolean selected();

	void click();

	void submit();

	void clear();

	void type(String payload);

	String tag();

	String text();

	String attributeOf(String name);

	String cssValueOf(String name);

}