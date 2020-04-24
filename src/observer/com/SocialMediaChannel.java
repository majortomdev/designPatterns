package observer.com;

import java.util.ArrayList;
import java.util.List;

public class SocialMediaChannel implements Channel {

	List<Listener> listeners;
	String content;
	
	public SocialMediaChannel() {
		this.listeners = new ArrayList<>();
	}
	
	public void postMessage(String message) {
		System.out.println("Mesage posted to "+this+" : "+message);//trying to get the name of object -> jkdevstar
		this.content= message;
		notifyWatchers();
	}
	
	@Override
	public void register(Listener list1) {
		this.listeners.add(list1);
		
	}

	@Override
	public void unregister(Listener watcher) {
		if(listeners.contains(watcher)) {
			listeners.remove(watcher);
		}
		
	}

	@Override
	public void notifyWatchers() {
	       for (Listener ww : listeners) {
	             ww.update();// so for each subsciber i have, i will call update on their object.......
	        }
	}

	@Override
	public Object getLatestVersion(Listener w2) {
		return this.content;
	}

}
