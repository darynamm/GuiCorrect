package display.view;
import display.controller.Controller;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;


public class FirstPanel extends JPanel
{
	
private Controller app;
private JButton colorButton;

public FirstPanel(Controller app)
{
	super();
	this.app = app;
	this.colorButton = new JButton("Click to change color");
	
	setupPanel();
	setupListeners();
	setupLayout();
}

private void setupPanel()
{
	this.setBackground(Color.MAGENTA);
	this.add(colorButton);
}


private void setupListeners()
{
	colorButton.addActionListener(click -> updateBackground());
}

private void setupLayout()
{
	
}

private void updateBackground()
{
	this.setBackground(generateRandomColor());
}
private Color generateRandomColor()
{
	Color randomColor;
	
	int red = (int) (Math.random()* 256);
	int green = (int) (Math.random() * 256);
	int blue = (int) (Math.random() * 256);
	
	randomColor = new Color(red, green, blue);
	
	return randomColor;
}
}
