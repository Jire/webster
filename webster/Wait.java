package webster;

public interface Wait {

	<R> R until(Condition<R> condition);

	Element untilClickable(By by);

	Element untilVisible(By by);

	Alert untilAlerted();

}