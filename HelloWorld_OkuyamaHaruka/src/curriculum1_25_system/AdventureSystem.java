package curriculum1_25_system;

public class AdventureSystem{
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
	// カプセル化
	private int hp;
	private int mp;
	private int power;
	private int speed;
	private int defence;
	
	// HPのゲッター
	public int getHp() {
		return hp;
	}
	
	// HPのセッター
	public void setHp(int newHp) {
		this.hp = newHp;
	}
	
	// MPのゲッター
	public int getMp() {
		return mp;
	}
	
	// MPのセッター
	public void setMp(int newMp) {
		this.mp = newMp;
	}
	
	// 攻撃力のゲッター
	public int getPower() {
		return power;
	}
	
	// 攻撃力のセッター
	public void setPower(int newPower) {
		this.power = newPower;
	}
	
	// 素早さのゲッター
	public int getSpeed() {
		return speed;
	}
	
	// 素早さのセッター
	public void setSpeed(int newSpeed) {
		this.speed = newSpeed;
	}
	
	// 防御力のゲッター
	public int getDefence() {
		return defence;
	}
	
	// 防御力のセッター
	public void setDefence(int newDefence) {
		this.defence = newDefence;
	}

}
