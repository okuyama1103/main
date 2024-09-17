package curriculum1_19;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Animal {
	
	public static void main(String[] args) {
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		
		//初期化 
		Dog dog = new Dog(null);
		System.out.println(dog.animalName);
		
		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		
		// 初期化
		Dog dogNum = new Dog(5);
		System.out.println(dogNum.animalNumbers + "匹");
	
		
		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		
		// 日付、時刻クラスを作成
		LocalDateTime toDay = LocalDateTime.now();
		// 表示形式を指定
		DateTimeFormatter newDay = DateTimeFormatter.ofPattern("yyyy-MM-dd H:m:s");
		// 文字列に変換
		String date = newDay.format(toDay);
		// 出力
		System.out.println(date);
	}

}
