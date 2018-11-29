public class Cell {
	private boolean alive;
	
	Cell(){
		this.alive = false;
	}
	
	Cell(boolean alive){
		this.alive = alive;
	}
	
	public boolean getAlive() {
		return this.alive;
	}
	
	public void setAlive(boolean alive) {
		this.alive = alive;
	}
}