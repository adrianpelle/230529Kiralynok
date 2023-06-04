package sakk;

public class ClassForSeventhTask {
	public static boolean UresSor(int row, Tabla tabla) {
		boolean van;
		String text = String.valueOf(tabla.t[row]);
		van = text.contains("K");
		return van;
		
	}

	public static boolean UresOszlop(int col,Tabla tabla) {
		boolean van;
		int i = 0;
		while ( i < 8 && tabla.t[i][col] != 'K') {
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
