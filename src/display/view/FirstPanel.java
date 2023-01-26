package display.view;
import display.controller.Controller;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;


public class FirstPanel extends JPanel
{
	
private Controller app;
private JButton colorButton;
private JButton coolButton;
public FirstPanel(Controller app)
{
	super();
	this.app = app;
	this.colorButton = new JButton("Click to change color");
	this.coolButton = new JButton("Click");
	
	setupPanel();
	setupListeners();
	setupLayout();
}

private void setupPanel()
{
	this.setBackground(Color.MAGENTA);
	this.add(colorButton);
	this.add(coolButton);
}


private void setupListeners()
{
	colorButton.addActionListener(click -> updateBackground());
	coolButton.addActionListener(click -> updateBackground());

}

private void setupLayout()
{
	//layout.putConstraint(Spring.layout.WEST, colorButton, 10, SpringLayout.WEST, this);
	
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
