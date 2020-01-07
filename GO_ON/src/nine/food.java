package nine;
 // too general
// can use it but can't use any objects
abstract public class food {
	
	// if eat takes 0 arguments, the subclasses can't either
	/*
	 * void eat() { System.out.println("We all eat food. "); }
	 */
	
	public abstract void eat();
}
