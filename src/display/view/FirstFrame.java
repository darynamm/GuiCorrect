package display.view;
import display.controller.Controller;
import javax.swing.JFrame;
public class FirstFrame extends JFrame
{
private Controller app;

public FirstFrame(Controller app)
{
	super();
	this.app = app;
	setupFrame();
}

private void setupFrame()
{
	this.setVisible(true);
}
}
