package bitcoin.pkg1;

import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;

public class Bitcoincontroller {
	
	public String loadData(String fname) throws Exception{
		File f1 = new File("temp1.txt");
		FileWriter fw1 = new FileWriter("bitcoin2.txt");
		Scanner sc1 = new Scanner(f1);
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		List<String> list3 = new ArrayList<>();
		while (sc1.hasNext()) {
			list1.add(sc1.nextLine());
		}
		sc1.close();
		f1 = new File(fname);
		Scanner sc2 = new Scanner(f1);
		while (sc2.hasNext()) {
			String[] arr1 = sc2.nextLine().split(",");
			list2.add(arr1[0]);
			list3.add(arr1[1]);
		}
		for (int j=0;j<list1.size();j++) {
			String s2 = list1.get(j);
			for (int i=0;i<list2.size();i++) {
				String s1 = list2.get(i);
				String s3 = list3.get(i);
				if (s1.contains(s2)) {
					fw1.write(s1+","+s3+"\n");
				}
			}
		}
		fw1.close();
		return "Success";
	}
	public static void main(String[] args)throws Exception {
		Bitcoincontroller bc = new Bitcoincontroller();
		bc.loadData("bitcoin1.csv");
	}
}
