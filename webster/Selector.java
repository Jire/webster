package webster;

public interface Selector {

	void byIndex(int index);
	
	void byText(String text);
	
	void byValue(String value);
	
	void deselectAll();
	
}