
public class F16 extends Aircraft {

	private String engine;
	private String wings;
	private String cockpit;
	
	public String getEngine() {
		return engine;
	}
	
	@Override
	public void setEngine(String engine) {
		// TODO Auto-generated method stub
		this.engine=engine;
	}

	public String getWings() {
		return wings;
	}
	
	@Override
	public void setWings(String wings) {
		// TODO Auto-generated method stub
		this.wings=wings;
	}

	public String getCockpit() {
		return cockpit;
	}
	
	@Override
	public void setCockpit(String cockpit) {
		// TODO Auto-generated method stub
		this.cockpit=cockpit;
	}

}
