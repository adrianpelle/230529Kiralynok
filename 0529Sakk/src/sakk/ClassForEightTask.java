package sakk;

public class ClassForEightTask {
	private static int uresSorokSzama;
	private static int uresOszlopokSzama;


	public static void sumEmptyRows(Tabla tabla) {
		int emptyRows=0;
		for(int i=0;i<8;i++) {
			if(!ClassForSeventhTask.UresSor(i, tabla)) {
				emptyRows++;
			}
			
		}
		uresSorokSzama=emptyRows;
		System.out.println("Üres sorok: "+emptyRows);
	}

	public static void sumEmptyCols(Tabla tabla) {
		int emptyCols=0;
		
		for(int i=0;i<8;i++) {
			if(!ClassForSeventhTask.UresOszlop(i, tabla)) {
				emptyCols++;
			}
			
		}
		
		System.out.println("Üres oszlopok: "+emptyCols);
	}
}
