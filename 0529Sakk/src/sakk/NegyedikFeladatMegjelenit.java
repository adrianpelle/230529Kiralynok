package sakk;

public class NegyedikFeladatMegjelenit {

	
	public static void Megjelenit(Tabla tabla) {
		for (int i=0; i<tabla.getT().length; i++) {
			for (int j=0; j<tabla.getT().length; j++) {
					System.out.print(tabla.getT()[i][j]);
					}
			System.out.println();
		}

	}
}
