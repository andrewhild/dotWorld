package main;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class dotWorld extends JPanel implements KeyListener{
	private Dot hero;
	private int xDim, yDim, dir;
	
	public dotWorld(Dot dot, int x, int y) {
		hero = dot;
		xDim = x;
		yDim = y;
		//JTextField typingArea = new JTextField(20);
        //typingArea.addKeyListener(this);
        //this.add(typingArea);
		this.addKeyListener(this);
		
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		g.fillOval(hero.getPos()[0],hero.getPos()[1],20,20);
		g.dispose();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int code = e.getKeyCode();
		System.out.println(code);
		if(code==KeyEvent.VK_UP)
			dir = 1;
		else if(code==KeyEvent.VK_DOWN)
			dir = 2;
		else if(code==KeyEvent.VK_RIGHT)
			dir = 3;
		else if(code==KeyEvent.VK_LEFT)
			dir = 4;
		hero.move(dir);
		Graphics g = getGraphics();
		paint(g);
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}