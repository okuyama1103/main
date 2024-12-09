package curriculum1_30;

public class Person {
	// インスタンスフィールドを定義
	public String name;
	public int age;
	public double height;
	public double weight;

	// インスタントメソッドを定義
	public double bmi() {
		double bmi = weight / (height * height);
		return Math.floor(bmi);
	}

	// インスタンスメソッドを定義
	public void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年齢は" + this.age + "です");
		System.out.println("BMIは" + this.bmi() + "です");
		System.out.println("合計" + 1 + "人です");
	}

	// コンストラクタを定義しインスタンスフィールドの値をセット
	Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;

	}

}
