package sakk;

public class SakkMain {

	public static void main(String[] args) {
		

		Tabla t = new Tabla();
		ClassForFifthTask.Elhelyez(8, t);
		System.out.println("Feladat 7 (uresSor(0) ) : ");
		ClassForSeventhTask.UresSor(0, t);
		NegyedikFeladatMegjelenit.Megjelenit(t);
		ClassForEightTask.sumEmptyRows(t);
		ClassForEightTask.sumEmptyCols(t);
		
	}



}
