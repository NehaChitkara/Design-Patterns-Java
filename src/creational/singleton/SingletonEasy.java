package creational.singleton;


public class SingletonEasy {
	private static SingletonEasy instance = new SingletonEasy();

	private SingletonEasy() {
	}

	public static SingletonEasy getInstance() {
		return instance;
	}
}
