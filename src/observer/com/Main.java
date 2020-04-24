package observer.com;

public class Main {
	public static void main(String[] args) {
		SocialMediaChannel jkdevstar = new SocialMediaChannel();
		
		Listener watcher1 = new Subscriber("Frank Bruno");
		Listener watcher2 = new Subscriber("Kevin Moran");
		
		jkdevstar.register(watcher1);
		jkdevstar.register(watcher2);
		
		watcher1.setSubject(jkdevstar);
		watcher2.setSubject(jkdevstar);
		
		jkdevstar.postMessage("heelooo is it me.....");
		jkdevstar.postMessage("...yes youve found me..");
	}
}