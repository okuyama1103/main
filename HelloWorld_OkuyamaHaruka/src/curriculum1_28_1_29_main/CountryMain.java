package curriculum1_28_1_29_main;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import curriculum1_28_1_29_system.CountrySystem;

public class CountryMain{

	public static void main(String[] args) {
		/*
	 	
	 	0, "北海道:札幌市:83424"
		1, "青森県:青森市:9646"
		2, "岩手県:盛岡市:15275"
		3, "宮城県:仙台市:7282"
		4, "秋田県:秋田市:11638"
		5, "山形県:山形市:9323"
		6, "福島県:福島市:13784"
		7, "茨城県:水戸市:6097"
		8, "栃木県:宇都宮市:6408"
		9, "群馬県:前橋市:6362"
		10, "埼玉県:さいたま市:3798"
	 	
	 	コンソールに数字と昇順・降順の値が入力されると上記配列に対応する
	 	都道府県がソートされてコンソールに出力されるように作ってください
	   	※Packageを2つ作ってください
	   	※複数選択できるようにしてください
	   	
	   	例:
	   	8,5,9,.....
	   	と入力された場合（昇順）
	   	
	   	都道府県名：山形県
		県庁所在地：山形市
		面積：9323.0km2
	   	
	   	都道府県名：栃木県
		県庁所在地：宇都宮市
		面積：6408.0km2

	   	都道府県名：群馬県
		県庁所在地：前橋市
		面積：6362.0km2
		
		
	 */
		System.out.println("数字を入力");
		Scanner scanner = new Scanner(System.in);
		String country = scanner.nextLine();
		
		// ,で判別
		String[] number = country.split(",");
		
		System.out.println("昇順か降順を入力");

		// 昇順か降順を選択
		String array = scanner.nextLine();
		if(array.equals("昇順")){
			// 昇順
			Arrays.sort(number);
		}else {
			// 降順
			Arrays.sort(number,Collections.reverseOrder());
		}
		// Systemの情報取得
		CountrySystem nihon = new CountrySystem();
		
		// 入力された数字を判別
		for(String num : number) {
		// 判別された数字を:で区切る
		String[] capital = nihon.japan[Integer.parseInt(num)].split(":");
		System.out.println("都道府県名：" + capital[0] + "\n県庁所在地：" + capital[1] + "\n面積：" + capital[2] + "km2\n");
		}


		

	}

}
