package pkg1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Encode1 {

	public static void main(String[] args) {
		List <String> list1 = new ArrayList<>();
		List <String> list2 = new ArrayList<>();
		List <String> list5 = new ArrayList<>();
		Scanner sc1 = new Scanner(System.in);
		String n = sc1.nextLine();
		String name = n;
		String[] list3 = {"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32","33","34","35","36","37","38","39","40","41","42","43","44","45","46","47","48","49","50","51","52"};
		String[] list4 = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		for(int i=0;i<name.length();i++) {
			char b1 = name.charAt(i);
			String b2 = String.valueOf(b1);
			list1.add(b2);
		}
		for(int j=0;j<list1.size();j++) {
			for(int i=0;i<list4.length;i++) {
				if(list1.get(j).equals(list4[i])){
					String s = list1.get(j).replace(list4[i],list3[i]);
					list2.add(s);
				}
			}
		}
		for(int j=0;j<list2.size();j++) {
			for(int i=0;i<list3.length;i++) {
				if(list2.get(j).equals(list3[i])){
					String s = list2.get(j).replace(list3[i],list4[i]);
					list5.add(s);
				}
			}
		}
		String d = list2.toString();
		String d1 = list5.toString();
		String decode = d.replace("[","").replace(", ","").replace("]","");
		System.out.println(decode);
		String encode = d1.replace("[","").replace(", ","").replace("]","");
		System.out.println(encode);
		
	}
}
