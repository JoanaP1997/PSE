package dibugger.DebugLogic.Debugger;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public abstract class Subject {
	
	List<Observer> list_observer;
	
	public Subject() {
		list_observer = new ArrayList<Observer>();
	}
	
	public void attach(Observer observer){
		list_observer.add(observer);
	}
	
	public void detach(Observer observer){
		list_observer.remove(observer);
	}
	
//	public abstract void notify();//TODO change name
	
}
