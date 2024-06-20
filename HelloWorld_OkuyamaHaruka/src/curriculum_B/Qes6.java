package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {

	public static void main(String[] args) {
		/*
		 * 家電製品を入力
		 * 家電製品に対してランダムな数字(0から11)が出力
		 */
		Scanner sc = new Scanner(System.in);
		// カンマで区切る
		String input = sc.next();
		String [] sepa = input.split("、");
		
		
		Random rand = new Random();		
		// パソコン、冷蔵庫、扇風機、洗濯機、加湿器、テレビ、ディスプレイがそれぞれ０から１１までランダムに表示される
		int pcNum = rand.nextInt(12);
		int reNum = rand.nextInt(12);
		int fanNum = rand.nextInt(12);
		int washNum = rand.nextInt(12);
		int humNum = rand.nextInt(12);
		int tvNum = rand.nextInt(12);
		int dpNum = 11 - tvNum;
		
		for (String item : sepa) {
			// それぞれの家電に対応する条件分岐
			switch(item) {
			case "パソコン":
				System.out.println(item + "の残り台数は" + pcNum + "台です");
				break;
			
			case"冷蔵庫":
				System.out.println(item + "の残り台数は" + reNum + "台です");
				break;
				
			case"扇風機":
				System.out.println(item + "の残り台数は" + fanNum + "台です");
				break;
				
			case"洗濯機":
				System.out.println(item + "の残り台数は" + washNum + "台です");
				break;
				
			case"加湿器":
				System.out.println(item + "の残り台数は" + humNum + "台です");
				break;
				
			case"テレビ":
			case"ディスプレイ":
				
				// ディスプレイの数は１１からテレビの台数の差
				String result =(item.equals("テレビ") )? "テレビの残り台数は"+ tvNum +"台です" : "ディスプレイの残り台数は" + dpNum + "台です";
				
				System.out.println(result);
				break;
			
			default:
				
				// 指定された家電製品以外が入力された場合
				System.out.println("『 " + item + " 』は指定の商品ではありません");

			}
		}
		
		sc.close();

	}

}
