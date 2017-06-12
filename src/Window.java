import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Window extends JPanel implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int dimensions = 505;
	private final int DELAY = 15; // make this higher if you want it to be slower
	private Timer timer;
	public Window(){
        setBackground(Color.black); //sets background color
        setPreferredSize(new Dimension(dimensions, dimensions)); //sets box size
        timer = new Timer(DELAY, this);
			timer.start(); //starts timer
	}
	@Override
	public void paintComponent(Graphics g) { //paints stuff 
		super.paintComponent(g); //has to be first
		drawAll(g); //this is just to make you understand 
		//all draw stuff should end up back here
	}
	@Override
	public void actionPerformed(ActionEvent e) { //calls this every delay interval
		repaint(); //calls paintCOmponent again to draw things again
	}
	private void drawAll(Graphics g){ //draws stuff
		//g.draw() is the basic understanding
	}
}
