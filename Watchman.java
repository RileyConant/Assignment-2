import java.util.ArrayList;
/**
 * The notifier class for the different observers
 * @author riley
 *
 */
public class Watchman implements Subject{
	int warning = 0;
	ArrayList<Observer> observers;
	/**
	 * Constructor for Watchman class, Initializes the Arraylist for the observers
	 */
	Watchman()
	{
		observers = new ArrayList<Observer>();
	}
	/**
	 * Adds the observer to the array list
	 * @param observer the specific observer that is being added
	 */
	@Override
	public void registerObserver(Observer observer) 
	{
		observers.add(observer);	
	}
	/**
	 * Removes the specific observer from the arraylist
	 * @param observer
	 */
	@Override
	public void removeObserver(Observer observer) 
	{
		observers.remove(observer);
		
	}
	/**
	 * This method goes through all the observers in the arraylist and calls their update methods with the specific warning number
	 */
	@Override
	public void notifyObservers() 
	{
		for(Observer observer : observers)
		{
		observer.update(warning);
		}
		
	}
	/**
	 * Calls the notifyObservers() function 
	 * @param warning the number of trumpet calls 
	 */
	public void issueWarning(int warning)
	{
		System.out.println("WARNING: "+ warning + " trumpets were played!");
		this.warning = warning;
		notifyObservers();
	}
	
}
