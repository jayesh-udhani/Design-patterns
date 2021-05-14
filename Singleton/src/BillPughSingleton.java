/* Bill Pugh Singleton implementation (Most commonly used production code)
When BillPughSingleton class is loaded in memory, SingletonHelper is not loaded.
Only when someone calls getInstance method, this class gets loaded and creates the singleton object
*/
public class BillPughSingleton {
	private BillPughSingleton() {
		System.out.println("Hey");
	}
	
	private static class SingletonHelper {
		// Making below field as static and final is compulsory
		private static final BillPughSingleton instance = new BillPughSingleton();
		// Doubt : Why do we need above field as private ?
	}
	
	public static BillPughSingleton getInstance() {
		return SingletonHelper.instance;
	}
	
	public static void main(String[] args)
	{
		BillPughSingleton b1=BillPughSingleton.getInstance();
		BillPughSingleton b2=BillPughSingleton.getInstance();
	}
}
