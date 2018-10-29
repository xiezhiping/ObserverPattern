import java.util.ArrayList;
import java.util.List;
public class Station implements Stations {
	private List<Observers> list=new ArrayList<Observers>();
	public void addObserver(Observers observers)
	{
		list.add(observers);
	}
	public void removeObserver(Observers observers)
	{
		list.remove(observers);
	}
	public void notifyObserver(String s) {
		for(Observers observers:list)
		{
			observers.excute(s);
		}
	}
	
}
