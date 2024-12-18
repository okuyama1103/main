package curriculum1_31;

public class Person {
	// インスタンスフィールドを定義
	public String name;
	public int age;
	public double height;
	public double weight;
	// クラスフィールドを定義
	public static int count = 0;

	Person(String name, int age, double height, double weight) {
		// 引数の代入
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		// クラスフィールドに1を足す
		count++;
	}

	// インスタントメソッドの定義
	public double bmi() {
		return this.weight / this.height / this.height;
	}

	// インスタントメソッドの定義
	public void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
	}

	// クラスメソッドを定義
	public static void printCount() {
		System.out.println("合計" + Person.count + "人です");

	}
}
