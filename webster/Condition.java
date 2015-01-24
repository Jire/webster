package webster;

@FunctionalInterface
public interface Condition<R> {

	R satisfy(Webster webster);

}