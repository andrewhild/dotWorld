package main;

public class Dot {
	private int[] pos;
	private int step = 0, limX, limY;
	
	public Dot(int[] start, int walk, int x, int y) {
		pos = start;
		step = walk;
		limX = x;
		limY = y;
	}
	
	public int[] getPos() {
		return pos;
	}
	
	private boolean isInBounds() {
		if(pos[0]<0||pos[1]<0||pos[0]>limX||pos[1]>limY)
			return false;
		else 
			return true;
	}
	
	public void move(int dir) {
		switch (dir) {
		case 1:
			pos[1]-=step;
			break;
		case 2:
			pos[1]+=step;
			break;
		case 3:
			pos[0]+=step;
			break;
		case 4:
			pos[0]-=step;
			break;
		default:
			System.out.println("Your dot has lost its way.");
		}
		if(!isInBounds())
			reset();
		
	}
	
	private int[] reset() {
		if(pos[0]<0)
			pos[0] = limX;
		else if (pos[0]>limX)
			pos[0] = 0;
		else if(pos[1]<0)
			pos[1] = limY;
		else
			pos[1] = 0;
		return pos;
	}
}


