
public class Director {
	
	private AircraftBuilder aircraftBuilder;
	
	public Director(AircraftBuilder aircraftBuilder) {
		this.aircraftBuilder=aircraftBuilder;
	}
	
	public Aircraft getAircraft()
	{
		return aircraftBuilder.getResult();
	}
	
	public void buildAircraft(boolean hasPassengers)
	{
		aircraftBuilder.buildEngine();
		aircraftBuilder.buildCockpit();
		aircraftBuilder.buildWings();
		
		if(hasPassengers)
			aircraftBuilder.buildBathrooms();
	}
	
}
