package curriculum1_25_system;

import java.util.Random;

public class AdventureSystem2 extends AdventureSystem {

		/*
		 
		 名前を入力したら下記がコンソールに出力されるように作ってください
			条件：数値は毎回変わるように作ってください
			 	 サブクラスを使用してください
				 スーパークラスを使用してください
				 getterとsetterを使用してください
				 packageを2つ作ってメインと処理を分けてください
				 命名する場合は規則にのっとってください
				 コンストラクタを使用してください

			こんにちは 「 名前 」 さん
			ステータス
			HP：849
			MP：862
			攻撃力：375
			素早さ：937
			防御力：24

			さあ冒険に出かけよう！
		 
		 */
		// 配列の宣言
		public int[] random;
		
		// コンストラクタ作成
		public AdventureSystem2 () {
			
			// 5つ配列を生成
			random = new int[5];
			
			// 処理を5回繰り返す
			for(int i = 0; i < 5; i++) {
			
				// 乱数関数初期化
				Random rand = new Random();
				
				// 1～999までの乱数生成
				random[i] = rand.nextInt(999)+1;
			}
		}

}
