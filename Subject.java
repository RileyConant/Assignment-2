/**
 * Interface for the watchman class that the observers also use 
 */
public interface Subject 
{
public void registerObserver(Observer observer);
public void removeObserver(Observer observer);
public void notifyObservers();
}
