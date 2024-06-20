package curriculum_B;

public class Qes4 {

	public static void main(String[] args) {
		/*
		 *  二つの数字(双方１から9まで)を用意
		 *  掛け算を表示
		 *  数字は二桁で表示
		 */
		int i, j;
		for(i = 1; i <= 9; i++) {
			for(j = 1; j <= 9; j++) {
				int answer = i * j;
				System.out.print(String.format("%02d",i) + " * " + String.format("%02d", j) + " = " + String.format("%02d", answer) + " || ");	
			}
			System.out.println();
		}
	}

}
