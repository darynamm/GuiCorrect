package display.controller;
import display.view.FirstFrame;

public class Controller
{
	private FirstFrame window;
	private int someData;
	public Controller()
	{
		this.someData = - 123;
		this.window = new FirstFrame(this);
	}
	
	
 public void start()
 {
	 
 }
 public int getInformation()
 {
	 someData *= (int) (Math.random() * 100);
	 return someData;
 }
}
