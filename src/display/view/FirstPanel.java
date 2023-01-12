package display.view;
import display.controller.Controller;
import javax.swing.JPanel;
import java.awt.Color;


public class FirstPanel extends JPanel
{
	
private Controller app;

public FirstPanel(Controller app)
{
	super();
	this.app = app;
	
	setupPanel();
	setupListeners();
	setupLayout();
}

private void setupPanel()
{
	this.setBackground(Color.MAGENTA);
}


private void setupListeners()
{
	
}

private void setupLayout()
{
	
}
}
