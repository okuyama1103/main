package curriculum1_18;

import java.util.Random;

public class Math {


			// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	
			// 文字列型と数値型で受け取る
			static void Greeting(String Greeting , int curriculum) {
			System.out.println(Greeting + curriculum);
			}
			
			// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
			
			// 数値型で受け取る
			static void Product(int num1 , int num2) {
				System.out.println(num1 * num2);
			}
			
			// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
			
			// 数値型を配列で受け取る
			static void Array(int array[]) {
				// 受け取った数値がすべて出力されるまで処理を実行
				for (int i = 0; i < 3; i++) {
				System.out.println(array[i]);
				}
			}
			// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
			
			// 小数値型で受け取る
			static void Product(double num3 , double num4) {
				System.out.println(num3 + num4);
			}	
			// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
			// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
			// ※0は出力＆格納しないようにしてください。
			
			// 配列を数値型で受けとる
			static int[] Random(int num5) {
				// 乱数関数初期化
				Random rnd = new Random();
				// 配列に数値生成
				int[] nums = new int[num5];
				// 受け取った値がすべて出力されるまで処理を実行
				for(int j = 0; j < num5; j++) {
					// 1～100までの乱数生成
					nums[j] = rnd.nextInt(100)+1;
				System.out.println(nums[j]);
				}
				// 処理が終了
				return nums;
			}
			// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
			// ※小数点以下も表示されるようにしてください。
			
			// 平均値を小数で受け取る
			static double Average(int average[]) {
				// 初期化
				double sum = 0;
				double ave =0;
				// 受け取った値がすべて出力されるまで処理を実行
				for(int k = 0; k < average.length; k++) {
					sum += average[k];
				}
				// 出力した値を文字列にして平均値を生成
				ave = sum/average.length;
				System.out.println(ave);
				// 処理が終了
				return ave;
			}
			
			// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
			
			// 真偽値型を少数で受け取る
			static boolean Answer(double ave) {
				// 真偽値型初期化
				boolean answer = false;
				// 受け取った値が50以上の場合
			 if(ave >= 50){
				 // true表示
				 answer = true;
				 }
			 System.out.println(answer);
			 // 処理が終了
			 return answer;
			}

			public static void main(String[] args) {
		    // 作成したメソッドをここで呼び出してください
				
				// Q1 Hallo JavaSE 11 表示
				Math.Greeting ("Hello JavaSE " , 11);
				
				// Q2自分で数値を2つ入力
				Math.Product(1,2);
				
				// Q3 配列の個数を決め、それぞれ数値を入力
				int array[] = new int[3];
				array[0] = 1;
				array[1] = 2;
				array[2] = 3;
				Math.Array(array);
				
				// Q4 小数値を2つ入力
				Math.Product(4.2, 0.2);
				
				// Q5&Q6&Q7 作成した乱数の平均が50以上であればtrueの表示
				Math.Answer(Math.Average(Math.Random(3)));
			}

	}

