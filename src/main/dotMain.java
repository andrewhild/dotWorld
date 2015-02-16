package main;
import javax.swing.JFrame;
import java.awt.BorderLayout;


public class dotMain {
public static void main(String[] args){
	System.out.println("Flamenco Overdrive 2015");
	//Establish x and y dimensions for the playing field
	int xDim = 800;
	int yDim = 600;
	//Declare dot actor, assigning initial position at roughly center and step value
	Dot hero = new Dot(new int[]{xDim/2,yDim/2}, 5, xDim, yDim);
	//Instantiate new graphics object and then pass in dot actor and dimensions
	dotWorld world = new dotWorld(hero);
	world.setFocusable(true);
	JFrame frame = new JFrame("Flamenco Overdrive presents DotWorld");
	frame.getContentPane().add(world,BorderLayout.CENTER);
	frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	frame.setSize(xDim,yDim);
	frame.setResizable(false);
	frame.setVisible(true);
}


}