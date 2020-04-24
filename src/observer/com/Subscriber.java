package observer.com;

public class Subscriber implements Listener {
	
	private String name;
	private Channel topic; // this will be a concrete emailtopic....
	
	public Subscriber(String name) {
		this.name=name;
	}

	@Override
	public void update() {
		System.out.println(this.name+" updated, new message:  "+topic.getLatestVersion(this));
	}

	@Override
	public void setSubject(Channel sub) {
		this.topic= sub;	
	}

}
