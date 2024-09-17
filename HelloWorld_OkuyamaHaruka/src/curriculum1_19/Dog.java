package curriculum1_19;

public class Dog {
	// Q1：フィールドに動物の名前の変数を定義してください。
	
	// 文字列で定義
	public String animalName;
	
	// Q2：フィールドに動物の数の変数を定義してください。
	
	// 数値型で定義
	public int animalNumbers;

	
	// Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。
	
	// 文字列型で受け取る
	public Dog(String animalName) {
		this.animalName = "犬";
	}
	
	// Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。
	
	// 数値型で受け取る
	public Dog(int animalNumbers) {
		this.animalNumbers = animalNumbers;
	}
	
}
