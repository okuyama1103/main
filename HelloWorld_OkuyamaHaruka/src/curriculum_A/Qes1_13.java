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
		character2 = " ";
		
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
		
		// number1～4の和
		System.out.println(number1 + number2 + number3 + number4);
		
		// number1+number1
		number1 += number1;
		System.out.println(number1);
		
		// characterとjudgeの表示
		System.out.println(character1 + " " + character2 + " " + judge);
		
		// numberすべての和(四捨五入)
		System.out.println(Math.round(number1 + number2 + number3 + number4 + number5 + number6));
		
		// number1～4の積
		System.out.println(number1 * number2 * number3 * number4);
		
		// 10.5 ÷ 100
		System.out.println(number6 / number2);
		
		// 10 - 100
		System.out.println(number1 - number2);
		
		// 問5
		
		// 変更箇所 → String型をint型に
		int num1 = 20;
		
		int num2 = 23;
		
		System.out.println("ハローJAVA" + (num1 + num2));
		
		// 問6
		
		// 個人情報作成
		String name1 = "山田太郎";
		
		int age1 = 18;
		
		float height1 = 170.5f;
		
		float weight1 = 62.2f;
		
		String like = "寿司";
		
		// 改行コードの環境依存解除
		String br = System.getProperty("line.separator");
		
		// 代入
		System.out.println("初めまして" + br + name1 + br + "です");
		
		System.out.println("年齢は" + br + age1 + br + "歳です");
		
		System.out.println("身長は" + br + height1 + br + "cmです");
		
		System.out.println("体重は" + br + weight1 + br + "kgです");
		
		System.out.println("好きな食べ物は" + br + like + br + "です");
		
		// 問7
		
		// 身長cmを身長mに単位変換
		float height2 = (height1 / 100);
		
		// BMI = 体重kg ÷ 身長m^2
		double bmi1 = (weight1 / Math.pow(height2 ,  2));
		
		//bmiを四捨五入
		double bmiRound1 =(Math.round(bmi1 * 10)) /10;
		
		System.out.println("BMIは" + br + bmiRound1 + br + "です");
		
		// 問8
		
		// 名前の再代入
		name1 = "鈴木一郎";
		
		System.out.println("初めまして" + br + name1 + br + "です");
		
		// 年齢の再代入
		age1 = 24;
				
		System.out.println("年齢は" + br + age1 + br + "歳です");
		
		// 身長の再代入
		height1 = 168.5f;
				
		System.out.println("身長は" + br + height1 + br + "cmです");
		
		// 体重の再代入
		weight1 = 64.2f;
				
		System.out.println("体重は" + br + weight1 + br + "kgです");
		
		// 好物の再代入
		like = "オムライス";
		
		System.out.println("好きな食べ物は" + br + like + br + "です");
		
		// 身長の単位変換
		height2 = (height1 / 100);
		
		// BMIの再代入
		bmi1 = (weight1 / Math.pow(height2 ,  2));
		
		double bmiRound2 = (Math.round(bmi1 * 10)) /10;
		
		System.out.println("BMIは" + br + bmiRound2 + br + "です");
		
		// 問9
		
		System.out.println("初めまして" + br + name1 + br + "です");
		
		// 問6 問8 年齢の和
		int age2 = age1;

		System.out.println("年齢は" + br +(age1 + age2) + br + "歳です");
		
		// 問6 問8 身長の和
		float height3 = height1;

		System.out.println("身長は" + br + (height1 + height3) + br + "cmです");
		
		// 問6 問8 体重の和
		float weight2 = weight1;

		System.out.println("体重は" + br + (weight1 + weight2) + br + "kgです");
		
		System.out.println("好きな食べ物は" + br + like + br + "です");
		
		// 身長の単位変換
		height2 = ((height1 + height3) / 100);
		
		// わかりやすくするために置換
		float height4 = height2;
		
		// BMI 再代入
		bmi1 = ((weight1 + weight2) / Math.pow(height4 ,  2));
		
		double bmi2 = bmi1;
		
		// 四捨五入
		double bmiRound3 = (Math.round(bmi2 * 10)) /10;
		
		System.out.println("BMIは" + br + bmiRound3 + br + "です");
		
		// 問10
		
		// 年齢が25以上であれば "true"
		boolean judge2 = (age2 >= 25);
		
		System.out.println(judge2);
		
		// 問11
		
		// int型 float型をSring型に変換
		String valStr1 = String.valueOf(age2);
		
		String valStr2 = String.valueOf(height3);
		
		String valStr3 = String.valueOf(weight2);
		
		System.out.println(valStr1);
		
		System.out.println(valStr2);
		
		System.out.println(valStr3);
		
		System.out.println(valStr1 + br + valStr2 + br + valStr3);
		
		// 問12
		
		// String型を元のint型に
		int valInt1 = Integer.parseInt(valStr1);
		
		// String型を元のfloat型に
		Float valFol1 = Float.parseFloat(valStr2);
		
		// float型をint型に強制型変換
		int valInt2 = (int)Math.round(valFol1);
		
		System.out.println(valInt1);
		
		System.out.println(valFol1);
		
		System.out.println(valInt2);
		
		System.out.println(valInt1 + br+ valInt2);
		
		// 問13
		
		// 年齢が25以上か 身長が160以上であれば"true"
		boolean judge3 =(valInt1 == 25) || (valInt2 >= 160);
		
		System.out.println(judge3);
		
	}
}