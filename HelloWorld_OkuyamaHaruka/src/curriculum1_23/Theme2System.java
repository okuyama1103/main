package curriculum1_23;

public class Theme2System {

		/*
	 	
	 	下記がコンソールに出力されるように作成してください
	 	※thisとsetterとgetterとフィールドを使ってください
	 	
	  	動物名：ライオン
		体長：2.1m
		速度：80km/h
	 	
	 */
	
	// カプセル化
	private String animals;
	private double length;
	private int speed;
	
	// Animalsのゲッター
	public String getAnimals(){
		return animals;
	}
	
	// Lengthのゲッター
	public double getLength() {
		return length;
	}
	
	// Speedのゲッター
	public int getSpeed() {
		return speed;
	}
	
	// Animalsのセッター
	public void setAnimals(String newAnimals) {
		this.animals = newAnimals;
	}
	
	// Lengthのセッター
	public void setLength(double newLength) {
		this.length = newLength;
	}
	
	// Speedのセッター
	public void setSpeed(int newSpeed) {
		this.speed = newSpeed;
	}
}
