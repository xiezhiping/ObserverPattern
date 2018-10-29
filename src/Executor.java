
public class Executor {
	public static void main(String args[])
	{
		Stations station=new Station();
		station.addObserver(new Observer());
		station.addObserver(new Observer());
	    station.addObserver(new Observer());
	    station.addObserver(new Observer());
	    station.notifyObserver("«Î π”√zson");
		
	}
 
 
}
