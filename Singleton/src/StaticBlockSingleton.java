/*	Static block initialization : similar to eager initialization except that instance is created
in static block that provide option for exception handling.
*/
public class StaticBlockSingleton {
	private static StaticBlockSingleton instance;
	
	private StaticBlockSingleton() {}
	
	static {
		try {
			instance=new StaticBlockSingleton();
		}
		catch(Exception e) {
			throw new RuntimeException("Exception occured in creating singleton instance");
		}
	}
	
	public static StaticBlockSingleton getInstance () {
		return instance;
	}
}
