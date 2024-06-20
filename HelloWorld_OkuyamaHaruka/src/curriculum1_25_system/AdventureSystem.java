package curriculum1_25_system;

public class AdventureSystem {
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
	private String greet;
	private String name;
	private String status;
	private int hp;
	private int mp;
	private int power;
	private int speed;
	private int defence;
	
	public String getGreet() {
		return greet;
	}
	public String getName() {
		return name;
	}
	public String getStatus() {
		return status;
	}
	public int getHp() {
		return hp;
	}
	public int getMp() {
		return mp;
	}
	public int getPower() {
		return power;
	}
	public int getSpeed() {
		return speed;
	}
	public int getDefence() {
		return defence;
		
	}
	

}
