
public abstract class AircraftBuilder {
	public abstract void buildEngine();
	
	public abstract void buildWings();
	
	public abstract void buildCockpit();
	
	public void buildBathrooms() {}
	
	public abstract Aircraft getResult();
}
