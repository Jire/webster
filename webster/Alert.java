package webster;

public interface Alert {

	void accept();

	void dismiss();

	void type(String payload);

	String text();

}