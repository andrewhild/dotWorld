package main;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class dotWorld extends JPanel implements KeyListener{
	private Dot hero;
	private int dx, dy;
	
	public dotWorld(Dot dot) {
		hero = dot;
		this.addKeyListener(this);
		
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		g.fillOval(hero.getPos()[0],hero.getPos()[1],20,20);
		g.dispose();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		dx = 0;
		dy = 0;
		int code = e.getKeyCode();
		System.out.println(code);
		if(code==KeyEvent.VK_UP)
			dy = -1;
		else if(code==KeyEvent.VK_DOWN)
			dy = 1;
		else if(code==KeyEvent.VK_RIGHT)
			dx = 1;
		else if(code==KeyEvent.VK_LEFT)
			dx = -1;
		hero.move(dx,dy);
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