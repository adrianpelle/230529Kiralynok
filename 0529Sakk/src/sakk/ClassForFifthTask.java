package sakk;

import java.util.random.RandomGenerator;

public class ClassForFifthTask {
	public static void Elhelyez(int N, Tabla tabla) {
		RandomGenerator rg = RandomGenerator.getDefault();
		int elhelyezve = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < tabla.t[i].length; j++) {
				if (tabla.t[i][j] != 'K' && elhelyezve<N) {
					tabla.t[rg.nextInt(0, tabla.t[0].length)][rg.nextInt(0, tabla.t[0].length)] = 'K';
					elhelyezve++;
				}
			}
			
		}
	}
}
