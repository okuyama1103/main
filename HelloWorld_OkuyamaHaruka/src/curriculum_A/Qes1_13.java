package curriculum_A;
class Qes1_13 {
	public static void main (String[] args) {
		
		//問1
		
		byte a1;
		short b1;
		int c1;
		long d1;
		float e1;
		double f1;
		char g1;
		String h1;
		boolean i1;
		
		//問2
		
		a1 = 0;
		b1 = 0;
		c1 = 0;
		d1 = 0;
		e1 = 0f;
		f1 = 0.0;
		g1 = 0;
		h1 = null;
		i1 = false;
		
		//問3
		
		a1 = 10;
		b1 = 100;
		c1 = 1000;
		d1 = 10000;
		e1 = 9.5f;
		f1 = 10.5;
		g1 = 'a';
		h1 = "ハロー";
		i1 = true;
		
		//問4
		
		System.out.println(a1 + b1 + c1 + d1);
		System.out.println(2 * a1);
		System.out.println(g1 + h1 + i1);
		System.out.println(Math.round(a1 + b1 + c1 + d1 + e1 + f1));
		System.out.println(a1 * b1 * c1 * d1);
		System.out.println(f1 / 100);
		System.out.println(a1 - b1);
		
		//問5
		
		//変更箇所String型をやめてint型にした
		int num = 20;
		int num1 = 23;
		System.out.println("ハローJAVA" + (num + num1));
		
		//問6
		
		//個人情報作成
		String name1 = "山田太郎";
		int age1 = 18;
		float height1 = 170.5f;
		float weight1 = 62.2f;
		String like1 = "寿司";
		
		//代入
		System.out.println("初めまして" + name1 + "です");
		System.out.println("年齢は" + age1 + "歳です");
		System.out.println("身長は" + height1 + "cmです");
		System.out.println("体重は" + weight1 + "kgです");
		System.out.println("好きな食べ物は" + like1 + "です");
		
		//問7
		
		//身長cmを身長mに変換
		float height2 = (height1 / 100);
		//BMI = 体重kg わる 身長m^2
		double bmi1 = (weight1 / Math.pow(height2 ,  2));
		System.out.println("BMIは" + ((double)Math.round(bmi1 * 10)) /10 + "です");
		
		//問8
		
		name1 = "鈴木一郎";
		System.out.println("初めまして" + name1 + "です");
		age1 = 24;
		int age2 = age1;
		System.out.println("年齢は" + age1 + "歳です");
		height1 = 168.5f;
		float height3 = height1;
		System.out.println("身長は" + height1 + "cmです");
		weight1 = 64.2f;
		float weight2 = weight1;
		System.out.println("体重は" + weight1 + "kgです");
		like1 = "オムライス";
		System.out.println("好きな食べ物は" + like1 + "です");
		
		height2 = (height1 / 100);
		bmi1 = (weight1 / Math.pow(height2 ,  2));
		System.out.println("BMIは" + ((double)Math.round(bmi1 * 10)) /10 + "です");
		
		//問9
		
		System.out.println("初めまして" + name1 + "です");
		System.out.println("年齢は" +(age1 + age2) + "歳です");
		System.out.println("身長は" + (height1 + height3) + "cmです");
		System.out.println("体重は" + (weight1 + weight2) + "kgです");
		System.out.println("好きな食べ物は" + like1 + "です");
		
		height2 = ((height1 + height3) / 100);
		float height4 = height2;
		bmi1 = ((weight1 + weight2) / Math.pow(height4 ,  2));
		double bmi2 = bmi1;
		System.out.println("BMIは" + ((double)Math.round(bmi2 * 10)) /10 + "です");
		
		//問10
		
		boolean i2 = (age2 > 25);
		System.out.println(i2);
		
		//問11
		
		String val_str1 = String.valueOf(age2);
		String val_str2 = String.valueOf(height3);
		String val_str3 = String.valueOf(weight2);
		
		System.out.println(val_str1);
		System.out.println(val_str2);
		System.out.println(val_str3);
		System.out.println(val_str1 + val_str2 + val_str3);
		
		//問12
		
		int val_int1 = Integer.parseInt(val_str1);
		Float val_fol1 = Float.parseFloat(val_str2);
		int val_int2 = (int)Math.round(val_fol1);
		
		System.out.println(val_int1);
		System.out.println(val_fol1);
		System.out.println(val_int2);
		System.out.println(val_int1 + "," + val_int2);
		
		//問13
		
		boolean i3 =(val_int1 == 25) && (val_int2 >= 160);
		System.out.println(i3);
		
	}
}