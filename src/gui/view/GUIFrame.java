package gui.view;

import javax.swing.JFrame;
import gui.controller.GUIController;
import gui.view.GUIPanel;
/**
 * 
 * @author bsha6756
 *@version 0.2 Nov 9, 2015 updated the setupFrame to load the content Pane
 */

public class GUIFrame extends JFrame
{
	private GUIController baseController;
	private GUIPanel basePanel;
	
	public GUIFrame(GUIController baseController)
	{
		this.baseController = baseController;
		basePanel = new GUIPanel (baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(400,400);
		this.setTitle("Silly app!!");
		this.setResizable(false);
		this.setVisible(true);
	}
	
	public GUIController getBaseController()
	{
		return baseController;
	}
	
}
