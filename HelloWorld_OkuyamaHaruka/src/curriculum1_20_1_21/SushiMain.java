package curriculum1_20_1_21;

public class SushiMain {

	public static void main(String[] args) {
		
		/*	下記がコンソールに出力されるように作成してください
		こんにちは！ここは日本です！
		この寿司はうまい
		寿司は和食です
		今の現在日時は2023/03/09 10:23:39です
		*/

		ShusiSystem sushi = new ShusiSystem("こんにちは！", "日本", "寿司", "うまい", "和食");
		
		System.out.println(sushi.greeting + "ここは" + sushi.country + "です");
		System.out.println("この" + sushi.food + "は" + sushi.taste);
		System.out.println(sushi.food + "は" + sushi.category + "です");
		sushi.printDate();
	}

}
