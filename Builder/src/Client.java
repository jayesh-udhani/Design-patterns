
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AircraftBuilder aircraftBuilder1=new Boeing747Builder();
		AircraftBuilder aircraftBuilder2=new F16Builder();
		
		Director director = new Director(aircraftBuilder1);
		director.buildAircraft(true);
		Aircraft boeing747 = director.getAircraft();
		
		director = new Director(aircraftBuilder2);
		director.buildAircraft(false);
		Aircraft f16 = director.getAircraft();
		
		System.out.println("Boeing 747 build");
		System.out.println(boeing747.getEngine());
		System.out.println(boeing747.getCockpit());
		System.out.println(boeing747.getWings());
		System.out.println(boeing747.getBathrooms());
		
		System.out.println("F16 build");
		System.out.println(f16.getEngine());
		System.out.println(f16.getCockpit());
		System.out.println(f16.getWings());
		
	}

}
