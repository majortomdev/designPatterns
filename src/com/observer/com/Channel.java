package com.observer.com;

public interface Channel {

	public void register(Listener watcher);
	public void unregister(Listener watcher);
	public void notifyWatchers();
	public Object getLatestVersion(Listener watcher);
}
