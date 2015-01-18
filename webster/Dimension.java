package webster;

public final class Dimension {

	public static Dimension of(int width, int height) {
		return new Dimension(width, height);
	}

	private final int width;
	private final int height;

	private Dimension(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int width() {
		return width;
	}

	public int height() {
		return height;
	}

}