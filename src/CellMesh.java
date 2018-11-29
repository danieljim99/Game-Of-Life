import java.util.Random;

public class CellMesh {
	static public Cell mesh[][] = new Cell[9][9];
		
	public static int random() {
		Random random = new Random();
		return random.nextInt((int)System.currentTimeMillis()) % 5 + 1;
	}
	
	public static void createMesh() {
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				mesh[i][j] = new Cell();
			}
		}
	}
	
	public static void newMesh() {
		createMesh();
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				if (random() == 3) {
					mesh[i][j].setAlive(true);
				}
			}
		}
	}
			
	public static void born(int i, int j) {
		if (i >= 0 && i < 9 && j >= 0 && j < 9) {
			if (!mesh[i][j].getAlive()) {
				if (Check.checkAll(i, j) == 3) {
					mesh[i][j].setAlive(true);
				}
			}
		}
	}
	
	public static void die(int i, int j) {
		if (i >= 0 && i < 9 && j >= 0 && j < 9) {
			if(mesh[i][j].getAlive()) {
				if (!(Check.checkAll(i, j) == 2 || Check.checkAll(i, j) == 3)) {
					mesh[i][j].setAlive(false);
				}
			}
		}
	}
}