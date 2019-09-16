/**
 * One the observers that are notified by the watchman
 * @author riley
 *
 */
public class Teacher implements Observer
{
	private Subject watchman;
	/**
	 * Constructor for the Teacher class
	 * @param watchman the subject reference that allows it the teacher to be addeed to the arraylist 
	 */
	Teacher(Subject watchman)
	{
		this.watchman = watchman;
		watchman.registerObserver(this);
	}
	/**
	 * Updates the teacher about the warnings
	 * @param warning the indicater of what the method should print out 
	 */
	@Override
	public void update(int warning) {
		if(warning == 1)
			System.out.println("Teacher: Helps get every kid home safe");
		else if(warning ==2)
			System.out.println("Teacher: Brings all students to the underground shelter");
		
	}
}
