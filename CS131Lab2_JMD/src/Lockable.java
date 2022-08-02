
public interface Lockable {

	//creating a method to set a key
	public void setKey(int key);
	//creating a method for lock
	public void lock(int key);
	//creating a method for unlock
	public void unlock(int key);
	//creating a boolean to see if lock is set to true or false
	public boolean isLocked();
	
	
	
}
//end interface
