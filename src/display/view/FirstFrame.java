package display.view;
import display.controller.Controller;
import javax.swing.JFrame;
public class FirstFrame extends JFrame
{
private Controller app;

private FirstPanel panel;
public FirstFrame(Controller app)
{
	super();
	this.app = app;
	this.panel = new FirstPanel(this.app);

	setupFrame();
}

private void setupFrame()
{
	
	this.setTitle("My Amazing app!!!!!!!");
	this.setSize(800, 600);
	
	this.setContentPane(panel);
	this.setVisible(true);
}
}
 