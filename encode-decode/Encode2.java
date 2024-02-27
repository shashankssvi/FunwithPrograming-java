package pkg1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Encode2 {

	public static void main(String[] args) {
		List <String> list1 = new ArrayList<>();
		List <String> list2 = new ArrayList<>();
		Scanner sc1 = new Scanner(System.in);
		String n = sc1.nextLine();
		String name = n;
		for(int i=0;i<name.length();i++) {
			char b1 = name.charAt(i);
			int b2 = (int)b1;
			String b3 = String.valueOf(b2);
			list1.add(b3);
		}
		for(int i=0;i<list1.size();i++) {
			String a1 = list1.get(i);
			int a2 = Integer.parseInt(a1);
			char a3 = (char)a2;
			String a4 = String.valueOf(a3);
			list2.add(a4);
			}
		String d = list1.toString();
		String d1 = list2.toString();
		String decode = d.replace("[","").replace(", ","").replace("]","");
		System.out.println(decode);
		String encode = d1.replace("[","").replace(", ","").replace("]","");
		System.out.println(encode);
	}
}
