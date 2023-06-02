package sakk;

public class ClassForSeventhTask {
	public static boolean UresSor(int row, Tabla tabla) {
		boolean van;
		int i = 0;
		while (i < tabla.t[row].length && tabla.t[row][i] != 'K') {
			i++;
		}
		if(i < tabla.t[row].length ) {
			van=true;
		}else {
			van=false;
		}
		return van;
	}

	public static boolean UresOszlop(int col,Tabla tabla) {
		boolean van;
		int i = 0;
		while ( i < tabla.t.length && tabla.t[i][col] != 'K') {
			i++;
		}
		if(i < tabla.t.length ) {
			van=true;
		}else {
			van=false;
		}
		return van;
	}
}
