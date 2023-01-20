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
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setTitle("My Amazing app!!!!!!!");
	this.setSize(800, 600);
	this.setResizable(false);
	this.setContentPane(panel);
	this.setVisible(true);
}
}
 