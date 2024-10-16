package curriculum1_25_main;

import java.util.Scanner;

import curriculum1_25_system.AdventureSystem2;

public class AdventureMain {

	public static void main(String[] args) {
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
		// コンソールに名前を入力
		Scanner scanner = new Scanner(System.in);
		String id = scanner.next();
				
		AdventureSystem2 name = new AdventureSystem2();
		
		// HPに代入
		name.setHp(name.random[0]);
		
		// MPに代入
		name.setMp(name.random[1]);
		
		// 攻撃力に代入
		name.setPower(name.random[2]);
		
		// 素早さに代入
		name.setSpeed(name.random[3]);
		
		// 防御力に代入
		name.setDefence(name.random[4]);
		
		System.out.println("こんにちは「" + id + "」さん" + "\r\nステータス" + "\r\nHP：" + name.getHp() + "\r\nMP：" + name.getMp() + "\r\n攻撃力：" + name.getPower() + "\r\n素早さ：" + name.getSpeed() + "\r\n防御力：" + name.getDefence() + "\r\nさあ冒険に出かけよう！");

	}

}
