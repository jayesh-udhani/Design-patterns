// Thread safe singleton class using synchronized keyword

public class ThreadSafeSingleton {

	public static ThreadSafeSingleton instance;
	
	private ThreadSafeSingleton () {}
	
	public static synchronized ThreadSafeSingleton getInstance() {
		if(instance == null)
			instance = new ThreadSafeSingleton();
		return instance;
	}
}
