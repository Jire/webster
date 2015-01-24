package webster;

abstract class AbstractWait implements Wait {

	private final Webster webster;
	private final long seconds;

	AbstractWait(Webster webster, long seconds) {
		this.webster = webster;
		this.seconds = seconds;
	}

	Webster webster() {
		return webster;
	}

	long seconds() {
		return seconds;
	}

}