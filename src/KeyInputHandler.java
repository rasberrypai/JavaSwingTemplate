import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;
import java.util.List;

public class KeyInputHandler extends MouseAdapter implements KeyListener  {
	private int k;
	public void mouseClicked(MouseEvent e){ //mouse clicked
		k = e.getButton(); //mouse button value
		if (k == MouseEvent.BUTTON1){ 
			//BUTTON1 is left click
			//BUTTON2 is right click
			e.getX(); //x-value
			e.getY(); //y-value
			//set inequality or something
			//jframe doesnt work like graph
			//when going down the y-values go up
		}
	}
	@Override
	public void keyPressed(KeyEvent e) { //exactly what it sounds like
        k = e.getKeyCode(); //the value of the button pressed
        if(k == KeyEvent.VK_UP){ 
        	//if you want to find more buttons type KeyEvent.VK_ and you should get options
        }
	}
	@Override
	public void keyReleased(KeyEvent e) { //exactly what it sounds like
		//do the same thing in keyPressed
	}
	@Override
	public void keyTyped(KeyEvent arg0) { //exactly what it sounds like
		//do the same thing in keyPressed
	}
}