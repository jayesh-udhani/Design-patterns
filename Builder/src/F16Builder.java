
public class F16Builder extends AircraftBuilder {

	private F16 f16;
	
	public F16Builder() {
		// TODO Auto-generated constructor stub
		f16 = new F16();
	}
	
	@Override
	public void buildEngine() {
		// TODO Auto-generated method stub
		f16.setEngine("Engine of F16");
	}

	@Override
	public void buildWings() {
		// TODO Auto-generated method stub
		f16.setWings("Wings of F16");
	}

	@Override
	public void buildCockpit() {
		// TODO Auto-generated method stub
		f16.setCockpit("Cockpit of F16");
	}
	
	public Aircraft getResult() {
		return f16;
	}

}
