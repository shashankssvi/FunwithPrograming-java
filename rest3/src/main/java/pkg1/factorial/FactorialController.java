package pkg1.factorial;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class FactorialController {
	@GetMapping("/util/app1/{num}")
	public String factorials(@PathVariable int num) {
		int result = 1;
		for(int i=num;i>0;i--) {
			result=result*i;
		}
		String s1 = num+" --> "+result;
		return s1;
	}
	
	@GetMapping("/util/app2/{num1}/{num2}")
	public List<Integer> even(@PathVariable int num1,@PathVariable int num2){
		List<Integer> list1 = new ArrayList<>();
		for(int i=num1;i<=num2;i++) {
			if(i%2==0) {
				list1.add(i);
			}
		}
		return list1;
	}
	
	@GetMapping("/util/app3")
	public String asciiValues() {
		String temp1 = "";
		for (int i=65;i<=90;i++) {
			char c1 = (char)i;
			temp1=temp1+i+" --> "+c1+"\n";
		}
		return temp1;
	}
}
