// Lazy initialization (It isn't thread safe)

public class Singleton {
	// object instance should be private and static i.e. shared among all the objects of this class
	private static Singleton instance;
	
	// Constructor should be private to restrict invoking it from outside
	private Singleton()
	{
		System.out.println("Singleton object created for the very first time.");
	}
	
	// getInstance method should be static to invoke it without an object
	public static Singleton getInstance()
	{
		if(instance==null)
			instance=new Singleton();
		return instance;
	}
}
