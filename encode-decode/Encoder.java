package pkg1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Encoder {

	public static void main(String[] args) {
		List <String> list1 = new ArrayList<>();
		List <String> list2 = new ArrayList<>();
		Scanner sc1 = new Scanner(System.in);
		String n = sc1.nextLine();
		String name = n;
		Map <String,String> map1 = new HashMap<String,String> ();
		map1.put("a","01");
		map1.put("b","02");
		map1.put("c","03");
		map1.put("d","04");
		map1.put("e","05");
		map1.put("f","06");
		map1.put("g","07");
		map1.put("h","08");
		map1.put("i","09");
		map1.put("j","10");
		map1.put("k","11");
		map1.put("l","12");
		map1.put("m","13");
		map1.put("n","14");
		map1.put("o","15");
		map1.put("p","16");
		map1.put("q","17");
		map1.put("r","18");
		map1.put("s","19");
		map1.put("t","20");
		map1.put("u","21");
		map1.put("v","22");
		map1.put("w","23");
		map1.put("x","24");
		map1.put("y","25");
		map1.put("z","26");
		for(int i=0;i<name.length();i++) {
			char b1 = name.charAt(i);
			String b2 = String.valueOf(b1);
			list1.add(b2);
		}
		for(int i=0;i<list1.size();i++) {
			String a = map1.get(list1.get(i));
			list2.add(a);
		}
		String d = list2.toString();
		String decode = d.replace("[","").replace(", ","").replace("]","");
		System.out.println(decode);

	}
}
