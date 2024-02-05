package curriculum_B;

public class Qes5 {

	public static void main(String[] args) {
		/*
		 *  １から９までの数字と１から２０までの数字を用意
		 *  掛け算を表示
		 *  数字は三桁で表示
		 */
		int  i, j;
		for(i = 1; i <= 9; i++) {
			for(j =1; j <= 20; j++) {
				int answer = i * j;
				System.out.print( String.format("%03d", j) + " * " + String.format("%03d", i) +" = "+ String.format("%03d", answer) +" || ");
			}
			System.out.println();
		}

	}

}
