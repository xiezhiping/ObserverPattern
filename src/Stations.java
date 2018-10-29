
public interface Stations {
	public void addObserver(Observers observers);
	public void removeObserver(Observers observers);
	public void notifyObserver(String s);
}
