package curriculum1_20_1_21;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ShusiSystem {
	/*
	 
	下記がコンソールに出力されるように作成してください
	
		こんにちは！ここは日本です！
		この寿司はうまい
		寿司は和食です
		今の現在日時は2023/03/09 10:23:39です
	
	【条件】
		・JavaProjectを新規作成し、実行用のpackageと処理用のpackageを作成してください。
		・適切なファイルにフィールドで変数を必要な数作ってください。
		・thisを使って作成してください。
		・日時は今日の日付を取得してください。
		
	*/

	public String greeting; // こんにちは！
	public String country;  // 日本
	public String food;     // 寿司
	public String taste;    // うまい
	public String category; // 和食
	
	public void printDate() {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/ss HH:mm:ss");
		System.out.println("今の現在日時は" + now.format(formatter) + "です");
	}
 
	public ShusiSystem(String greeting, String country, String food,
			String taste, String category) {
		this.greeting = greeting;
		this.country = country;
		this.food = food;
		this.taste = taste;
		this.category = category;
	}

}
