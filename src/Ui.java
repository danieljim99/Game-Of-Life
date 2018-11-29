public class Ui {
	public static void wait(int millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			System.out.println("Error waitting");
		}
	}
	
	public static String point(int i, int j) {
		if (CellMesh.mesh[i][j].getAlive()) {
			return "*";
		}
		return " ";
	}
	
	public static void showMesh(Cell mesh[][]) {
		System.out.println("------------------------------------------------");
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				System.out.print(point(i, j));
			}
			System.out.println("");
		}
	}
	
	public static void start() {
		do {
			for(int i = 0; i < 9; i++) {
				for(int j = 0; j < 9; j++) {
					CellMesh.die(i, j);
					CellMesh.born(i, j);
				}
			}
			showMesh(CellMesh.mesh);
			wait(750);
		} while (true);
	}
}