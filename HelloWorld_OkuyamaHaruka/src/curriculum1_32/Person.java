package curriculum1_32;

import curriculum1_33.Bicycle;
import curriculum1_33.Car;

public class Person {
	public static int count = 0;
	public String firstName;
	public int age;
	public double height, weight;
	private String lastName;

	Person(String firstName, String lastName, int age, double height, double weight) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
		count++;
	}



	public String fullName() {
		return this.firstName + this.lastName;
	}

	public void print() {
		System.out.println("名前は" + this.fullName() + "です");
		System.out.println("年は" + this.age + "です");
	}

	public double bmi() {
		return this.weight / this.height / this.height;
	}

	public static void printCount() {
		System.out.println("合計" + Person.count + "人です");
	}
	
	// インスタンスメソッドを定義(car)
	public void buy(Car car) {
		car.setOwner(this.fullName());
		System.out.println(car.getOwner() + "が購入しました");
	}
	
	// インスタンスメソッドを定義(bicycle)
	public void buy(Bicycle bicycle) {
		bicycle.setOwner(this.fullName());
		System.out.println(bicycle.getOwner() + "が購入しました");
	}

}
