// Eager initialization

public class EagerSingleton {
	// Using volatile is yet another way of making class thread safe.
	private static volatile EagerSingleton instance = new EagerSingleton();
	
	private EagerSingleton() {
	}
	
	public EagerSingleton getInstance() {
		return instance;
	}
}
