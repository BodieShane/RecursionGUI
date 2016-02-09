package gui.view;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import gui.controller.GUIController;

import java.awt.Color;
import java.awt.event.*;
/**
 * @author bsha6756
 * @version 0.x nov 9,2015
 */

public class GUIPanel extends JPanel
{
	////////////////////////////////////////
	private GUIController baseController;///
	private JButton fibonacciButton;     ///
	private JButton factorialButton;	 ///
	private JTextField inputField;		 ///	
	private JTextArea displayArea;		 ///
	private SpringLayout baseLayout;	 ///
	////////////////////////////////////////
	
	
	public GUIPanel (GUIController baseController)
	{
		this.baseController = baseController;
		
		baseLayout = new SpringLayout();
		fibonacciButton = new JButton("Fibonacci");
		baseLayout.putConstraint(SpringLayout.EAST, fibonacciButton, -79, SpringLayout.EAST, this);
		factorialButton = new JButton("Factorial");
		baseLayout.putConstraint(SpringLayout.NORTH, fibonacciButton, 0, SpringLayout.NORTH, factorialButton);
		baseLayout.putConstraint(SpringLayout.WEST, factorialButton, 42, SpringLayout.WEST, this);
		
		inputField = new JTextField ("Words can be typed here");
		baseLayout.putConstraint(SpringLayout.NORTH, inputField, -2147483648, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, factorialButton, 66, SpringLayout.SOUTH, inputField);
		
		displayArea = new JTextArea ("I have no Idea what this dose");
		baseLayout.putConstraint(SpringLayout.EAST, displayArea, -159, SpringLayout.EAST, this);
		
		setupPanel();
		setupLayout();
		setupListeners();
		
	}
	private void setupPanel()
	{
		
		this.add(inputField);
		this.setLayout(baseLayout);
		this.add(fibonacciButton);
		this.add(factorialButton);
		this.add(displayArea);
		
	}
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, inputField, 116, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, inputField, 41, SpringLayout.SOUTH, fibonacciButton);
		baseLayout.putConstraint(SpringLayout.WEST, inputField, 116, SpringLayout.WEST, this);
	}
	private void changeRandomColor()
	{
		int red,green,blue;
		red = (int) (Math.random() * 256);
		green = (int) (Math.random() * 256);
		blue = (int) (Math.random() * 256);
		
		this.setBackground(new Color(red,green,blue));
				
	}
	
	private void setupListeners()
	{
			
	
	
	}
	
	
	
}