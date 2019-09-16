/**
 * One the observers that are notified by the watchman
 * @author riley
 *
 */
public class ShopOwner implements Observer
{
	private Subject watchman;
	/**
	 * Constructor for the ShopOwner class
	 * @param watchman the subject reference that allows it the teacher to be addeed to the arraylist 
	 */
	ShopOwner(Subject watchman)
	{
		this.watchman = watchman;
		watchman.registerObserver(this);
	}
	/**
	 * Updates the ShopOwner about the warnings
	 * @param warning the indicater of what the method should print out 
	 */
	@Override
	public void update(int warning) 
	{
	if(warning == 1)
		System.out.println("Shop Owner: Close down shop and head home");
	else if(warning ==2)
		System.out.println("Shop Owner: Drops everything and find nearest hideout");
	
	}
}
