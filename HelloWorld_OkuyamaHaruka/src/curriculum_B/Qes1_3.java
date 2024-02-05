package curriculum_B;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

class Qes1_3{
	public static void main (String[] args) {

		// コンソールに入力された値を読み込む
		Scanner sc = new Scanner(System.in);
		String userName = null;
		

		// whileユーザー名登録完了がtrue
		boolean nameFlag = true;
		while(nameFlag) {
		
			// 入力された内容を取得
			userName = sc.nextLine().trim();
		
			// 入力された値の表示
			System.out.println(userName);
				
			// nullが出力された場合か、入力された文字数が0の場合
			if (Objects.isNull(userName) || userName.isEmpty()) {
				System.out.println("名前を入力してください。");
	
			// 入力された値に半角英数字以外が混ざっていた場合
			}else if(!userName.matches("^[0-9a-zA-Z]+$")){
				System.out.println("半角英数字のみで名前を入力してください。");
					
			// 入力された値が10文字以上の場合
			}else if(userName.length() > 10){
				System.out.println("名前を10文字以内にしてください。");
					
			// 入力された値が正常の場合
			}else{
				System.out.println("ユーザー名「" + userName +"」を登録しました。");
				nameFlag = false;
			}
		}
			/** 問3じゃんけん
			* 自分の手を入力
			* 試合数カウント
			* 負けた場合→true
			* あいこの場合→true
			* 勝ちの場合→falseループ終了
			* 勝つまで行った試合数
			*/
			String[] myHand = {"グー","チョキ","パー"};
			
			System.out.println("0:グー、1:チョキ、2:パーのいずれかを入力してください");
			
			
			// じゃんけん開始
			boolean judge = true;
			
			
			int count = 0;
			
			// while(true)trueはあいこと負け
			while(judge) {

			int userHand = 0;
			boolean handFlag = true;
			while(handFlag) {
			
			// エラーがおきそうな処理;範囲外
			try {
			
				Scanner sc2 = new Scanner(System.in);
		
				// コンソールに入力された値を読み込む
				userHand = sc2.nextInt();		
				
				// nullチェック
				if (Objects.isNull(userHand) || userHand<= 0) {
					System.out.println("手を入力してください");
		
				
				//  3以上の数字が入力された場合 
				}else if(userHand >= 3){
					System.out.println("2以下の整数を入力してください");
				
				// 入力された値が正常の場合
				}else {
					 System.out.println(userName +"の手は「" + myHand[userHand] + "」");
						handFlag = false;
		
				}
			
			}catch (NumberFormatException e) {
				
				// エラーが出た場合の処理
				System.out.println(e);
			}
			// nullチェック
			}
			
			// enemyHand用意
			
			Random ra = new Random();
			int enemyHand = ra.nextInt(3); 
			
			System.out.println("相手の手は「" + myHand[enemyHand] + "」");
			
			// 試合数カウント (インクリメント:++)
			count++ ;
		
		
		
		/**
		 * myHand = enemyHand : あいこ
		 * 0と2、1と0、2と1 : まけ
		 * →ループ
		 * 0と1、1と2、2と0 : かち
		 * →ループ終了
		 */
		
			 if(userHand == enemyHand) {
				 System.out.println("DRAW あいこ もう一回しましょう!");
				 
			 }else if(userHand == 0 && enemyHand == 2) {
				 System.out.println("俺の勝ち!"+"\r\n"+"なんで負けたか明日までに考えておいてください"+"\r\n"+"そしたら何かが見えてくるはずです");
			 
			 }else if(userHand == 1 && enemyHand == 0) {
				 System.out.println("俺の勝ち!"+"\r\n"+"負けは次につながるチャンスです"+"\r\n"+"ネバーギブアップ!");
			 
			 }else if(userHand == 2 && enemyHand == 1) {
				 System.out.println("俺の勝ち"+"\r\n"+"たかがじゃんけん、そう思ってないですか？"+"\r\n"+"それやったら次も、俺が勝ちますよ");
			 
			 }else if((userHand == 0 && enemyHand == 1) || (userHand == 1 && enemyHand == 2) || (userHand == 2 && enemyHand == 0)){
				 System.out.println("やるやん"+"\r\n"+"次は俺にリベンジさせて");
				 System.out.println("勝つまでにかかった合計回数は"+count+"回です");
				 break;
			 }
		 }
	}
}