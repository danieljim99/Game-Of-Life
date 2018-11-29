public class Check {
	
	private static boolean checkUp(int i, int j) {
		if (i > 0 && i < 9 && j >= 0 && j < 9) {
			return (CellMesh.mesh[i - 1][j].getAlive());
		}
		return false;
	}
	
	private static boolean checkUpRight(int i, int j) {
		if (i > 0 && i < 9 && j >= 0 && j < 8) {
			return (CellMesh.mesh[i - 1][j + 1].getAlive());
		}
		return false;
	}
	
	private static boolean checkRight(int i, int j) {
		if (i >= 0 && i < 9 && j >= 0 && j < 8) {
			return (CellMesh.mesh[i][j + 1].getAlive());
		}
		return false;
	}
	
	private static boolean checkDownRight(int i, int j) {
		if (i >= 0 && i < 8 && j >= 0 && j < 8) {
			return (CellMesh.mesh[i + 1][j + 1].getAlive());
		}
		return false;
	}
	
	private static boolean checkDown(int i, int j) {
		if (i >= 0 && i < 8 && j >= 0 && j < 9) {
			return (CellMesh.mesh[i + 1][j].getAlive());
		}
		return false;
	}
	
	private static boolean checkDownLeft(int i, int j) {
		if (i >= 0 && i < 8 && j > 0 && j < 9) {
			return (CellMesh.mesh[i + 1][j - 1].getAlive());
		}
		return false;
	}
	
	private static boolean checkLeft(int i, int j) {
		if (i >= 0 && i < 9 && j > 0 && j < 9) {
			return (CellMesh.mesh[i][j - 1].getAlive());
		}
		return false;
	}
	
	private static boolean checkUpLeft(int i, int j) {
		if (i > 0 && i < 9 && j > 0 && j < 9) {
			return (CellMesh.mesh[i - 1][j - 1].getAlive());
		}
		return false;
	}
	
	public static int checkAll(int i, int j) {
		int cont = 0;
		cont = (checkUp(i, j)) ? cont + 1 : cont;
		cont = (checkUpRight(i, j)) ? cont + 1 : cont;
		cont = (checkRight(i, j)) ? cont + 1 : cont;
		cont = (checkDownRight(i, j)) ? cont + 1 : cont;
		cont = (checkDown(i, j)) ? cont + 1 : cont;
		cont = (checkDownLeft(i, j)) ? cont + 1 : cont;
		cont = (checkLeft(i, j)) ? cont + 1 : cont;
		cont = (checkUpLeft(i, j)) ? cont + 1 : cont;
		return cont;
	}
}