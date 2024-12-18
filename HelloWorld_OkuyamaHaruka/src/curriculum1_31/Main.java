package curriculum1_31;

public class Main {

	public static void main(String[] args) {
		// インスタンスの作成
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
		person1.print();

		// インスタンスの作成
		Person person2 = new Person("山田花子", 22, 1.5, 40);
		person2.print();
		
		// 合計を出力
		System.out.println("合計" + Person.count + "人です");
		
		// クラスメソッドの呼び出し
		Person.printCount();
	}

}
