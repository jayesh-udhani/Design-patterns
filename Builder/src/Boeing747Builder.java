
public class Boeing747Builder extends AircraftBuilder {

	private Boeing747 boeing747;
	
	public Boeing747Builder() {
		// TODO Auto-generated constructor stub
		boeing747 = new Boeing747();
	}
	
	@Override
	public void buildEngine() {
		// TODO Auto-generated method stub
		boeing747.setEngine("Engine of Boeing 747");
	}

	@Override
	public void buildWings() {
		// TODO Auto-generated method stub
		boeing747.setWings("Wings of Boeing 747");
	}

	@Override
	public void buildCockpit() {
		// TODO Auto-generated method stub
		boeing747.setCockpit("Cockpit of Boeing 747");
	}

	@Override
	public void buildBathrooms() {
		// TODO Auto-generated method stub
		boeing747.setBathrooms("Bathrooms of Boeing 747");
	}
	
	public Aircraft getResult() {
		return boeing747;
	}

}
