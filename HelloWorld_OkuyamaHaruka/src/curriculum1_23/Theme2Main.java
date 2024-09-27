package curriculum1_23;

public class Theme2Main {
	public static void main(String[] args) {

	/*
 	
 	下記がコンソールに出力されるように作成してください
 	※thisとsetterとgetterとフィールドを使ってください
 	
  	動物名：ライオン
	体長：2.1m
	速度：80km/h
 	
 */		
		Theme2System animal = new Theme2System();
		
		// Animalsに代入
		animal.setAnimals("ライオン");
		
		// Lengthに代入
		animal.setLength(2.1);
		
		// Speedに代入
		animal.setSpeed(80);
		
		System.out.println("動物名；" + animal.getAnimals() + "\r\n体長；" + animal.getLength() + "m" + "\r\n速度：" + animal.getSpeed() + "km/h");
		
	}


}
