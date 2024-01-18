package pkg2.univ1;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UnivController {
	public ArrayList<String> loadData(String fname) throws Exception{
		ArrayList<String> list1 = new ArrayList<>();
		
		File f1 = new File(fname);
		Scanner sc1 = new Scanner(f1);
		while(sc1.hasNext()) {
			list1.add(sc1.nextLine());
		}
		return list1;
	
	}
	
	@Autowired
	UnivRepo univRepo;
	@PostMapping("/addUniv")
	public String addUniv() throws Exception{
		ArrayList<String> list1 = new ArrayList<>();
		list1=loadData("univIndia.txt");
		List<UnivEntity> records = new ArrayList<>();
		for(int i=0;i<list1.size();i++) {
			records = list1.get(i).lines().map(data -> new UnivEntity(data)).collect(Collectors.toList());
			univRepo.saveAll(records);
		}
		return "inserted successfully";
	}
	
}
