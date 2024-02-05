package curriculum_A;
class Qes1_13 {
	public static void main (String[] args) {
		
		// 問1
		
		// バイト型
		byte number1;
		
		// 短整数型
		short number2;
		
		// 整数型
		int number3;
		
		// 長整数型
		long number4;
		
		// 単精度浮動小数点数型
		float number5;
		
		// 倍制度浮動小数点数型
		double number6;
		
		// 文字型
		char character1;
		
		// 文字列型
		String character2;
		
		// 真偽値型
		boolean judge;
		
		
		// 問2
		
		// byte 初期値
		number1 = 0;
		
		// short 初期値
		number2 = 0;
		
		// int 初期値
		number3 = 0;
		
		// long 初期値
		number4 = 0;
		
		// float 初期値
		number5 = 0f;
		
		// double 初期値
		number6 = 0.0d;
		
		// char 初期値
		character1 = '\0';
		
		// String 初期値
		character2 = null;
		
		// boolean 初期値
		judge = false;
		
		
		// 問3
		
		// 指定の値をそれぞれ代入
		number1 = 10;
		
		number2 = 100;
		
		number3 = 1000;
		
		number4 = 10000l;
		
		number5 = 9.5f;
		
		number6 = 10.5d;
		
		character1 = 'a';
		
		character2 = "ハロー";
		
		judge = true;
		
		
		// 問4
		System.out.println("問4");
		
		// number1～4の和
		System.out.println(number1 + number2 + number3 + number4);
		
		// number1+number1
		System.out.println(number5 + number6);
		
		// characterとjudgeの表示
		System.out.println(character1 + " " + character2 + " " + judge);
		
		// numberすべての和(四捨五入)
		System.out.println(Math.round(number1 + number2 + number3 + number4 + number5 + number6));
		
		// number1～4の積
		System.out.println(number1 * number2 * number3 * number4);
		
		// 10.5 ÷ 100
		System.out.println(number6 / number2);
		
		// 10 - 100
		System.out.println(number1 - number2 + "\r\n");
		
		
		// 問5
		System.out.println("問5");
		
		// 変更箇所 → String型をint型に
		int num1 = 20;
		
		int num2 = 23;
		
		System.out.println("ハローJAVA" + (num1 + num2) +"\r\n");
		
		
		// 問6
		System.out.println("問6");
		
		// 個人情報作成
		String name = "山田太郎";
		
		int age = 18;
		
		float height = 170.5f;
		
		float weight = 62.2f;
		
		String like = "寿司";
				
		// 出力
		System.out.println("初めまして" + name + "です");
		
		System.out.println("年齢は" + age + "歳です");
		
		System.out.println("身長は" + height + "cmです");
		
		System.out.println("体重は" + weight + "kgです");
		
		System.out.println("好きな食べ物は" + like + "です" + "\r\n");
		
		
		// 問7
		System.out.println("問7");
		
		// 身長cmを身長mに単位変換
		float heightM = (height / 100);
		
		// BMI = 体重kg ÷ 身長m^2
		double bmi = (weight / Math.pow(heightM ,  2));
		
		//bmiを四捨五入
		double bmiRound1 =(double)(Math.round(bmi * 10)) /10;
		
		System.out.println("BMIは" + bmiRound1 + "です" + "\r\n");
		
		
		// 問8
		System.out.println("問8");
		
		// 名前の再代入
		name = "鈴木一郎";
		
		System.out.println("初めまして" + name + "です");
		
		// 年齢の再代入
		age = 24;
				
		System.out.println("年齢は" + age + "歳です");
		
		// 身長の再代入
		height = 168.5f;
				
		System.out.println("身長は" + height  + "cmです");
		
		// 体重の再代入
		weight = 64.2f;
				
		System.out.println("体重は" + weight + "kgです");
		
		// 好物の再代入
		like = "オムライス";
		
		System.out.println("好きな食べ物は" + like + "です");
		
		// 身長の単位変換
		heightM = (height / 100);
		
		// BMIの再代入
		bmi = (weight / Math.pow(heightM ,  2));
		
		double bmiRound2 = (double)(Math.round(bmi * 10)) /10;
		
		System.out.println("BMIは" + bmiRound2 + "です" + "\r\n");
		
		
		// 問9
		System.out.println("問9");
		
		System.out.println("初めまして" + name + "です");
		
		// 24 → 48
		age +=  age;

		System.out.println("年齢は" + age + "歳です");
		
		// 168.5 → 337.0
		height += height;

		System.out.println("身長は" + height+ "cmです");
		
		// 64.2 → 128.4
		weight += weight;

		// 出力
		System.out.println("体重は" + weight + "kgです");
		System.out.println("好きな食べ物は"  + like + "です");
		
		// 身長の単位変換
		heightM = (height / 100);
		
		// わかりやすくするために置換
		float heightM2 = heightM;
		
		// BMI 再代入
		bmi = (double)(weight / Math.pow(heightM2 ,  2));
				
		// 四捨五入
		double bmiRound3 = (double)(Math.round(bmi * 100)) /100;
		
		System.out.println("BMIは" + bmiRound3 + "です" + "\r\n");
		
		
		// 問10
		System.out.println("問10");
		
		// 年齢が25以上であれば "true"
		boolean judge2 = (age >= 25);
		
		System.out.println(judge2 + "\r\n");
		
		
		// 問11
		System.out.println("問11");
		
		// int型 float型をSring型に変換
		String strAge = String.valueOf(age);
		
		String strHeight = String.valueOf(height);
		
		String strWeight = String.valueOf(weight);
		
		// 出力
		System.out.println(strAge);
		System.out.println(strHeight);
		System.out.println(strWeight);
		System.out.println(strAge + strHeight + strWeight + "\r\n");
		
		
		// 問12
		System.out.println("問12");
		
		// String型を元のint型に
		int valInt1 = Integer.parseInt(strAge);
		
		// String型を元のfloat型に
		Float valFol1 = Float.parseFloat(strHeight);
		
		// float型をint型に強制型変換
		int valInt2 = (int)Math.round(valFol1);
		
		// 出力
		System.out.println(valInt1);
		System.out.println(valFol1);
		System.out.println(valInt2);
		System.out.println(valInt1 + valInt2 + "\r\n");
		
		System.out.println("問13");
		
		// 年齢が25以上か 身長が160以上であれば"true"
		boolean judge3 =(valInt1 == 25) || (valInt2 >= 160);
		
		System.out.println(judge3);
		
	}
}