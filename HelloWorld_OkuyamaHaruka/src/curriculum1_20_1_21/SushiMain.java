package curriculum1_20_1_21;

public class SushiMain {

	public static void main(String[] args) {
		ShusiSystem sushi = new ShusiSystem("こんにちは！", "日本", "寿司", "うまい", "和食");
		
		System.out.println(sushi.greeting + "ここは" + sushi.country + "です");
		System.out.println("この" + sushi.food + "は" + sushi.taste);
		System.out.println(sushi.food + "は" + sushi.category + "です");
		sushi.printDate();
	}

}
