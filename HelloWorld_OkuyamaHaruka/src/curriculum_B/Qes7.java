package curriculum_B;

import java.util.Scanner;

public class Qes7 {

	public static void main(String[] args) {

		//  生徒の人数を入力
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		System.out.println(num + "人の生徒の成績を入力");

		// 要素(教科)を配列
		String[] subject = { "英語", "数学", "理科", "社会" };

		// 二人以下の場合、処理が開始されない
		while (num < 2) {
			System.out.println("生徒の人数を入力してください(2以上)");
			num = sc.nextInt();

		}
		// 二人以上の場合、処理を開始
		if (num >= 2) {
			// 人数、教科の配列
			int[][] scores = new int[num][subject.length];

			// 入力された人数になるまでの処理
			for (int i = 0; i < scores.length; i++) {
				for (int j = 0; j < scores[i].length; j++) {
					// 生徒それぞれの各教科の点数を入力
					System.out.println((i + 1) + "人目の『" + subject[j] + "』の点数を入力してください:");
					scores[i][j] = sc.nextInt();
				}
			}
			// 各生徒の点数の配列
			for (int i = 0; i < scores.length; i++) {
				// int型初期値
				int sum = 0;
				for (int score : scores[i]) {
					// 点数の合計
					sum += score;
				}
				// 各生徒ごとの平均(小数点第二位までの表示に書式変換)
				System.out
						.println((i + 1) + "人目の平均点は" + String.format("%.2f", (double) sum / scores[i].length) + "点です");
			}
			// 科目毎の平均点を計算して表示
			for (int i = 0; i < subject.length; i++) {
				// int型初期値
				int sum = 0;
				for (int j = 0; j < scores.length; j++) {
					// 
					sum += scores[j][i];
				}
				System.out.println(subject[i] + "の平均点は" + String.format("%.2f", (double) sum / scores.length) + "点です");
			}
			int sum = 0;
			// 全体の平均点を計算して表示する
			for (int i =0;i < scores.length; i++) {
				for (int j =0; j < scores[i].length; j++) {
					sum += scores[i][j];
				}
				// 出力結果を表示
				System.out.println("全体の平均点は" + String.format("%.2f", (double) sum / scores[i].length) + "点です");
				
				break;
			}
		}
		sc.close();

	}

}
