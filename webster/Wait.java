package webster;

public interface Wait {

	Element untilClickable(By by);

	Element untilVisible(By by);

	Alert untilAlerted();

}