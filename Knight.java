/**
 *  One the observers that are notified by the watchman
 * @author riley
 *
 */
public class Knight implements Observer
{
	private Subject watchman;
	/**
	 * Constructor for the Knight class
	 * @param watchman the subject reference that allows it the teacher to be addeed to the arraylist 
	 */
	Knight(Subject watchman)
	{
		this.watchman = watchman;
		watchman.registerObserver(this);
	}
	/**
	 * Updates the Knight about the warnings
	 * @param warning the indicater of what the method should print out 
	 */
	@Override
	public void update(int warning) 
	{
		if(warning == 1)
			System.out.println("Knight: Helps everyone get home safe");
		else if(warning ==2)
			System.out.println("Knight: Prepares for battle");
		
	}
}
